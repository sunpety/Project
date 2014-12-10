<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/manager" var="baseURL"/>
<header class="header header-fixed navbar">
    <div class="brand">
        <!-- toggle offscreen menu -->
        <a href="javascript:;" class="ti-menu off-left visible-xs" data-toggle="offscreen" data-move="ltr"></a>
        <!-- /toggle offscreen menu -->

        <!-- logo -->
        <a href="${baseURL}/index.jsp" class="navbar-brand">
            <img src="${baseURL}/img/logo.png" alt="">
            <span class="heading-font">
                Elevation
            </span>
        </a>
        <!-- /logo -->
    </div>

    <ul class="nav navbar-nav">
        <li class="hidden-xs">
            <!-- toggle small menu -->
            <a href="javascript:;" class="toggle-sidebar">
                <i class="ti-menu"></i>
            </a>
            <!-- /toggle small menu -->
        </li>
        <li class="header-search">
            <!-- toggle search -->
            <a href="javascript:;" class="toggle-search">
                <i class="ti-search"></i>
            </a>
            <!-- /toggle search -->
            <div class="search-container">
                <form role="search">
                    <input type="text" class="form-control search" placeholder="type and press enter">
                </form>
            </div>
        </li>
    </ul>

    <ul class="nav navbar-nav navbar-right">




        <li class="off-right">
            <a href="javascript:;" data-toggle="dropdown">
                <img src="${baseURL}/img/faceless.jpg" class="header-avatar img-circle" alt="user" title="user">
                <span class="hidden-xs ml10">Administrator</span>
                <i class="ti-angle-down ti-caret hidden-xs"></i>
            </a>
            <ul class="dropdown-menu animated fadeInRight">
                <li>
                    <a href="javascript:;">Profile</a>
                </li>
                <li>
                    <a href="javascript:;">Change Password</a>
                </li>
                <li>
                    <a href="javascript:;">
                        <div class="badge bg-danger pull-right">3</div>
                        <span>Notifications</span>
                    </a>
                </li>
                <li>
                    <a href="javascript:;">Help</a>
                </li>
                <li>
                    <a href="signin.html">Logout</a>
                </li>
            </ul>
        </li>
    </ul>
</header>