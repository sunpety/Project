


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String u = (String) session.getAttribute("username");
    String message_register = (String) request.getAttribute("error_dupe_register");
    if (u != null) {
        response.sendRedirect("index.jsp");
    }
%>
<script type="text/javascript" src="javascripts/jquery-1.9.1.js"></script>
<script type="text/javascript" src="javascripts/jquery.validate.min.js"></script>
<!-- jQuery Form Validation code -->
<script>

    // When the browser is ready...
    $(function () {

        // Setup form validation on the #register-form element
        $("#login-form").validate({
            // Specify the validation rules
            rules: {
                username: {
                    required: true,
                    minlength: 5
                },
                password: {
                    required: true,
                    minlength: 5
                },
            },
            // Specify the validation error messages
            messages: {
                username: {
                    required: "Please provide a username",
                    minlength: "Your username must be at least 5 characters long"
                },
                password: {
                    required: "Please provide a password",
                    minlength: "Your password must be at least 5 characters long"
                },
            },
            submitHandler: function (form) {
                form.submit();
            }
        });

    });

</script>
<!-- START Page title -->
<div class="grid_12 pageTitle">
    <h1>Account <span class="info">// A look at what's inside</span></h1>
</div>
<!-- END Page title -->
<div id="PageWrapper" class="grid_12 clearfix">
    <div class="grid_8 alpha">	
        <div id="tabs2" class="tabsBoxed">
            <ul class="nav clearfix">
                <%
                    if (message_register != null) {
                %>

                <li class="nav"><a href="#login" >Existing Customers</a></li>
                <li class="nav"><a href="#register"class="active">New Customer Sign Up</a></li>
                    <%} else {%>

                <li class="nav"><a href="#login" class="active">Existing Customers</a></li>
                <li class="nav"><a href="#register">New Customer Sign Up</a></li>
                    <%}%>
            </ul>
            <div class="clear"></div>
            <div class="tabContent"><%
                if (message_register != null) {
                %>
                <div id="login" class="hide">
                    <%} else {%>
                    <div id="login">
                        <%}%>
                        <div id="contact">

                            <div id="message">
                                <% String message = (String) request.getAttribute("error_login");
                                    if (message != null) {
                                %>
                                <div class="errorBox"><%= message%></div>
                                <%}%>
                                <% String message_success = (String) request.getAttribute("success_register");
                                    if (message_success != null) {
                                %>
                                <div class="successBox"><%= message_success%></div>
                                <%}%>
                            </div>
                            <br />

                            <form method="post" action="AccountServlet?action=login" id="login-form" class="contactform">
                                <div class="sep">
                                    <label for="name" class="txt" accesskey="U">Username</label>
                                    <input name="username" type="text" size="30" value="" />
                                </div>

                                <div class="sep">
                                    <label for="password" class="txt" accesskey="E">Password</label>
                                    <input name="password" type="password" size="30" value="" />
                                </div>

                                <div class="sep">
                                    <label for="space" class="txt" accesskey="E">&nbsp;&nbsp;&nbsp;&nbsp;</label>
                                    <span>Forgot your password?</span>
                                </div>

                                <div class="buttonAlign">
                                    <button type="submit" class="button mediumButton" id="submit">Submit</button>
                                    <button type="reset" class="button mediumButton" id="submit">Reset</button>
                                </div>
                            </form>
                        </div>						
                    </div>
                    <script>

                        // When the browser is ready...
                        $(function () {

                            // Setup form validation on the #register-form element
                            $("#register-form").validate({
                                // Specify the validation rules
                                rules: {
                                    username: {
                                        required: true,
                                        minlength: 6
                                    },
                                    password: {
                                        required: true,
                                        minlength: 6
                                    },
                                    password_confirm: {
                                        required: true,
                                        minlength: 6,
                                        equalTo: "#password"
                                    },
                                    firstname: {
                                        required: true,
                                        minlength: 3
                                    },
                                    lastname: {
                                        required: true,
                                        minlength: 3
                                    },
                                    address1: {
                                        required: true,
                                        minlength: 5
                                    },
                                    city: {
                                        required: true,
                                        minlength: 3
                                    },
                                    states: {
                                        required: true,
                                        minlength: 3
                                    },
                                    zipcode: {
                                        required: true,
                                        minlength: 3
                                    },
                                    country: {
                                        required: true,
                                        minlength: 3
                                    },
                                    phone_number: {
                                        required: true,
                                        minlength: 10,
                                        number: true
                                    },
                                    email: {
                                        required: true,
                                        minlength: 5,
                                        email: true
                                    },
                                },
                                // Specify the validation error messages
                                messages: {
                                    username: {
                                        required: "Please provide a username",
                                        minlength: "Your username must be at least 6 characters long"
                                    },
                                    password: {
                                        required: "Please provide a password",
                                        minlength: "Your password must be at least 6 characters long"
                                    },
                                    password_confirm: {
                                        required: "Please provide a password confirm",
                                        minlength: "Your password must be at least 6 characters long",
                                        equalTo: "Please enter the same password again"
                                    },
                                    firstname: {
                                        required: "Please provide a firstname",
                                        minlength: "Your firstname must be at least 3 characters long"
                                    },
                                    lastname: {
                                        required: "Please provide a lastname",
                                        minlength: "Your lastname must be at least 3 characters long"
                                    },
                                    address1: {
                                        required: "Please provide a address1",
                                        minlength: "Your address1 must be at least 5 characters long"
                                    },
                                    city: {
                                        required: "Please provide a city",
                                        minlength: "Your city must be at least 3 characters long"
                                    },
                                    states: {
                                        required: "Please provide a states",
                                        minlength: "Your states must be at least 3 characters long"
                                    },
                                    zipcode: {
                                        required: "Please provide a zipcode",
                                        minlength: "Your zipcode must be at least 3 characters long"
                                    },
                                    country: {
                                        required: "Please provide a country",
                                        minlength: "Your country must be at least 3 characters long"
                                    },
                                    phone_number: {
                                        required: "Please provide a phone number",
                                        number: "Please enter a valid number",
                                        minlength: "Your phone number must be at least 10 characters long"
                                    },
                                    email: {
                                        required: "Please provide a email",
                                        minlength: "Your email must be at least 5 characters long",
                                        email: "Please enter a valid email address"
                                    },
                                },
                                submitHandler: function (form) {
                                    form.submit();
                                }
                            });

                        });

                    </script>
                    <%
                        if (message_register != null) {
                    %>
                    <div id="register">
                        <%} else {%>

                        <div id="register" class="hide">
                            <%}%>
                            <div id="contact">
                                <div id="message">
                                    <%
                                        if (message_register != null) {
                                    %>
                                    <div class="errorBox"><%= message_register%></div>
                                    <%}%>
                                </div>
                                <br />
                                <form method="post" action="AccountServlet?action=register" id="register-form" class="contactform">
                                    <div class="sep">
                                        <label class="txt" accesskey="U">Username <font color="#ff6d3a">(*)</font></label>
                                        <input name="username" type="text" size="30" value="" />
                                    </div>

                                    <div class="sep">
                                        <label class="txt" accesskey="E">Password <font color="#ff6d3a">(*)</font></label>
                                        <input name="password" id="password" type="password" size="30" value="" />
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
