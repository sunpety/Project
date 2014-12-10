<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page  contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html class="no-js" lang="en">

    <head>
        <!-- meta -->
        <meta charset="utf-8">
        <meta name="description" content="Flat, Clean, Responsive, application admin template built with bootstrap 3">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1">
        <!-- /meta -->

        <title>Elevation - Web Application Administrator</title>
        <c:url value="/manager" var="baseURL"  scope="page"/>
        <!-- core styles -->
        <link rel="stylesheet" href="${baseURL}/bootstrap/css/bootstrap.min.css">  
        <link rel="stylesheet" href="${baseURL}/css/font-awesome.css">
        <link rel="stylesheet" href="${baseURL}/css/font-awesome.css">
        <link rel="stylesheet" href="${baseURL}/css/font-awesome.css">
        <link rel="stylesheet" href="${baseURL}/css/themify-icons.css">
        <link rel="stylesheet" href="${baseURL}/css/animate.min.css">


        <!-- /core styles -->

        <!-- template styles -->
        <link rel="stylesheet" href="${baseURL}/css/skins/palette.css">
        <link rel="stylesheet" href="${baseURL}/css/fonts/font.css">
        <link rel="stylesheet" href="${baseURL}/css/main.css">
        <!-- template styles -->

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- load modernizer -->
        <script src="${baseURL}/plugins/modernizr.js"></script>
    </head>

    <!-- body -->

    <body>
        <div class="app">
            <!-- top header -->
            <jsp:include page="adminBaseHeader.jsp" flush="true" />
            <!-- /top header -->

            <section class="layout">
                <!-- sidebar menu -->
                <jsp:include page="adminBaseSidebar.jsp" flush="true"/>

                <!-- /sidebar menu -->

                <!-- main content -->
                <section class="main-content">

                    <!-- content wrapper -->
                    <div class="content-wrap">
                        <!-- inner content wrapper -->
                        <div class="wrapper ">
                            <jsp:include page="${param.ContentPage}" flush="true"/>
                        </div>
                        <!-- /inner content wrapper -->

                    </div>
                    <!-- /content wrapper -->
                    <a class="exit-offscreen"></a>
                </section>
                <!-- /main content -->
            </section>

        </div>
        <!-- core scripts -->
        <script src="${baseURL}/plugins/jquery-1.11.1.min.js"></script>
        <script src="${baseURL}/bootstrap/js/bootstrap.js"></script>
        <script src="${baseURL}/plugins/jquery.slimscroll.min.js"></script>
        <script src="${baseURL}/plugins/jquery.easing.min.js"></script>
        <script src="${baseURL}/plugins/appear/jquery.appear.js"></script>
        <script src="${baseURL}/plugins/jquery.placeholder.js"></script>
        <script src="${baseURL}/plugins/fastclick.js"></script>
        <!-- /core scripts -->

        <!-- page level scripts -->

        <!-- /page level scripts -->

        <!-- template scripts -->
        <script src="${baseURL}/js/offscreen.js"></script>
        <script src="${baseURL}/js/main.js"></script>
        <!-- /template scripts -->

        <!-- page script -->

        <script src="${baseURL}/plugins/parsley.remote.min.js"></script>
        <script src="${baseURL}/plugins/parsley.min.js"></script>
<!--        <script src="<c:url value="/ckeditor/ckeditor.js" />"></script>-->

        <script type="text/javascript" src="<c:url value="/ckeditor/ckeditor.js" />"></script>
        <!-- /page script -->

        <c:if test="${not empty scripts}" >
            <c:forEach items="${scripts}" var="script">
                <script type="text/javascript"  href="<c:url value="${script}"/>"></script>
            </c:forEach>
        </c:if>

    </body>
    <!-- /body -->

</html>
