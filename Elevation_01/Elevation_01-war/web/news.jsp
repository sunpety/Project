<%-- 
    Document   : news
    Created on : Dec 5, 2014, 3:57:56 AM
    Author     : NeedMoney
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

		<!-- START Page title -->
		<div class="grid_12 pageTitle">
			<h1>Portfolio <span class="info">// Four columns to showcase our work</span></h1>
		</div>
		<!-- END Page title -->
		
		<!-- START Main content -->
		<div id="PageWrapper" class="grid_12 clearfix">
			
			<p class="filterLabel">Filter:</p>
			<ul class="filter">
				<li class="current all"><a href="#">All</a></li>
				<li class="web"><a href="#">Web design</a></li>
				<li class="print"><a href="#">Print</a></li>
				<li class="multimedia"><a href="#">Multimedia</a></li>
				<li class="ror"><a href="#">Ruby on Rails</a></li>
			</ul>
			<div class="clear"></div>
			
			<!-- START Portfolio -->
			<ul class="portfolio clearfix">
                            <c:forEach var="n" items="${news}">
				<li data-id="id-1" data-type="web" class="grid_3 alpha">
                                    <a class="colorbox" href="${n.newTitle}" title="${n.newTitle}"><img width="220px" height="128px" class="project" src="${n.newTitle}" alt="${n.newTitle}" /></a>
					<div class="projectInfo">
						<h5>${n.newTitle}</h5>
						<p>${n.newConten}</p>
                                                <a href="index.jsp?page=news_content&news_id=${n.newId}">read more &rarr;</a>
					</div>
				</li>
                                </c:forEach>
				
			</ul><!-- END portfolio -->
			
			<div class="pagination">
				<a href="#">&laquo;</a>
				<span class="current">1</span>
				<a href="#">2</a>
				<a href="#">3</a>
				<a href="#">4</a>
				<a href="#">5</a>
				<a href="#">&raquo;</a>
			</div>
		</div>
		<!-- END Main content -->