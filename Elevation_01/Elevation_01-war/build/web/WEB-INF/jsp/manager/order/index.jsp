<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="panel panel-default">
    <header class="panel-heading">Product List</header>
    <div class="panel-body">
        <div class="mb5">
            <a href="<c:url value="/manager/product/form.jsp"/>" class="btn btn-primary">New Product</a>
        </div>
        <div class="clearfix"></div>
        <div  class="table-responsive no-border">
            <table class="table table-bordered table-striped mg-t datatable editable-datatable">
                <tr>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Discount</th>
                    <th>Status</th>
                    <th></th>
                </tr>
                <jsp:include page="/manager/product/tr-acc.do" flush="false" />
            </table>
        </div>
    </div>
</section>
