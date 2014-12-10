<%-- 
    Document   : test
    Created on : Dec 6, 2014, 10:00:42 AM
    Author     : NeedMoney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.aptech.elevation.entity.Product"%>
<%@page import="java.util.List"%>
<%
List<Product> list=(List<Product>)session.getAttribute("products");

%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>hello</h1>
<c:forEach var="p" items="list">
    ${p.productName}---
</c:forEach>