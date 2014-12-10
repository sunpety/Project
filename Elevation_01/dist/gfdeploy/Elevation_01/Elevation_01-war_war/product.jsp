<%-- 
    Document   : product
    Created on : Dec 5, 2014, 12:24:38 AM
    Author     : NeedMoney
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
			<h3 class="headSeparator">Product Featured</h3>
			<div class="one-time">
                            <c:forEach var="p" items="${products}">
				<div class="grid_3 alpha">
					<div class="works">
                                            <a class="colorbox" href="${p.productImage}" title="${p.productName}"><img class="project" src="${p.productImage}" width="225" height="121" alt="${p.productName}" /></a>
                                                <h6> ${p.productName}</h6>
						<p><fmt:formatNumber value="${p.productPrice}" type="currency"/>$</p>
                                                <a href="index.jsp?page=product-detail&product_id=${p.productId}">read more &rarr;</a>
					</div>
				</div>
                            </c:forEach>
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