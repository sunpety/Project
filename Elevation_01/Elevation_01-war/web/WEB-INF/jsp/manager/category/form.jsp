<%@page import="com.aptech.elevation.entity.Category"%>
<%@page import="com.aptech.elevation.entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@taglib prefix="" uri="http://java.sun.com/jstl/fmt" %>
<%--<c:url value="/manager/category-email" var="validateURL" />--%>
<%
    if (request.getParameter("category") != null) {
        Category category = (Category) request.getAttribute("category");
    }

%>
<c:if test="param.feildError == name">
    <script>
        alert("Name existed.");
    </script>
</c:if>
<section class="panel">
    <header class="panel-heading no-b">
        <h4>New Category</h4>
    </header>
    <div class="panel-body">
        <form role="form" method="post" action="<c:url value="/manager/category/add-new.do"/>" class="parsley-form" data-parsley-validate>
            <input type="hidden" name="id" value="${category.categoryId}">
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
                                   placeholder="category name..."
                                   value="${category.categoryName}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Description</label>
                        <div>
                            <input type="text" 
                                   class="form-control ckdeitor" 
                                   name="description" 
                                   placeholder="" value="${category.categoryDescription}">
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Image</label>
                        <div class="input-group">
                            <input type="text" 
                                   class="form-control" 
                                   name="image"
                                   value="${category.categoryImage}">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button"><i class="glyphicon glyphicon-folder-open"></i></button>
                            </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Parent Category</label>
                        <div>
                            <select name="parent" class="form-control"> 
                                <option value="">----</option>
                                <jsp:include page="/manager/category/optionCategory" flush="true"/>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <c:if test="category not null">
                        <img  class="thumbnail" src="${category.categoryImage}">
                    </c:if>

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
