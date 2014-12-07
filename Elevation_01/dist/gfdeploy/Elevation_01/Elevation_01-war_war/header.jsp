<%-- 
    Document   : header
    Created on : Dec 5, 2014, 12:20:55 AM
    Author     : NeedMoney
--%>

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
							<li><a href="?page=about-us">About</a>
								<ul class="dropMenu">
									<li><a href="shortcodes.html">Shortcodes</a></li>
									<li><a href="typography.html">Typography</a></li>
									<li><a href="left_sidebar.html">Left sidebar</a></li>
									<li><a href="right_sidebar.html">Right sidebar</a></li>
									<li><a href="two_sidebars.html">Two sidebars</a></li>
									<li><a href="full_width.html">Full width</a></li>
									<li><a href="faq.html">FAQ</a></li>
									<li><a href="error.html">Error page</a></li>
									<li><a href="grid.html">Columns</a></li>
								</ul>
							</li>
							<li><a href="">Services</a></li>
							<li><a href="?page=category">Product</a>
								<ul class="dropMenu">
									<li><a href="?page=product-detail">Product</a></li>
									<li><a href="two_columns.html">Two columns</a></li>
									<li><a href="four_columns.html">Four columns</a></li>
									<li><a href="project_details.html">Project details</a></li>
									<li class="nest"><a href="#">A second dropdown</a>
										<ul>
											<li><a href="#">Another page</a></li>
											<li><a href="#">Another page</a></li>
											<li><a href="#">Another page</a></li>
										</ul>
									</li>
								</ul>
							</li>
							<li><a href="?page=news">News</a></li>
							<li><a href="?page=contact-us">Contact</a></li>
                                                        <li><input type="text" name="search" placeholder="Search...." /><button type="submit" class="button">Submit</button> </li>
                                                        <%String username=(String)session.getAttribute("username");
                                                            if(username != null)
                                                            {%>
                                                        <li><a href="?page=my-account">Hello <%= username %></a></li>
                                                        <li><a href="AccountServlet?action=logout" onclick="return confirm('Are you sure?')" >Logout</a></li>
                                                            <%}
                                                            else{%>
                                                        <li><a href="?page=login-register">Login or Register</a></li>
                                                        <%}%>
                                                </ul>
					</nav>
					<!-- END Menu -->				
				</div>