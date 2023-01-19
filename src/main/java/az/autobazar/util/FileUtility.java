package az.autobazar.util;

import javax.servlet.http.Part;

public class FileUtility {

    public static String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    public static String getFileExtension(String file) {
        String extension = "";
        if(file != null ) {
            int pos = file.lastIndexOf(".");
            if (pos > 0) {
                extension = file.substring(pos);
            }
        }

        return extension;
    }
}
