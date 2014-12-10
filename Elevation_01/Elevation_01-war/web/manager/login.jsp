<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html class="signin no-js" lang="">
    <head>
        <!-- meta -->
        <meta charset="utf-8">
        <meta name="description" content="Flat, Clean, Responsive, application admin template built with bootstrap 3">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1">
        <!-- /meta -->

        <title>Sublime - Web Application Admin Dashboard</title>

        <!-- page level plugin styles -->
        <!-- /page level plugin styles -->
        <c:url value="/manager" var="baseURL"/>
        <!-- core styles -->
        <link rel="stylesheet" href="${baseURL}/bootstrap/css/bootstrap.min.css">
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


        <!--parsleycss-->
        <!--<link rel="stylesheet" href="//parsleyjs.org/src/parsley.css">-->
        <link rel="stylesheet" href="${baseURL}/css/parsley.css">

        <!-- load modernizer -->
        <script src="${baseURL}/plugins/modernizr.js"></script>


    </head>

    <body class="bg-primary">

        <div class="cover" style="background-image: url(${baseURL}/img/cover3.jpg)"></div>

        <div class="overlay bg-primary"></div>

        <div class="center-wrapper">
            <div class="center-content">
                <div class="row">
                    <div class="col-xs-10 col-xs-offset-1 col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">
                        <section class="panel bg-white no-b">
                            <div class="p15">
                                <c:if test="${!empty param.LoginStatus}">
                                    <div class="alert alert-danger">
                                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                        <strong>Login Failed!</strong>&nbsp;Username or password is not valid. Please retype and submitting again.
                                    </div>
                                </c:if>
                                <form method="post" role="form" action="<c:url value="/manager/login.do"/>" class="parsley-form" data-parsley-validate >
                                    <input name="txtUsername" type="text" class="form-control input-lg mt25" placeholder="Username" autofocus data-parsley-required="true" data-parsley-trigger="change" data-parsley-error-message="Username can not be empty.">
                                    <input name="txtPassword" type="password" class="form-control input-lg mt25" placeholder="Password" data-parsley-required="true" data-parsley-trigger="change" data-parsley-error-message="Password can not be empty.">
                                    <div class="show"/>
                                    <button class="btn btn-primary btn-lg btn-block mt25" type="submit">Sign in</button>
                                </form>
                            </div>
                        </section>
                        <p class="text-center">
                            Copyright &copy;
                            <span id="year" class="mr5"></span>
                            <span>Sublime LLC</span>
                        </p>
                    </div>
                </div>

            </div>
        </div>

        <!-- core scripts -->
        <script src="${baseURL}/plugins/jquery-1.11.1.min.js"></script>
        <script src="${baseURL}/bootstrap/js/bootstrap.js"></script>
        <!--core scripts -->-->

        <!-- page level scripts -->
        <script src="${baseURL}/plugins/parsley.min.js"></script>
        <!-- /page level scripts -->
        <script type="text/javascript">
            var el = document.getElementById("year"),
                    year = (new Date().getFullYear());
            el.innerHTML = year;
        </script>
    </body>

</html>
