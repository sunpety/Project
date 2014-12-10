<%-- 
    Document   : product_details
    Created on : Dec 5, 2014, 4:43:55 AM
    Author     : NeedMoney
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script type="text/javascript" src="javascripts/jquery-1.9.1.js"></script>
<script type="text/javascript" src="javascripts/jquery.validate.min.js"></script>
<!-- jQuery Form Validation code -->
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
                email: {
                    required: true,
                    minlength: 5,
                    email: true
                },
                comments: {
                    required: true,
                    minlength: 5,
                    maxlength:200
                },
            },
            // Specify the validation error messages
            messages: {
                fullname: {
                    required: "Please provide a fullname",
                    minlength: "Your fullname must be at least 5 characters long"
                },
                email: {
                    required: "Please provide a email",
                    minlength: "Your email must be at least 5 characters long",
                    email: "Please enter a valid email address"
                },
                comments: {
                    required: "Please provide a description",
                    minlength: "Your description must be at least 5 characters long",
                    maxlength: "Your description must be at 5 - 200 characters long"
                },
            },
            submitHandler: function (form) {
                form.submit();
            }
        });

    });

</script>
<!-- START Page title -->
<c:forEach var="p" items="${productdetails}">
    <div class="grid_12 pageTitle">
        <h1>${p.productName} <span class="info">// Product detail</span></h1>
    </div></c:forEach>
    <!-- END Page title -->

    <!-- START Main Content -->
    <div id="PageWrapper" class="grid_12 clearfix">
        <!-- START Main Column -->
        <div class="grid_8 alpha">
        <c:forEach var="p" items="${productdetails}">${p.productDescription}
        </c:forEach>
        <div class="clear"></div>
        <div class="separator"></div>

        <h3>Comment</h3>
        <ul class="teamList clearfix">
                <c:forEach var="f" items="${feedbacks}">
            
            <li>
                <div class="photo">
                    <img src="images/user.png" alt="team" />
                </div>
                <div class="info">
                    <h6>${f.feedbackFullname}</h6>
                    <p>${f.feedbackDescription}</p>
                </div>
            </li>
                </c:forEach>

        </ul>

        <div class="separator"></div>
        <div id="contact">
            <div id="message">
                <% String message = (String) request.getAttribute("success");
                    if (message != null) {
                %>
                <p class="successBox"><%=message%></p>
                <%}%>
            </div>
            <br>
            <form method="post" action="ProductActionServlet?action=comment" id="comment-form" class="contactform">
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
                        
        <c:forEach var="p" items="${productdetails}">
            <input name="product_id" type="text" hidden="" value="${p.productId}">
        </c:forEach>
                <div class="sep">
                    <label for="comments" class="txt" accesskey="C">Description</label>
                    <textarea name="comments" cols="40" rows="3"></textarea>
                </div>			
                <div class="buttonAlign">
                    <button type="submit" class="button mediumButton" id="submit">Comment</button>
                </div>
            </form>
        </div>

    </div>
    <!-- END Main Column -->

    <!-- START Sidebar -->
    <div class="grid_4 omega">
        <h4>Place Order</h4>
        <ul class="latestNews">

            <c:forEach var="p" items="${productdetails}">
                <li><form action="servlet/CartController?action=add" method="post">
                        <h6><a href="#">Price: <fmt:formatNumber value="${p.productPrice}" type="currency" /> </a></h6>
                        <a href="#">Quantity:</a> <input type="text" style="width: 20px;" name="quantity" value="1"/><br>
                        
                        <input type="text" name="modelNo" value="${p.productId}"/>
                        <input type="hidden" name="description" value="${p.productDescription}">
                        <input type="hidden" name="price" value="${p.productPrice}">
                        
                        <button type="submit" class="button fullButton">Add To Cart</button>
                    </form>
                </li>
            </c:forEach>
        </ul>
        <br/>

        <h4>Features</h4>
        <ul class="sideLinks squareList">
            <li><a href="#">The Team</a></li>
            <li><a href="#">News</a></li>
            <li><a href="#">Testimonials</a></li>
        </ul>
    </div>
    <!-- END Sidebar -->
</div>
<!-- END Main Content -->