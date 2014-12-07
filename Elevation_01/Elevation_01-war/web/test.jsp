<%-- 
    Document   : test
    Created on : Dec 6, 2014, 10:00:42 AM
    Author     : NeedMoney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<h1>Hello</h1>
<c:forEach var="a" items="${accounts}">
    <br>${a.accountUsername}
    
</c:forEach>