<%-- 
    Document   : product
    Created on : Dec 5, 2014, 12:24:38 AM
    Author     : NeedMoney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
			<h3 class="headSeparator">Product Featured</h3>
			<div class="one-time">
				<div class="grid_3 omega">
					<div class="works">
						<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="example work" /></a>
						<h5>Project title</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
						<a href="#">read more &rarr;</a>
					</div>
				</div>
				<div class="grid_3 alpha">
					<div class="works">
						<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="example work" /></a>
						<h5>Project title</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
						<a href="#">read more &rarr;</a>
					</div>
				</div>
				<div class="grid_3 alpha">
					<div class="works">
						<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="example work" /></a>
						<h5>Project title</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit</p>
						<a href="#">read more &rarr;</a>
					</div>
				</div>			
				<div class="grid_3 alpha">
					<div class="works">
						<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="example work" /></a>
						<h6>Project title</h6>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
						<a href="#">read more &rarr;</a>
					</div>
				</div>
				
				<div class="grid_3 alpha">
					<div class="works">
						<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="example work" /></a>
						<h6>Project title</h6>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
						<a href="#">read more &rarr;</a>
					</div>
				</div>
				
				<div class="grid_3 alpha">
					<div class="works">
						<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="example work" /></a>
						<h6>Project title</h6>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
						<a href="#">read more &rarr;</a>
					</div>
				</div>
			</div>

			<div class="clear"></div>			
			<br />
		<link rel="stylesheet" href="stylesheets/slick.css" type="text/css" />
    <script type="text/javascript" src="javascripts/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="javascripts/jquery-migrate-1.2.1.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
          $('.one-time').slick({
  infinite: true,
  slidesToShow: 4,
  slidesToScroll: 4,
  autoplay: true,
  autoplaySpeed: 2000,
});
				
        });
    </script>