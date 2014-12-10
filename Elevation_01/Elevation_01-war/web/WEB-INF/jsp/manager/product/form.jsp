<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="com.aptech.elevation.entity.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@taglib prefix="" uri="http://java.sun.com/jstl/fmt" %>
<%--<c:url value="/manager/product-email" var="validateURL" />--%>

<!--<script type="text/javascript" src="<c:url value="/ckeditor/ckeditor.js" />"></script>-->
<%
    if (request.getAttribute("product") != null) {
        Product product = (Product) request.getAttribute("product");
    }
%>
<c:if test="param.feildError == name">
    <script>
        alert("Name existed.");
    </script>
</c:if>
<section class="panel">
    <header class="panel-heading no-b">
        <h4>Product Form</h4>
    </header>
    <div class="panel-body">
        <form role="form" method="post" action="<c:url value="/manager/product/add-new.do"/>" class="parsley-form" data-parsley-validate>
            <input type="hidden" name="id" value="${product.productId}">
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label>Name</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="name" 
                                   data-parsley-required="true" 
                                   data-parsley-trigger="change" 
                                   data-parsley-trim-value="true"
                                   placeholder="product name..."
                                   value="${product.productName}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Price</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="price" 
                                   placeholder=""
                                   data-parsley-type="number"
                                   value="${product.productPrice}"
                                   data-parsley-required="true">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Discount</label>
                        <div>
                            <input type="number" 
                                   class="form-control" 
                                   name="discount" 
                                   placeholder=""
                                   value="<fmt:formatNumber value="${product.productDiscount}"/>"
                                   data-parsley-required="true">
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Quantity</label>
                        <div >
                            <input type="number" 
                                   class="form-control" 
                                   name="quantity"
                                   value="${product.productQuantity}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Category</label>
                        <div>
                            <select name="category" class="form-control"> 
                                <jsp:include page="/manager/category/optionCategory" flush="true"/>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Image</label>
                        <div class="input-group">
                            <input type="text" 
                                   class="form-control" 
                                   name="image"
                                   value="${product.productImage}">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="glyphicon glyphicon-folder-open"></i>
                                </button>
                            </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Status</label>
                        <div>
                            <input type="checkbox" name="status" value="${product.productStatus}"/>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">


                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <label>Description</label>
                        <div>
                            <textarea class="ckeditor"
                                      name="description"
                                      rows="10"
                                      >${product.productDescription}</textarea>
                        </div>
                    </div>    
                </div>
                <div class="col-md-12">
                    <div class="form-group text-center col-md-3">
                        <label></label>
                        <div>
                            <button class="btn btn-primary btn-block btn-lg btn-parsley">Submit</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</section>
