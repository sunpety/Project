<%-- 
    Document   : my-account
    Created on : Dec 7, 2014, 4:50:08 AM
    Author     : NeedMoney
--%>
<%
    if(session.getAttribute("username") == null)
    {
       response.sendRedirect("index.jsp");
    }
%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        		<!-- START Page title -->
		<div class="grid_12 pageTitle">
			<h1>My Account<span class="info">// A look at what's inside</span></h1>
		</div>
		<!-- END Page title -->

		<!-- START Main content -->
		<div id="PageWrapper" class="grid_12 clearfix">
				
				<div id="tabs1" class="tabsMinimal">
				    <ul class="nav clearfix">
						<li class="nav"><a href="#one" class="active">Order History</a></li>
						<li class="nav"><a href="#two">Infomation</a></li>
						<li class="nav last"><a href="#three">Template</a></li>
				    </ul>
					<div class="clear"></div>
					<div class="tabContent">
						<div id="one">
											<table class="dark">
					<colgroup>
						<col span="4" />
					</colgroup>
					<thead>
						<tr>
							<th>Table head</th>
							<th>Table head</th>
							<th>Table head</th>
							<th>Table head</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
						</tr>
						<tr>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
						</tr>
						<tr>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
						</tr>
						<tr>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
						</tr>
						<tr>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
							<td>Lorem ipsum</td>
						</tr>
					</tbody>
				</table>
                                                </div>

						<div id="two" class="hide">
							<p><img src="images/examples/thumbnail_image.jpg" alt="" class="imgRight" />Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
						</div>

						<div id="three" class="hide">
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus iaculis diam eget justo mollis pellentesque. Ut consectetur velit enim.</p>
						</div>
					</div>
				</div>

			
			<!-- END Main content -->
			
		</div>
		<!-- END Main Content  -->
		