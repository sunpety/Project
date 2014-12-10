<%@page import="com.aptech.elevation.entity.News"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@taglib prefix="" uri="http://java.sun.com/jstl/fmt" %>
<%--<c:url value="/manager/category-email" var="validateURL" />--%>
<%
    if (request.getParameter("news") != null) {
        News news = (News) request.getAttribute("news");
    }

%>
<c:if test="param.feildError == name">
    <script>
        alert("Name existed.");
    </script>
</c:if>
<section class="panel">
    <header class="panel-heading no-b">
        <h4>New News</h4>
    </header>
    <div class="panel-body">
        <form role="form" method="post" action="<c:url value="/manager/news/add-new.do"/>" class="parsley-form" data-parsley-validate>
            <input type="hidden" name="id" value="${news.newsId}">
            <input type="hidden" name="type" value="1">
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label>Tile</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="title" 
                                   data-parsley-required="true" 
                                   data-parsley-trigger="change" 
                                   data-parsley-trim-value="true"
                                   placeholder="News title"
                                   value="${news.newsTitle}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Image</label>
                        <div class="input-group">
                            <input type="text" 
                                   class="form-control" 
                                   name="image"
                                   value="${news.newsImage}">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button"><i class="glyphicon glyphicon-folder-open"></i></button>
                            </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label >Status</label>
                        <div>
                            <input type="checkbox" name="status" value="${news.newsStatus}">
                        </div>
                    </div>
                </div>

                <div class="col-md-8">
                    <div class="form-group">
                        <label>Content</label>
                        <div>
                            <textarea  type="text" 
                                       class="form-control" 
                                       name="content" 
                                       rows="10"
                                       placeholder="" value="${news.newsContent}"></textarea>
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
