<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/manager" var="baseURL"/>
<aside class="sidebar offscreen-left">
    <!-- main navigation -->
    <nav class="main-navigation" data-height="auto" data-size="6px" data-distance="0" data-rail-visible="true" data-wheel-step="10">
        <p class="nav-title">MENU</p>
        <ul class="nav">
            <!-- dashboard -->
            <li>
                <a href="index.html">
                    <i class="ti-home"></i>
                    <span>Dashboard</span>
                </a>
            </li>
            <!-- /dashboard -->

            <!-- Account -->
            <li>
                <a href="javascript:;">
                    <i class="toggle-accordion"></i>
                    <i class="ti-user"></i>
                    <span>Account</span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="${baseURL}/account/index.jsp">
                            <span>Account List</span>
                        </a>
                    </li>
                    <li>
                        <a href="${baseURL}/account/form.jsp">
                            <span>New Account</span>
                        </a>
                    </li>
                </ul>
            </li>
            <!-- /account -->


            <!-- Category -->
            <li>
                <a href="javascript:;">
                    <i class="toggle-accordion"></i>
                    <i class="ti-menu-alt"></i>
                    <span>Categories</span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="${baseURL}/category/index.jsp">
                            <span>Category List</span>
                        </a>
                    </li>
                    <li>
                        <a href="${baseURL}/category/form.jsp">
                            <span>New Category</span>
                        </a>
                    </li>
                </ul>
            </li>
            <!-- /category -->

            <!-- Product -->
            <li>
                <a href="javascript:;">
                    <i class="toggle-accordion"></i>
                    <i class="ti-menu-alt"></i>
                    <span>Product</span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="${baseURL}/product/index.jsp">
                            <span>Product List</span>
                        </a>
                    </li>
                    <li>
                        <a href="${baseURL}/product/form.jsp">
                            <span>New product</span>
                        </a>
                    </li>
                </ul>
            </li>
            <!-- /product -->

            <!-- Order  -->
            <li>
                <a href="javascript:;">
                    <i class="toggle-accordion"></i>
                    <i class="ti-menu-alt"></i>
                    <span>Order</span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="${baseURL}/order/index.jsp">
                            <span>Order List</span>
                        </a>
                    </li>
                    <li>
                        <a href="${baseURL}/order/form.jsp">
                            <span>New Order</span>
                        </a>
                    </li>
                </ul>
            </li>
            <!-- /Order -->
            <!-- Complaint  -->
            <li>
                <a href="${baseURL}/complaint/index.jsp">
                    <i class="toggle-accordion"></i>
                    <i class="ti-menu-alt"></i>
                    <span>Complaint</span>
                </a>
            </li>
            <!-- /Complaint -->
            <!-- News  -->
            <li>
                <a href="${baseURL}/contact/index.jsp">
                    <i class="toggle-accordion"></i>
                    <i class="ti-menu-alt"></i>
                    <span>Contact</span>
                </a>
            </li>
            <!-- /News -->
            <!-- News  -->
            <li>
                <a href="javascript:;">
                    <i class="toggle-accordion"></i>
                    <i class="ti-menu-alt"></i>
                    <span>News</span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="${baseURL}/news/index.jsp">
                            <span>News list</span>
                        </a>
                    </li>
                    <li>
                        <a href="${baseURL}/news/form.jsp">
                            <span>New news</span>
                        </a>
                    </li>
                </ul>
            </li>
            <!-- /News -->
            <!-- About  -->
            <li>
                <a href="javascript:;">
                    <i class="toggle-accordion"></i>
                    <i class="ti-menu-alt"></i>
                    <span>About</span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="${baseURL}/news/index.jsp">
                            <span>About list</span>
                        </a>
                    </li>
                    <li>
                        <a href="${baseURL}/news/form.jsp">
                            <span>New About</span>
                        </a>
                    </li>
                </ul>
            </li>
            <!-- /About -->
            <!-- Tu van  -->
            <li>
                <a href="javascript:;">
                    <i class="toggle-accordion"></i>
                    <i class="ti-menu-alt"></i>
                    <span>Recommendation</span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="${baseURL}/recommentdation/index.jsp">
                            <span>List</span>
                        </a>
                    </li>
                    <li>
                        <a href="${baseURL}/recommentdation/form.jsp">
                            <span>New</span>
                        </a>
                    </li>
                </ul>
            </li>
            <!-- /Tu van -->
    </nav>
</aside>