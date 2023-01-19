<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 7/23/19
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Auto List</title>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
    <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
</head>
<body>

    <c:choose>
        <c:when test="${not empty requestScope.autoList}">
            <h2>Cari elanlarin sayi: ${fn:length(requestScope.autoList)}</h2>

            <table id="auto-table" border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Tarix</th>
                        <th>Marka</th>
                        <th>Model</th>
                        <th>Qiymet</th>
                        <th>Satici</th>
                        <th>Telefon</th>
                        <th>Emeliyyatlar</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${requestScope.autoList}" var="auto">
                    <tr>
                        <td>${auto.id}</td>
                        <td>${auto.publishDate}</td>
                        <td>${auto.brand}</td>
                        <td>${auto.model}</td>
                        <td>${auto.price}</td>
                        <td>${auto.seller}</td>
                        <td>${auto.contactNo}</td>
                        <td>
                            <a href="cs?action=viewAutoById&id=${auto.id}">View Auto Details</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
                <tfoot>
                <tr>
                    <th>ID</th>
                    <th>Tarix</th>
                    <th>Marka</th>
                    <th>Model</th>
                    <th>Qiymet</th>
                    <th>Satici</th>
                    <th>Telefon</th>
                    <th>Emeliyyatlar</th>
                </tr>
                </tfoot>
            </table>
        </c:when>
        <c:otherwise>
            Elan yoxdur!
        </c:otherwise>
    </c:choose>

<script>
    $(document).ready(function () {
        $('#auto-table').DataTable({
            "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]]
        });
    });
</script>
</body>
</html>
