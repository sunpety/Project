<%-- 
    Document   : category
    Created on : Dec 5, 2014, 4:39:30 AM
    Author     : NeedMoney
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

		<!-- START Page title -->
		<div class="grid_12 pageTitle">
			<h1>Portfolio <span class="info">// One column for the portfolio</span></h1>
		</div>
		<!-- END Page title -->
		
		<!-- START Main Content -->
		<div id="PageWrapper" class="grid_12 clearfix">			
			<ul class="portfolio singleColumnPortfolio">
                            <c:forEach var="p" items="${products}">
				<li class="main clearfix">
					<div class="grid_4 alpha">
						<h4>${p.productName}</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Tempor incididunt ut labore et dolore magna aliqua.</p>
						<h5>Services provided</h5>
						<ul class="squareList">
							<li>User interface Design</li>
							<li>HTML5/CSS3</li>
							<li>Responsive web design</li>
							<li>Testing</li>
						</ul>
						<a href="#">read more &rarr;</a>
					</div>
					<div class="image grid_8 omega">
						<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/wide_image.jpg" alt=""  /></a>
					</div>
				</li>
			</c:forEach>
				
			</ul><!-- END Portfolio -->			
			
		</div><!-- END Main Content -->