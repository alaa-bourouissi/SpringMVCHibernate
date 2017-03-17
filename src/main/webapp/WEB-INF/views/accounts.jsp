<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="generic-container">
		<div class="panel panel-default">

			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>Static table</h5>
				</div>
				<div class="widget-content nopadding">
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>ID</th>
								<th>Name</th>
								<th>Edit</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${accounts}" var="account">
								<tr>
									<td>${account.id}</td>
									<td>${account.name}</td>
									<td><a href="<c:url value='/edit-account-${account.id}' />"
										class="btn btn-success custom-width">Editer</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

</body>
</html>