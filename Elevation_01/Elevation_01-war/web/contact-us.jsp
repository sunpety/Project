<%-- 
    Document   : contact-us
    Created on : Dec 5, 2014, 4:53:12 AM
    Author     : NeedMoney
--%>
<script type="text/javascript" src="javascripts/jquery-1.9.1.js"></script>
<script type="text/javascript" src="javascripts/jquery.validate.min.js"></script>
<script>

    // When the browser is ready...
    $(function () {

        // Setup form validation on the #register-form element
        $("#comment-form").validate({
            // Specify the validation rules
            rules: {
                fullname: {
                    required: true,
                    minlength: 5
                },
                title: {
                    required: true,
                    minlength: 5
                },
                email: {
                    required: true,
                    minlength: 5,
                    email: true
                },
                comments: {
                    required: true,
                    minlength: 5,
                    maxlength:500
                },
            },
            // Specify the validation error messages
            messages: {
                fullname: {
                    required: "Please provide a fullname",
                    minlength: "Your fullname must be at least 5 characters long"
                },
                title: {
                    required: "Please provide a subject",
                    minlength: "Your subject must be at least 5 characters long"
                },
                email: {
                    required: "Please provide a email",
                    minlength: "Your email must be at least 5 characters long",
                    email: "Please enter a valid email address"
                },
                comments: {
                    required: "Please provide a description",
                    minlength: "Your description must be at least 5 characters long",
                    maxlength: "Your description must be at 5 - 500 characters long"
                },
            },
            submitHandler: function (form) {
                form.submit();
            }
        });

    });

</script>
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
            <div id="message">
                <% String message = (String) request.getAttribute("success");
                    if (message != null) {
                %>
                <p class="successBox"><%=message%></p>
                <%}%>
            </div>
            <br>
            <form method="post" action="ContactActionServlet?action=contact" id="comment-form" class="contactform">
                <%
                    String firstname=(String)request.getAttribute("firstname");
                    String lastname=(String)request.getAttribute("lastname");
                    String email=(String)request.getAttribute("email");
                    if(firstname != null)
                    {
                %>
                    <div class="sep">
                        <label for="name" class="txt" accesskey="U">Your Name</label>
                        <input name="fullname" readonly="" type="text" value="<%=firstname%> <%=lastname%>">
                    </div>
                    
                <div class="sep">
                    <label for="email" class="txt" accesskey="E">Email</label>
                    <input name="email" type="text"  value="<%=email%>">
                </div>		
                    
                    <%}
                    
                    else
                    {%>
                    <div class="sep">   
                    <label for="name" class="txt" accesskey="U">Your Name</label>
                        <input name="fullname" type="text" value="">
                    </div>	
                <div class="sep">
                    <label for="email" class="txt" accesskey="E">Email</label>
                    <input name="email" type="text" value="">
                </div>		
                    <%}%>
                        
                <div class="sep">
                    <label for="title" class="txt" accesskey="E">Subject</label>
                    <input name="title" type="text" value="">
                </div>	
                <div class="sep">
                    <label for="comments" class="txt" accesskey="C">Description</label>
                    <textarea name="comments" cols="40" rows="3"></textarea>
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
					&copy; 2014 Inc. 
                                        <%= request.getAttribute("address") %>
				</address>
				<ul>
					<li>Tel: <%= request.getAttribute("tel") %></li>
					<li>Fax: <%= request.getAttribute("fax") %></li>
					<li>Email: <%= request.getAttribute("email") %></li>
				</ul>
			</div>
			<!-- END Sidebar -->						
		</div>
		<!-- END Main Content -->