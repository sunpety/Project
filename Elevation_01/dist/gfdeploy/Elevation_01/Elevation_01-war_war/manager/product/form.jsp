<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    ArrayList scripts = new ArrayList();
//    scripts.add("/ckeditor/ckeditor.js");
//    scripts.add("/manager/js/formproduct.js");
    request.setAttribute("scripts", scripts);
%>
<jsp:include page="/WEB-INF/jsp/manager/adminBase.jsp" flush="true">
    <jsp:param name="ContentPage" value="/WEB-INF/jsp/manager/product/form.jsp"/>
</jsp:include>  
