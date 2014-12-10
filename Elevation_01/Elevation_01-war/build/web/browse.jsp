<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
</head>
<body>
<h1>Click on the product to add product to your cart:</h1>
<c:forEach items="${requestScope.products}" var="product">
    <a href="<c:url value="/ProductActionServlet">
        <c:param name="action" value="addToCart"/>
        <c:param name="product_id" value="${product.productId}"/>
        </c:url>">${product.productName}</a>
    <br/>
</c:forEach>

</body>
</html>