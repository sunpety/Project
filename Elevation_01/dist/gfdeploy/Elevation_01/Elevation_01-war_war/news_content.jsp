<%-- 
    Document   : news_content
    Created on : Dec 5, 2014, 4:14:02 AM
    Author     : NeedMoney
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- START Page title -->
<div class="grid_12 pageTitle">
    <h1><%= request.getAttribute("title")%> <span class="info">// Lorem ipsum dolor sit amet</span></h1>
</div>
<!-- END Page title -->

<!-- START Main content -->
<div id="PageWrapper" class="grid_12 clearfix">
    <!-- START Main column -->
    <div class="grid_8 alpha">
        <div class="separator"></div>
        <%= request.getAttribute("content")%>

    </div>
    <!-- END Main column -->

    <!-- START Sidebar -->
    <div class="grid_4 omega clearfix">	
        <h4>Tags</h4>
        <ul class="tags clearfix">
            <c:forEach var="t" items="${typeall}">
                <li><a href="">${t.newTitle}</a></li>
                </c:forEach>
        </ul>
        <br/>

        <h4>Events</h4>
        <ul class="events">
            <li class="clearfix">
                <div class="date">
                    <span class="day">22</span>
                    <span class="month">Nov</span>
                </div>
                <div class="info">
                    <h5>Event name</h5>
                    <p>Lorem ipsum dolor sit amet...</p>
                </div>
            </li>
            <li class="clearfix">
                <div class="date">
                    <span class="day">22</span>
                    <span class="month">Nov</span>
                </div>
                <div class="info">
                    <h5>Another event</h5>
                    <p>Consectetur adipisicing elitt...</p>
                </div>
            </li>
        </ul>
        <br/>

        <h4>Features</h4>
        <ul class="squareList sideLinks">
            <li><a href="typography.html">Typography</a></li>
            <li><a href="shortcodes.html">Shortcodes</a></li>
            <li><a href="full_width.html">Full width</a></li>
            <li><a href="left_sidebar.html">Left sidebar</a></li>
            <li><a href="right_sidebar.html" class="active">Right sidebar</a></li>
            <li><a href="two_sidebars.html">Two sidebars</a></li>
            <li><a href="faq.html">FAQ</a></li>
            <li><a href="grid.html">Columns</a></li>
        </ul>			
    </div>
    <!-- END Sidebar -->
    <span class="dtstart">Date: <fmt:formatDate value="${requestScope.date}" timeZone="mm/dd/yyyy" /></span>
</div>
<!-- END Main content -->