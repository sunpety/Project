<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="panel panel-default">
    <header class="panel-heading">Account List</header>
    <div class="panel-body">

        <div  class="table-responsive no-border">
            <table class="table table-bordered table-striped mg-t datatable editable-datatable">
                <tr>
                    <th>Username</th>
                    <th>Email</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Phone</th>
                    <th>Company</th>
                    <th></th>
                </tr>
                <jsp:include page="/manager/account/tr-acc.do" flush="false" />
            </table>
        </div>
    </div>
</section>
