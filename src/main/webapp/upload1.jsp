<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 8/20/19
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servlet File Upload Demo</title>
</head>
<body>
    <h2>Servlet File Upload Demo</h2>
    <form method="post" action="upload1" enctype="multipart/form-data">
        Ad: <input type="text" name="name"> <br/>
        Soyad: <input type="text" name="surname"> <br/>
        File1: <input type="file" name="file1" accept="*.jpg,*.png,*.jpeg"> <br/>
        File2: <input type="file" name="file2" accept="*.xls,*.xlsx,*.doc,*.docx"><br/>
        File3: <input type="file" name="file3"><br/>
        <input type="submit" value="Upload">
    </form>
</body>
</html>
