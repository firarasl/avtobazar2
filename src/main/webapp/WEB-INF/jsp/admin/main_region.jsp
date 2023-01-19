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
    <title>Main Region</title>
    <jsp:include page="css.jsp"/>
</head>

<body class="fixed-navbar">
<div class="page-wrapper">
    <jsp:include page="header.jsp"/>
    <jsp:include page="sidebar.jsp"/>
    <div class="content-wrapper">
        <!-- START PAGE CONTENT-->
        <div class="page-heading">
            <h1 class="page-title">Main Region</h1>
            <ol class="breadcrumb">
                <li class="breadcrumb-item">
                    <a href="index.html"><i class="la la-home font-20"></i></a>
                </li>

            </ol>
        </div>
        <div class="page-content fade-in-up" style="margin-bottom: 10px">
            <div class="ibox">
                <div class="ibox-head">
                    <div class="ibox-title"><i class="ti-search"></i> Search</div>
                    <div class="ibox-tools">
                        <a class="ibox-collapse"><i class="fa fa-minus"></i></a>
                     </div>
                </div>
                <div class="ibox-body">
                    <div class="row">
                        <div class="col-sm-3 form-group">
                            <label>Name</label>
                            <input class="form-control" type="text" placeholder="Name"><br>
                         </div>
                        <div class="col-sm-4 form-group" id="date_5">
                            <label class="font-normal">Insert Date</label>
                            <div class="input-daterange input-group" id="datepicker1">
                                <input class="input-sm form-control" type="text" name="start" value="04/12/2017">
                                <span class="input-group-addon p-l-10 p-r-10">to</span>
                                <input class="input-sm form-control" type="text" name="end" value="08/17/2018">
                            </div>
                        </div>
                        <div class="col-sm-4 form-group" id="date_5">
                            <label class="font-normal">Update Date</label>
                            <div class="input-daterange input-group" id="datepicker2">
                                <input class="input-sm form-control" type="text" name="start" value="04/12/2017">
                                <span class="input-group-addon p-l-10 p-r-10">to</span>
                                <input class="input-sm form-control" type="text" name="end" value="08/17/2018">
                            </div>
                         </div>
                        <div class="col-sm-1 form-group">
                            <br>
                            <button class="btn btn-info btn-circle btn-lg" style="font-size: 12px"><i
                                    class="fa fa-plus"></i> Add
                            </button>
                        </div>
                        <div class="col-sm-1 form-group">
                            <button class="btn btn-outline-info"><i class="fa fa-search"></i> Search</button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="ibox">
                <div class="ibox-head">
                    <div class="ibox-title">Data Table</div>
                </div>
                <div class="ibox-body">
                    <table class="table table-striped table-bordered table-hover" id="example-table" cellspacing="0"
                           width="100%">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Insert Date</th>
                            <th>Update Date</th>
                            <th>Action</th>
                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>Name</th>
                            <th>Insert Date</th>
                            <th>Update Date</th>
                            <th>Action</th>
                        </tr>
                        </tfoot>
                        <tbody>

                        </tbody>
                    </table>
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