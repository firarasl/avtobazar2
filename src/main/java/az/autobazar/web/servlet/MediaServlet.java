package az.autobazar.web.servlet;

import az.autobazar.domain.Media;
import az.autobazar.repository.impl.AutoRepositoryImpl;
import az.autobazar.service.AutoService;
import az.autobazar.util.ServiceUtil;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@WebServlet(name = "MediaServlet", urlPatterns = "/media")
public class MediaServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(MediaServlet.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("id") != null) {
            long id = 0;
            try {
                id = Long.parseLong(request.getParameter("id"));
                AutoService autoService = ServiceUtil.getAutoService(getServletContext());
                Optional<Media> optionalMedia = autoService.getMediaById(id);
                if (optionalMedia.isPresent()) {
                    Media media = optionalMedia.get();
                    response.setContentType(media.getContentType());
                    Path path = Paths.get(media.getFileName());
                    Files.copy(path, response.getOutputStream());
                } else {
                    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                }
            }catch (Exception e) {
                logger.error("Error getting media by id " + id, e);
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            }
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}
