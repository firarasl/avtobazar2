<%--
  Created by IntelliJ IDEA.
  User: vuqar
  Date: 8/11/2019
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- CORE PLUGINS-->
<script src="assets/vendors/jquery/dist/jquery.min.js" type="text/javascript"></script>
<script src="assets/vendors/popper.js/dist/umd/popper.min.js" type="text/javascript"></script>
<script src="assets/vendors/bootstrap/dist/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/vendors/metisMenu/dist/metisMenu.min.js" type="text/javascript"></script>
<script src="assets/vendors/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<!-- PAGE LEVEL PLUGINS-->
<script src="assets/vendors/DataTables/datatables.min.js" type="text/javascript"></script>
<script src="assets/vendors/select2/dist/js/select2.full.min.js" type="text/javascript"></script>
<script src="assets/vendors/jquery-knob/dist/jquery.knob.min.js" type="text/javascript"></script>
<script src="assets/vendors/moment/min/moment.min.js" type="text/javascript"></script>
<script src="assets/vendors/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
<script src="assets/vendors/bootstrap-timepicker/js/bootstrap-timepicker.min.js" type="text/javascript"></script>
<script src="assets/vendors/jquery-minicolors/jquery.minicolors.min.js" type="text/javascript"></script>
<script src="assets/vendors/chart.js/dist/Chart.min.js" type="text/javascript"></script>
<script src="assets/vendors/jvectormap/jquery-jvectormap-2.0.3.min.js" type="text/javascript"></script>
<script src="assets/vendors/jvectormap/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
<script src="assets/vendors/jvectormap/jquery-jvectormap-us-aea-en.js" type="text/javascript"></script>
<script src="assets/vendors/chart.js/dist/Chart.min.js" type="text/javascript"></script>
<!-- CORE SCRIPTS-->
<script src="assets/js/app.min.js" type="text/javascript"></script>
<!-- PAGE LEVEL SCRIPTS-->
<script src="assets/js/scripts/form-plugins.js" type="text/javascript"></script>
<script src="./assets/js/scripts/chartjs_demo.js" type="text/javascript"></script>
<script type="text/javascript">
    $(function () {
        $('#example-table').DataTable({
            pageLength: 10,
            //"ajax": './assets/demo/data/table_data.json',
            /*"columns": [
                { "data": "name" },
                { "data": "office" },
                { "data": "extn" },
                { "data": "start_date" },
                { "data": "salary" }
            ]*/
        });
    })
</script>