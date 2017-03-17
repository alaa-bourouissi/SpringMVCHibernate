<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Form</title>

<link href="<c:url value='/static/css/bootstrap.min.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/bootstrap-responsive.min.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/uniform.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/select2.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/matrix-style.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/matrix-media.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/font-awesome/css/font-awesome.css' />"
	rel="stylesheet"></link>
<link
	href="<c:url value='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' />"
	rel="stylesheet" type="text/css"></link>


</head>

<body>
	<!--Header-part-->
	<div id="header">
		<h1>
			<a href="dashboard.html">Matrix Admin</a>
		</h1>
	</div>
	<!--close-Header-part-->

	<!--top-Header-menu-->
	<div id="user-nav" class="navbar navbar-inverse">
		<ul class="nav">
			<li class="dropdown" id="profile-messages"><a title="" href="#"
				data-toggle="dropdown" data-target="#profile-messages"
				class="dropdown-toggle"><i class="icon icon-user"></i> <span
					class="text">Welcome ${loggedinuser}</span><b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="#"><i class="icon-user"></i> My Profile</a></li>
					<li class="divider"></li>
					<li><a href="#"><i class="icon-check"></i> My Tasks</a></li>
					<li class="divider"></li>
					<li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
				</ul></li>
			<li class="dropdown" id="menu-messages"><a href="#"
				data-toggle="dropdown" data-target="#menu-messages"
				class="dropdown-toggle"><i class="icon icon-envelope"></i> <span
					class="text">Messages</span> <span class="label label-important">5</span>
					<b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a class="sAdd" title="" href="#"><i class="icon-plus"></i>
							new message</a></li>
					<li class="divider"></li>
					<li><a class="sInbox" title="" href="#"><i
							class="icon-envelope"></i> inbox</a></li>
					<li class="divider"></li>
					<li><a class="sOutbox" title="" href="#"><i
							class="icon-arrow-up"></i> outbox</a></li>
					<li class="divider"></li>
					<li><a class="sTrash" title="" href="#"><i
							class="icon-trash"></i> trash</a></li>
				</ul></li>
			<li class=""><a title="" href="#"><i class="icon icon-cog"></i>
					<span class="text">Settings</span></a></li>
			<li class=""><a title="" href="<c:url value="/logout" />"><i
					class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
		</ul>
	</div>

	<!--start-top-serch-->
	<div id="search">
		<input type="text" placeholder="Search here..." />
		<button type="submit" class="tip-bottom" title="Search">
			<i class="icon-search icon-white"></i>
		</button>
	</div>
	<!--close-top-serch-->

	<!--sidebar-menu-->

	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-list"></i>Forms</a>
		<ul>
			<li><a href="index.html"><i class="icon icon-home"></i> <span>Dashboard</span></a>
			</li>
			<li><a href="charts.html"><i class="icon icon-signal"></i> <span>Charts
						&amp; graphs</span></a></li>
			<li><a href="widgets.html"><i class="icon icon-inbox"></i> <span>Widgets</span></a>
			</li>
			<li><a href="tables.html"><i class="icon icon-th"></i> <span>Tables</span></a></li>
			<li><a href="grid.html"><i class="icon icon-fullscreen"></i>
					<span>Full width</span></a></li>
			<li class="submenu active"><a href="#"><i
					class="icon icon-list"></i> <span>Forms</span> <span
					class="label label-important">3</span></a>
				<ul>
					<li><a href="form-common.html">Basic Form</a></li>
					<li><a href="form-validation.html">Form with Validation</a></li>
					<li><a href="form-wizard.html">Form with Wizard</a></li>
				</ul></li>
			<li><a href="buttons.html"><i class="icon icon-tint"></i> <span>Buttons
						&amp; icons</span></a></li>
			<li><a href="interface.html"><i class="icon icon-pencil"></i>
					<span>Eelements</span></a></li>
			<li class="submenu"><a href="#"><i class="icon icon-file"></i>
					<span>Addons</span> <span class="label label-important">5</span></a>
				<ul>
					<li><a href="index2.html">Dashboard2</a></li>
					<li><a href="gallery.html">Gallery</a></li>
					<li><a href="calendar.html">Calendar</a></li>
					<li><a href="invoice.html">Invoice</a></li>
					<li><a href="chat.html">Chat option</a></li>
				</ul></li>
			<li class="submenu"><a href="#"><i
					class="icon icon-info-sign"></i> <span>Error</span> <span
					class="label label-important">4</span></a>
				<ul>
					<li><a href="error403.html">Error 403</a></li>
					<li><a href="error404.html">Error 404</a></li>
					<li><a href="error405.html">Error 405</a></li>
					<li><a href="error500.html">Error 500</a></li>
				</ul></li>
			<li class="content"><span>Monthly Bandwidth Transfer</span>
				<div
					class="progress progress-mini progress-danger active progress-striped">
					<div style="width: 77%;" class="bar"></div>
				</div> <span class="percent">77%</span>
				<div class="stat">21419.94 / 14000 MB</div></li>
			<li class="content"><span>Disk Space Usage</span>
				<div class="progress progress-mini active progress-striped">
					<div style="width: 87%;" class="bar"></div>
				</div> <span class="percent">87%</span>
				<div class="stat">604.44 / 4000 MB</div></li>
		</ul>
	</div>


	<div id="content">
		<div class="generic-container">


			<div id="content-header">
				<div id="breadcrumb">
					<a href="index.html" title="Go to Home" class="tip-bottom"><i
						class="icon-home"></i> Home</a> <a href="#">Form elements</a> <a
						href="#" class="current">Validation</a>
				</div>
			</div>

			<div class="container-fluid">
				<hr>
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon"> <i class="icon-info-sign"></i>
								</span>
								<h5>Update Users</h5>
							</div>
							<div class="widget-content nopadding">

								<form:form method="POST" modelAttribute="user"
									class="form-horizontal">
									<form:input type="hidden" path="id" id="id" />



									<div class="control-group">
										<label class="control-label">First Name</label>
										<div class="controls">
											<form:input type="text" path="firstName" id="firstName"
												style="margin-left: 5%;height:4%" />
										</div>
										<div class="has-error">
											<form:errors path="firstName" class="help-inline" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">Last Name</label>
										<div class="controls">
											<form:input type="text" path="lastName" id="lastName"
												style="margin-left: 5%;height:4%" />
										</div>
										<div class="has-error">
											<form:errors path="lastName" class="help-inline" />
										</div>
									</div>



									<div class="control-group">
										<label class="control-label">SSO ID</label>
										<div class="controls">
											<c:choose>
												<c:when test="${edit}">
													<form:input type="text" path="ssoId" id="ssoId"
														disabled="true" style="margin-left: 5%;" />
												</c:when>
												<c:otherwise>
													<form:input type="text" path="ssoId" id="ssoId"
														style="margin-left: 5%;height:4%" />

												</c:otherwise>
											</c:choose>
										</div>
									</div>



									<div class="control-group">
										<label class="control-label">Password</label>
										<div class="controls">
											<form:input type="password" path="password" id="password"
												style="margin-left: 5%;height:4%" />
										</div>
										<div class="has-error">
											<form:errors path="password" class="help-inline" />
										</div>
										
									</div>

									<div class="control-group">
										<label class="control-label">Email</label>
										<div class="controls">
											<form:input type="text" path="email" id="email"
												style="margin-left: 5%;height:4%" />
										</div>
										<div class="has-error">
											<form:errors path="email" class="help-inline" />
										</div>
										
									</div>

									<div class="widget-content nopadding">

										<div class="control-group">
											<label class="control-label">Role</label>
											<div class="controls">
												<form:select path="userProfiles" items="${roles}"
													multiple="true" itemValue="id" itemLabel="type"
													style="margin-left: 4%;" />
											</div>
											<div class="has-error">
											<form:errors path="userProfiles" class="help-inline" />
										</div>
										</div>
									</div>



									<div class="form-actions">

										<c:choose>
											<c:when test="${edit}">
												<input type="submit" value="Update"
													class="btn btn-primary btn-sm" /> or <a
													href="<c:url value='/list' />">Cancel</a>
											</c:when>
											<c:otherwise>
												<input type="submit" value="Register"
													class="btn btn-primary btn-sm" /> or <a
													href="<c:url value='/list' />">Cancel</a>
											</c:otherwise>
										</c:choose>
									</div>
								</form:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="static/js/jquery.min.js"></script>
	<script src="static/js/jquery.ui.custom.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script src="static/js/jquery.uniform.js"></script>

	<script src="static/js/jquery.validate.js"></script>
	<script src="static/js/matrix.js"></script>
	<script src="static/js/matrix.form_validation.js"></script>
</body>
</html>