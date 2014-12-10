<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Elevator Systems</title> 
		
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<!-- Favicons -->
		<link rel="shortcut icon" href="favicon.ico">
		<link rel="apple-touch-icon-precomposed" sizes="144x144" href="apple-touch-icon-144x144-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="114x114" href="apple-touch-icon-114x114-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="72x72" href="apple-touch-icon-72x72-precomposed.png">
		<link rel="apple-touch-icon-precomposed" href="apple-touch-icon-precomposed.png">
		
		<!-- Google fonts -->

		<!-- Stylesheets -->
		<link rel="stylesheet" href="stylesheets/pagelayout.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="stylesheets/jquery.colorbox.css" type="text/css" />
		<link rel="stylesheet" href="stylesheets/media-queries.css"  media="screen" type="text/css" />
				
		<!--[if lt IE 9]>
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->				
	</head>
        
	<body>
		<!-- START Header -->
		<div class="headerWrap">
			<header>
                            <jsp:include page="menu.do"/>
			</header>
		</div>
		<div class="baseHeader"></div>
		<!-- END Header -->
				<div id="PageWrapper" class="grid_12 clearfix">
                    <% 
                    if(request.getParameter("page") ==null)
                    {
                    %>
		<!-- START Slideshow panel-->
                <%@include file="silder.jsp" %>
		<!-- END Slideshow panel-->

		<section class="grid_12">
			<div class="slogan clearfix">
				<div class="grid_8">
					<h2>Creative &amp; flexible out of the box solutions!</h2>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Tempor incididunt ut labore et dolore magna aliqua.</p>
				
                                
                                </div>
				<a href="#" class="button largeButton">Read more &raquo;</a>
			</div>			
		</section>
			
		<!-- START Main content -->

			<!-- START Recent product -->
                        <jsp:include page="product.do"/>
			<!-- END Recent product -->	
			<!-- START Services -->
                        <jsp:include page="project.do"/>
			<!-- END Services -->		
                    <%}
                    else
                    {
                        String p=request.getParameter("page");
                        if(p.equals("login-register"))
                        {
                        %>
                        <%@include file="login_register.jsp" %>
                        <%}
                        if(p.equals("news"))
                        {
                        %>
                        <jsp:include page="news.do" flush="true"/>
                        <%}if(p.equals("news_content"))
                        {
                        %>
                        <jsp:include page="contentnew.do" flush="true"/>
                        <%}if(p.equals("category"))
                        {
                        %>
                        <jsp:include page="categoryshow.do" flush="true"/>
                        <%}if(p.equals("product-detail"))
                        {
                        %>
                        <jsp:include page="productdetail.do" flush="true"/>
                        <%}if(p.equals("about-us"))
                        {
                        %>
                        <%@include file="about.jsp" %>
                        <%}if(p.equals("contact-us"))
                        {
                        %>
                        <jsp:include page="contact.do" flush="true"/>
                        <%}if(p.equals("test-ok"))
                        {
                        %>
                        <%@include file="test.jsp" %>
                        <%}if(p.equals("my-account"))
                        {
                        %>
                        <%@include file="my-account.jsp" %>
                        <%}%>
                        
                    <%}%>
                    
		</div>
		<!-- END Main content -->

		<!-- START Footer -->
                <%@include file="footer.jsp" %>
		<!-- END Footer -->

		<!-- Javascripts -->
		<script type="text/javascript" src="javascripts/jquery-1.9.1.js"></script>
		<script type="text/javascript" src="javascripts/jquery-1.8.2.min.js"></script>
		<script type="text/javascript" src="javascripts/jquery.flexslider.js"></script>
		<script type="text/javascript" src="javascripts/jquery.colorbox.js"></script>
		<script type="text/javascript" src="javascripts/jquery.easing-1.3.pack.js"></script>
		<script type="text/javascript" src="javascripts/slick.min.js"></script>
		<script type="text/javascript" src="javascripts/superfish.js"></script>
		<script type="text/javascript" src="javascripts/hoverIntent.js"></script>
		<script type="text/javascript" src="javascripts/jquery.validate.min.js"></script>
		<script type="text/javascript" src="javascripts/jquery.quicksand.js"></script>
		<script type="text/javascript" src="javascripts/tabs.js"></script>
		<script type="text/javascript" src="javascripts/custom.js"></script>	
	</body>
</html>