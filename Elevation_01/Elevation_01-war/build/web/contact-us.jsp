<%-- 
    Document   : contact-us
    Created on : Dec 5, 2014, 4:53:12 AM
    Author     : NeedMoney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

		<!-- START Page title -->
		<div class="grid_12 pageTitle">
			<h1>Contact <span class="info">// Get in thouch with us</span></h1>
		</div>
		<!-- END Page title -->
		
		<!-- START Main Content -->
		<div id="PageWrapper" class="grid_12 clearfix">
			<div class="contactMap">
                <div id="map_canvas" data-lat="51.513967" data-long="-0.153681" data-address="London, UK" style="height:260px;width:100%;"></div>
			</div>
						
			<!-- START Main Column -->
			<div class="grid_8 alpha">
				<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident.</p>
				<!-- START Contact form -->
				<div id="contact">
					<div id="message"></div>
					<br />
					<form method="post" action="contact.php" name="contactform" id="contactform">
						<div class="sep">
							<label for="name" class="txt" accesskey="U">Your Name</label>
							<input name="name" type="text" id="name" size="30" value="" />
						</div>
			
						<div class="sep">
							<label for="email" class="txt" accesskey="E">Email</label>
							<input name="email" type="text" id="email" size="30" value="" />
						</div>

						<div class="sep">
							<label for="subject" class="txt" accesskey="S">Subject</label>
							<input name="subject" type="text" id="subject" size="30" value="" />
						</div>			
			
						<div class="sep">
							<label for="comments" class="txt" accesskey="C">Your message</label>
							<textarea name="comments" cols="40" rows="3" id="comments"></textarea>
						</div>			
						<div class="buttonAlign">
							<button type="submit" class="button mediumButton" id="submit">Send</button>
						</div>
					</form>
				</div>
				<!-- END Contact form -->
			</div>
			<!-- END Main Column -->
			
			<!-- START Sidebar -->
			<div class="grid_4 omega">
				<h4>Main office</h4>
				<address class="main">
					&copy; 2012 Inc. 
					26 Cambridge Square 
					San Francisco, CA 85024
				</address>
				<ul>
					<li>Tel: (503) 332-1602</li>
					<li>Fax: (503) 332-1604</li>
					<li>Email: info@example.com</li>
				</ul>
			</div>
			<!-- END Sidebar -->						
		</div>
		<!-- END Main Content -->