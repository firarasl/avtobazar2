<%--
  Created by IntelliJ IDEA.
  User: vuqar
  Date: 8/12/2019
  Time: 11:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <jsp:include page="meta.jsp"/>
    <title>Dashboard</title>
    <jsp:include page="css.jsp"/>
</head>

<body class="fixed-navbar">
<div class="page-wrapper">
    <jsp:include page="header.jsp"/>
    <jsp:include page="sidebar.jsp"/>
    <div class="content-wrapper">
        <!-- START PAGE CONTENT-->
        <div class="page-content fade-in-up ">
            <div class="row">
                <div class="col-lg-3 col-md-6">
                    <div class="ibox bg-success color-white widget-stat">
                        <div class="ibox-body">
                            <h2 class="m-b-5 font-strong">201</h2>
                            <div class="m-b-5">User Count</div>
                            <i class="fa fa-user widget-stat-icon"></i>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="ibox bg-info color-white widget-stat">
                        <div class="ibox-body">
                            <h2 class="m-b-5 font-strong">1250</h2>
                            <div class="m-b-5">Saloon Count</div>
                            <i class="fa fa-home widget-stat-icon"></i>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="ibox bg-warning color-white widget-stat">
                        <div class="ibox-body">
                            <h2 class="m-b-5 font-strong">1570</h2>
                            <div class="m-b-5">Advertisement</div>
                            <i class="fa fa-telegram widget-stat-icon"></i>
                        </div>
                    </div>
                </div>
<%--                <div class="col-lg-3 col-md-6">--%>
<%--                    <div class="ibox bg-danger color-white widget-stat">--%>
<%--                        <div class="ibox-body">--%>
<%--                            <h2 class="m-b-5 font-strong">108</h2>--%>
<%--                            <div class="m-b-5">NEW USERS</div>--%>
<%--                            <i class="fa fa-sitemap widget-stat-icon"></i>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="ibox">
                        <div class="ibox-head">
                            <div class="ibox-title">Advertisement Count</div>
                        </div>
                        <div class="ibox-body">
                            <div>
                                <canvas id="line_chart" style="height:200px;"></canvas>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- END PAGE CONTENT-->
        <jsp:include page="footer.jsp"/>
    </div>
</div>
<jsp:include page="js.jsp"/>
</body>

</html>