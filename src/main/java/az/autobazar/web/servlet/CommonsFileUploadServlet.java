package az.autobazar.web.servlet;

import az.autobazar.util.FileUtility;
import az.autobazar.util.SecurityUtil;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@MultipartConfig
@WebServlet(name = "CommonsFileUploadServlet", value = "/upload2")
public class CommonsFileUploadServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (ServletFileUpload.isMultipartContent(request)) {

            // Create a factory for disk-based file items
            DiskFileItemFactory factory = new DiskFileItemFactory();
            File repository = (File) getServletContext().getAttribute("javax.servlet.context.tempdir");
            factory.setRepository(repository);

// Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);

            try {
                List<FileItem> fileItems = upload.parseRequest(request);

                for (FileItem item : fileItems) {
                    if (item.isFormField()) {
                        String name = item.getFieldName();
                        String value = item.getString();
                        System.out.println(name + " = " + value);
                    } else {
                        System.out.println("name = " + item.getName());
                        System.out.println("size = " + item.getSize());
                        System.out.println("content type = " + item.getContentType());
                        String newName = "/home/student/IdeaProjects/autobazar2/upload/" + SecurityUtil.generateToken() + FileUtility.getFileExtension(item.getName());
                        Path file = Paths.get(newName);
                        Files.copy(item.getInputStream(), file, StandardCopyOption.REPLACE_EXISTING);
                    }
                }

            } catch (FileUploadException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("no file upload");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
