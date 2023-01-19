<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 8/24/19
  Time: 6:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Media Servlet</title>
</head>
<body>
    <h2>Add media to auto</h2>
    <c:if test="${not empty requestScope.message}">
        ${requestScope.message}
    </c:if>

    <form method="post" enctype="multipart/form-data" action="upload-media">
        Auto id: <input type="number" name="auto_id"> <br/>
        File1: <input type="file" name="file1"> <br/>
        File2: <input type="file" name="file2"> <br/>
        File3: <input type="file" name="file3"> <br/>
        File4: <input type="file" name="file4"> <br/>
        File5: <input type="file" name="file5"> <br/>
        <input type="submit" value="Upload">
    </form>
</body>
</html>
