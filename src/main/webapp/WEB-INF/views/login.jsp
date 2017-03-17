<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
        <title>Matrix Admin</title><meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <link href="<c:url value='/static/css/bootstrap.min.css' />"  rel="stylesheet"></link>
                <link href="<c:url value='/static/css/bootstrap-responsive.min.css' />"  rel="stylesheet"></link>
                <link href="<c:url value='/static/css/matrix-login.css' />"  rel="stylesheet"></link>
                <link href="<c:url value='/static/font-awesome/css/font-awesome.css' />"  rel="stylesheet"></link>
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'></link>

    </head>
    <body>
        <div id="loginbox">
            <c:url var="loginUrl" value="/login" />            
            <form id="loginform" class="form-vertical" action="${loginUrl}" method="post">
				
				 <div class="control-group normal_text"> <h3><img src="static/img/logo.png" alt="Logo" /></h3></div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lg"><i class="icon-user"> </i></span><input type="text" id="username" name="ssoId" placeholder="Username" required/>
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_ly"><i class="icon-lock"></i></span><input type="password" id="password" name="password" placeholder="Password" required/>
                        </div>
                    </div>
                </div>
                            <div class="input-group input-sm">
                              <div class="checkbox">
                                <label><input type="checkbox" id="rememberme" name="remember-me"> Remember Me</label>  
                              </div>
                            </div>
			    <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
                <div class="form-actions">
                    <span class="pull-left"><a href="#" class="flip-link btn btn-info" id="to-recover">Lost password?</a></span>
                    <span class="pull-right"><input type="submit"  class="btn btn-success" value="Login"> </span>
                </div>
                
                <c:if test="${param.error != null}">
					<div class="alert alert-danger">
						<p style="text-align: center">Invalid username and password.</p>
					</div>
				</c:if>
				<c:if test="${param.logout != null}">
					<div class="alert alert-success">
						<p style="text-align: center">You have been logged out successfully.</p>
					</div>
				</c:if>
            </form>
            <form id="recoverform" action="#" class="form-vertical">
				<p class="normal_text">Enter your e-mail address below and we will send you instructions how to recover a password.</p>
				
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lo"><i class="icon-envelope"></i></span><input type="text" placeholder="E-mail address" />
                        </div>
                    </div>
               
                <div class="form-actions">
                    <span class="pull-left"><a href="#" class="flip-link btn btn-success" id="to-login">&laquo; Back to login</a></span>
                    <span class="pull-right"><a class="btn btn-info"/>Reecover</a></span>
                </div>
            </form>
        </div>
        
        <script src="static/js/jquery.min.js"></script>  
        <script src="static/js/matrix.login.js"></script> 
    </body>
</html>