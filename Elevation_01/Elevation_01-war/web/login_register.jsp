<%-- 
    Document   : login_register
    Created on : Dec 5, 2014, 2:44:37 AM
    Author     : NeedMoney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
		<!-- START Page title -->
		<div class="grid_12 pageTitle">
			<h1>Account <span class="info">// A look at what's inside</span></h1>
		</div>
		<!-- END Page title -->
<div id="PageWrapper" class="grid_12 clearfix">
			<div class="grid_8 alpha">	
				<div id="tabs2" class="tabsBoxed">
				    <ul class="nav clearfix">
						<li class="nav"><a href="#login" class="active">Existing Customers</a></li>
						<li class="nav"><a href="#register">New Customer Sign Up</a></li>
				    </ul>
					<div class="clear"></div>
					<div class="tabContent">
						<div id="login">
							<div id="contact">
									<div id="message"></div>
									<br />
									<form method="post" action="" name="contactform" id="contactform">
										<div class="sep">
											<label for="name" class="txt" accesskey="U">Username</label>
											<input name="username" type="text" size="30" value="" />
										</div>
							
										<div class="sep">
											<label for="email" class="txt" accesskey="E">Password</label>
											<input name="password" type="password" size="30" value="" />
										</div>
										
										<div class="sep">
											<label for="email" class="txt" accesskey="E">&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<span>Forgot your password?</span>
										</div>
										
										<div class="buttonAlign">
											<button type="submit" class="button mediumButton" id="submit">Submit</button>
											<button type="reset" class="button mediumButton" id="submit">Reset</button>
										</div>
									</form>
							</div>						
						</div>

						<div id="register" class="hide">
							<div id="contact">
									<div id="message"></div>
									<br />
									<form method="get" action="action.php?" name="contactform" id="contactform">
										<div class="sep">
											<label class="txt" accesskey="U">Username <font color="#ff6d3a">(*)</font></label>
											<input name="username" type="text" size="30" value="" />
										</div>
							
										<div class="sep">
											<label class="txt" accesskey="E">Password <font color="#ff6d3a">(*)</font></label>
											<input name="password" type="password" size="30" value="" />
										</div>
										<div class="sep">
											<label class="txt" accesskey="E">Password Confirm <font color="#ff6d3a">(*)</font></label>
											<input name="password_confirm" type="password" size="30" value="" />
										</div>
										<div class="sep">
											<label class="txt" accesskey="U">First Name <font color="#ff6d3a">(*)</font></label>
											<input name="firstname" type="text" size="30" value="" />
										</div>
							
										<div class="sep">
											<label class="txt" accesskey="E">Last Name <font color="#ff6d3a">(*)</font></label>
											<input name="lastname" type="text" size="30" value="" />
										</div>
										<div class="sep">
											<label class="txt" accesskey="E">Company</label>
											<input name="company" type="text" size="30" value="" />
										</div>
										<div class="sep">
											<label class="txt" accesskey="U">Address <font color="#ff6d3a">(*)</font></label>
											<input name="address1" type="text" size="30" value="" />
										</div>
							
										<div class="sep">
											<label class="txt" accesskey="E">Address2</label>
											<input name="address2" type="text" size="30" value="" />
										</div>										
										<div class="sep">
											<label class="txt" accesskey="U">City <font color="#ff6d3a">(*)</font></label>
											<input name="city" type="text" size="30" value="" />
										</div>
							
										<div class="sep">
											<label class="txt" accesskey="E">States <font color="#ff6d3a">(*)</font></label>
											<input name="states" type="text" size="30" value="" />
										</div>		
										<div class="sep">
											<label class="txt" accesskey="E">Zipcode <font color="#ff6d3a">(*)</font></label>
											<input name="zipcode" type="text" size="30" value="" />
										</div>										
										
										<div class="sep">
											<label class="txt" accesskey="E">Country <font color="#ff6d3a">(*)</font></label>
											<input name="country" type="text" size="30" value="" />
										</div>					
										
										<div class="sep">
											<label class="txt" accesskey="E">Phone Number <font color="#ff6d3a">(*)</font></label>
											<input name="phone_number" type="text" size="30" value="" />
										</div>			
										<div class="sep">
											<label class="txt" accesskey="E">Email <font color="#ff6d3a">(*)</font></label>
											<input name="email" type="text" size="30" value="" />
										</div>					
										<div class="buttonAlign">
											<button type="submit" class="button mediumButton" id="submit">Submit</button>
											<button type="reset" class="button mediumButton" id="submit">Reset</button>
										</div>
									</form>
							</div>
						</div>
					</div>
				</div>
	</div>
			<!-- END Sidebar -->
		</div>
