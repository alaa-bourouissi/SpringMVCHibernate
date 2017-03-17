<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Form</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<div class="generic-container">


		<div class="well lead">Account Registration Form</div>
		<form:form method="POST" modelAttribute="account"
			class="form-horizontal">
			<form:input type="hidden" path="id" id="id" />

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="name"> Name</label>
					<div class="col-md-7">
						<form:input type="text" path="name" id="name"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="name" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Register"
						class="btn btn-primary btn-sm" /> or <a
						href="<c:url value='/accounts' />">Cancel</a>
				</div>
				
			</div>
			<h1>Alaa</h1>
			<h2>
				<c:out value="${message}" />
			</h2>
			<h1>bourouissi</h1>

		</form:form>
	</div>
</body>
</html>