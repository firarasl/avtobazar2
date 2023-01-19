package az.autobazar.web.servlet;

import az.autobazar.domain.Media;
import az.autobazar.service.AutoService;
import az.autobazar.util.FileUtility;
import az.autobazar.util.SecurityUtil;
import az.autobazar.util.ServiceUtil;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@MultipartConfig()
@WebServlet(name = "UploadServlet", value = "/upload-media")
public class UploadServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(UploadServlet.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("UploadServlet post request");

        long autoId = Long.parseLong(request.getParameter("auto_id"));
        System.out.println("autoId = " + autoId);
        List<Media> mediaList = new ArrayList<>();

        request.getParts()
                .stream()
                .filter(part -> part.getSize() > 0 && part.getContentType() != null)
                .forEach(part -> {
                    try {
                        Media media = new Media();
                        media.setAutoId(autoId);
                        media.setOriginalFileName(FileUtility.getFileName(part));
                        media.setContentType(part.getContentType());
                        media.setLength(part.getSize());
                        media.setMobile(false);
                        media.setVideo(false);
                        media.setMain(false);
                        media.setInputStream(part.getInputStream());
                        mediaList.add(media);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                });

        try {
            AutoService autoService = ServiceUtil.getAutoService(getServletContext());
            mediaList.forEach(media -> autoService.addMedia(media));
            request.setAttribute("message", "Yukleme ugurla basa catdi");
            request.getRequestDispatcher("media.jsp").forward(request, response);
        } catch (Exception e) {
            logger.error("Error uploading media ", e);
            String message = "Yukleme zamani xeta bas verdi! Zehmet olmasa, tekrar cehd edin!";
            request.setAttribute("message", message);
            request.getRequestDispatcher("media.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}

