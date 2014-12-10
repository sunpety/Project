<%@page import="com.aptech.elevation.entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@taglib prefix="" uri="http://java.sun.com/jstl/fmt" %>
<c:url value="/manager/account/validate-email" var="validateURL" />
<%
    if (request.getParameter("account") != null) {
        Account account = (Account) request.getAttribute("account");
    }

%>
<c:if test="param.feildError == email">
    <script>
        alert("Email existed.");
        
    </script>
    
</c:if>
<section class="panel">
    <header class="panel-heading no-b">
        <h4>New Account</h4>
    </header>
    <div class="panel-body">
        <form role="form" method="post" action="<c:url value="/manager/account/add-new.do"/>" class="parsley-form" data-parsley-validate>
            <input type="hidden" name="id" value="${account.accountId}">
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label>Email</label>
                        <div>
                            <input type="email" 
                                   class="form-control" 
                                   name="email" 
                                   data-parsley-required="true" 
                                   data-parsley-trigger="change" 
                                   data-parsley-type="email" 
                                   data-parsley-trim-value="true"
                                   data-parsley-remote="${validateURL}"
                                   data-parsley-remote-reverse="false"
                                   placeholder="Email"
                                   value="${account.accountEmail}">
                            

                        </div>
                    </div>
                    <div class="form-group">
                        <label>Username</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="username" 
                                   data-parsley-required="true" 
                                   data-parsley-trigger="change" 
                                   placeholder="Username" value="${account.accountUsername}">
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Password</label>
                        <div>
                            <input type="password" 
                                   class="form-control" 
                                   name="password" 
                                   id="password" 
                                   <c:if test="account == null">  data-parsley-required="true" </c:if>
                                       data-parsley-trigger="change" 
                                       placeholder="password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Password Confirm</label>
                            <div>
                                <input type="password" 
                                       class="form-control" 
                                       name="password_confirm" 
                                       data-parsley-trigger="change" 
                                       data-parsley-equalto="#password" 
                                       placeholder="password">
                            </div>
                        </div>

                        <div class="form-group">
                            <label>First name</label>
                            <div>
                                <input type="text" 
                                       class="form-control" 
                                       name="firstname" 
                                       data-parsley-required="true" 
                                       data-parsley-trigger="change" 
                                       placeholder="First Name" value="${account.accountFirstname}">
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Last name</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="lastname" 
                                   data-parsley-required="true" 
                                   data-parsley-trigger="change" 
                                   placeholder="Last Name" value="${account.accountLastname}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Address</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="address1" 
                                   data-parsley-required="true" 
                                   data-parsley-trigger="change" 
                                   placeholder="Last Name" value="${account.accountAddress1}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Role</label>
                        <div>
                            <select name="role" name="role" class="form-control">
                                <option value="0" <c:if test="account.rolesId == 0">selected</c:if>  >User</option>
                                <option value="1" <c:if test="account.rolesId == 1">selected</c:if>>Administrator</option>
                                </select>  
                            </div>
                        </div>

                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label>Country</label>
                            <div>
                                <input type="text" 
                                       class="form-control" 
                                       name="country" 
                                       data-parsley-trigger="change" 
                                       placeholder="Country" value="${account.accountCountry}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>City</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="city"  
                                   data-parsley-trigger="change" 
                                   placeholder="City" value="${account.accountCity}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>State</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="state"  
                                   data-parsley-trigger="change" 
                                   placeholder="State" value="${account.accountStates}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Zip code</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="zipcode" 
                                   data-parsley-type="alphanum" 
                                   data-parsley-trigger="change" 
                                   placeholder="P6B6L4" value="${account.accountZipcode}">
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Phone</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="phone" 
                                   data-parsley-type="digits" 
                                   data-rangelength="[11,20]" 
                                   data-parsley-required="true" 
                                   data-parsley-trigger="change" 
                                   placeholder="18005551234" value="${account.accountPhone}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Company</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="company" 
                                   data-parsley-type="url" 
                                   data-parsley-trigger="change" 
                                   placeholder="http://yourcompany.com" value="${account.accountCompany}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Address 2</label>
                        <div>
                            <input type="text" 
                                   class="form-control" 
                                   name="address2"  
                                   data-parsley-trigger="change" 
                                   placeholder="Last Name" value="${account.accountAddress2}">
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
