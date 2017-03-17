<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List</title>
<link href="<c:url value='/static/css/bootstrap.min.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/bootstrap-responsive.min.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/fullcalendar.css' />"
	rel="stylesheet"></link>
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
		<a href="#" class="visible-phone"><i class="icon icon-th"></i>Tables</a>
		<ul>
			<li><a href="index.html"><i class="icon icon-home"></i> <span>Dashboard</span></a>
			</li>
			<li><a href="charts.html"><i class="icon icon-signal"></i> <span>Charts
						&amp; graphs</span></a></li>
			<li><a href="widgets.html"><i class="icon icon-inbox"></i> <span>Widgets</span></a>
			</li>
			<li class="active"><a href="tables.html"><i
					class="icon icon-th"></i> <span>Tables</span></a></li>
			<li><a href="grid.html"><i class="icon icon-fullscreen"></i>
					<span>Full width</span></a></li>
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>Forms</span> <span class="label label-important">3</span></a>
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


	<!-- ------------------------------------------------------------------------------------------------- -->

	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a>
			</div>
			<h1>Liste Utilisateurs</h1>
		</div>
		<div class="container-fluid">
			<hr>
			<div class="row-fluid">
				<div class="span12">

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
												<th>Firstname</th>
												<th>Lastname</th>
												<th>Email</th>
												<th>SSO ID</th>
												<sec:authorize access="hasRole('ADMIN') or hasRole('DBA')">
													<th width="100"></th>
												</sec:authorize>
												<sec:authorize access="hasRole('ADMIN')">
													<th width="100"></th>
												</sec:authorize>
												<sec:authorize access="hasRole('ADMIN') or hasRole('DBA')">
													<th width="100"></th>
												</sec:authorize>
												<sec:authorize access="hasRole('ADMIN') or hasRole('DBA')">
													<th width="100"></th>
												</sec:authorize>

											</tr>
										</thead>
										<tbody style="font-size: 14px;">
											<c:forEach items="${users}" var="user">
												<tr>
													<td>${user.firstName}</td>
													<td>${user.lastName}</td>
													<td>${user.email}</td>
													<td>${user.ssoId}</td>
													<sec:authorize access="hasRole('ADMIN') or hasRole('DBA')">
														<td style="text-align: center"><a
															href="<c:url value='/edit-user-${user.ssoId}' />"
															class="btn btn-success btn-mini">Editer</a></td>
													</sec:authorize>
													<sec:authorize access="hasRole('ADMIN')">
														<td style="text-align: center"><a
															href="<c:url value='/delete-user-${user.ssoId}' />"
															class="btn btn-danger btn-mini">Supprimer</a></td>
													</sec:authorize>
													<td style="text-align: center"><a
														href="<c:url value='/list-account-${user.id}' />"
														class="btn btn-primary btn-mini">Comptes</a></td>

													<td style="text-align: center"><a
														href="<c:url value='/add-document-${user.id}' />"
														class="btn btn-primary btn-mini">Documents</a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<sec:authorize access="hasRole('ADMIN')">
							<div class="well">
								<a href="<c:url value='/newuser' />">Add New User</a>
							</div>
						</sec:authorize>
					</div>




				</div>
			</div>
		</div>
	</div>
	<!--Footer-part-->
	<div class="row-fluid">
		<div id="footer" class="span12">
			2013 &copy; Matrix Admin. Brought to you by <a
				href="http://themedesigner.in">Themedesigner.in</a>
		</div>
	</div>
	<!--end-Footer-part-->
	<script src="static/js/jquery.min.js"></script>
	<script src="static/js/jquery.ui.custom.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script src="static/js/jquery.uniform.js"></script>
	<script src="static/js/select2.min.js"></script>
	<script src="static/js/jquery.dataTables.min.js"></script>
	<script src="static/js/matrix.js"></script>
	<script src="static/js/matrix.tables.js"></script>
</body>
</html>