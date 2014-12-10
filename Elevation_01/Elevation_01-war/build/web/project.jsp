<%-- 
    Document   : project
    Created on : Dec 5, 2014, 12:25:30 AM
    Author     : NeedMoney
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h3 class="headSeparator">Recent projects</h3>
        <div class="project-item">
            <c:forEach var="p" items="${projects}">
			<div class="grid_3 alpha">
				<div class="works">
                                    <a class="colorbox" href="${p.newConten}" title="${p.newTitle}"><img class="project" src="${p.newConten}" width="225" height="121" alt="${p.newTitle}" /></a>
					<h5>${p.newTitle}</h5>
				</div>
			</div>
</c:forEach>
</div>
			<div class="clear"></div>			
			<br />
			    <script type="text/javascript">
        $(document).ready(function(){
          $('.project-item').slick({
  infinite: true,
  slidesToShow: 4,
  slidesToScroll: 4,
});
				
        });
    </script>