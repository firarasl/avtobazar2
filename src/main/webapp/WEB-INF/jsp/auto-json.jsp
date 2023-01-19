<%@ page import="com.google.gson.Gson" %>
<%@ page import="az.autobazar.domain.DataTableResult" %>
<%@ page contentType="application/json;charset=UTF-8" language="java" %>
<%
    Gson gson = new Gson();

    DataTableResult dataTableResult = (DataTableResult) request.getAttribute("dataTableResult");

    String json = gson.toJson(dataTableResult);
    out.print(json);
%>
