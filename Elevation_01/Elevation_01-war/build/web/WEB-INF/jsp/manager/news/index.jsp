<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="panel panel-default">
    <header class="panel-heading">News List</header>
    <div class="panel-body">
        <div class="mb5">
            <a href="<c:url value="/manager/news/form.jsp"/>" class="btn btn-primary">New News</a>
        </div>
        <div class="clearfix"></div>
        <div  class="table-responsive no-border">
            <table class="table table-bordered table-striped mg-t datatable editable-datatable">
                <tr>
                    <th>Image</th>
                    <th>Title</th>
                    <th>Date</th>
                    <th>Status</th>
                    <th></th>
                </tr>
                <jsp:include page="/manager/news/tr-acc.do" flush="false" >
                    <jsp:param name="type" value="1"/>
                </jsp:include>
            </table>
        </div>
    </div>
</section>
