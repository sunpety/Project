<%-- 
    Document   : header
    Created on : Dec 5, 2014, 12:20:55 AM
    Author     : NeedMoney
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

				<div class="grid_12 clearfix">
					<!-- START Logo -->
					<div id="Logo">
						<a href="index.jsp"><img src="images/logo.png" alt="My Company name" /></a>
					</div>
					<!-- END Logo -->
					
					<!-- START Menu -->
					<nav id="MenuBar" class="grid_8 omega floatRight">
						<ul class="navList clearfix">
							<li><a class="selected" href="index.jsp">Home</a></li>
							<li><a href="index.jsp?page=about-us">About</a>
								<ul class="dropMenu">
                                                                    <c:forEach var="n" items="${news_type}">
									<li><a href="?page=news_content&news_id=${n.newId}">${n.newTitle}</a></li>
                                                                    </c:forEach>    
								</ul>
							</li>
							<li><a href="#">Services</a></li>
							<li><a href="#">Product</a>
								<ul class="dropMenu">
                                                                    <c:forEach var="c" items="${categorys}">
									<li><a href="?page=category&category_id=${c.categoryId}">${c.categoryName}</a></li>
                                                                    </c:forEach>    
								</ul>
							</li>
							<li><a href="index.jsp?page=news">News</a></li>
							<li><a href="index.jsp?page=contact-us">Contact</a></li>
                                                        <li><input type="text" name="search" placeholder="Search...." /><button type="submit" class="button">Submit</button> </li>
                                                        <%String username=(String)session.getAttribute("username");
                                                            if(username != null)
                                                            {%>
                                                        <li><a href="index.jsp?page=my-account">Hello <%= username %></a></li>
                                                        <li><a href="AccountServlet?action=logout" onclick="return confirm('Are you sure?')" >Logout</a></li>
                                                            <%}
                                                            else{%>
                                                        <li><a href="index.jsp?page=login-register">Login or Register</a></li>
                                                        <%}%>
                                                </ul>
					</nav>
					<!-- END Menu -->				
				</div>