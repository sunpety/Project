<%-- 
    Document   : news
    Created on : Dec 5, 2014, 3:57:56 AM
    Author     : NeedMoney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

		<!-- START Page title -->
		<div class="grid_12 pageTitle">
			<h1>Portfolio <span class="info">// Four columns to showcase our work</span></h1>
		</div>
		<!-- END Page title -->
		
		<!-- START Main content -->
		<div id="PageWrapper" class="grid_12 clearfix">
			
			<p class="filterLabel">Filter:</p>
			<ul class="filter">
				<li class="current all"><a href="#">All</a></li>
				<li class="web"><a href="#">Web design</a></li>
				<li class="print"><a href="#">Print</a></li>
				<li class="multimedia"><a href="#">Multimedia</a></li>
				<li class="ror"><a href="#">Ruby on Rails</a></li>
			</ul>
			<div class="clear"></div>
			
			<!-- START Portfolio -->
			<ul class="portfolio clearfix">
				<li data-id="id-1" data-type="web" class="grid_3 alpha">
					<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="" /></a>
					<div class="projectInfo">
						<h5>A nice title</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
					</div>
				</li>
				
				<li data-id="id-2" data-type="web" class="grid_3">
					<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="" /></a>
					<div class="projectInfo">
						<h5>A nice title</h5>
						<p>Tempor incididunt ut labore et dolore magna aliqua.</p>
					</div>
				</li>
				
				<li data-id="id-3" data-type="print" class="grid_3">
					<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="" /></a>
					<div class="projectInfo">
						<h5>A nice title</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
					</div>
				</li>
				
				<li data-id="id-4" data-type="ror" class="grid_3 omega">
					<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="" /></a>
					<div class="projectInfo">
						<h5>A nice title</h5>
						<p>Tempor incididunt ut labore et dolore magna aliqua.</p>
					</div>
				</li>
								
				<li data-id="id-5" data-type="multimedia" class="grid_3 alpha">
					<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="" /></a>
					<div class="projectInfo">
						<h5>A nice title</h5>
						<p>Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore</p>
					</div>
				</li>
				
				<li data-id="id-6" data-type="web" class="grid_3">
					<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="" /></a>
					<div class="projectInfo">
						<h5>A nice title</h5>
						<p>Tempor incididunt ut labore et dolore magna aliqua.</p>
					</div>
				</li>
				
				<li data-id="id-7" data-type="ror" class="grid_3">
					<a class="colorbox"  href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="" /></a>
					<div class="projectInfo">
						<h5>A nice title</h5>
						<p>Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore</p>
					</div>
				</li>
				
				<li data-id="id-8" data-type="print" class="grid_3 omega">
					<a class="colorbox" href="images/examples/wide_image.jpg" title="Your project title here"><img class="project" src="images/examples/regular_image.jpg" alt="" /></a>
					<div class="projectInfo">
						<h5>A nice title</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
					</div>
				</li>
			</ul><!-- END portfolio -->
			
			<div class="pagination">
				<a href="#">&laquo;</a>
				<span class="current">1</span>
				<a href="#">2</a>
				<a href="#">3</a>
				<a href="#">4</a>
				<a href="#">5</a>
				<a href="#">&raquo;</a>
			</div>
		</div>
		<!-- END Main content -->