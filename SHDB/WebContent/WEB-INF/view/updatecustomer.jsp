
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/w3.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<h1 class="text-center">Update Customer</h1>
	<div class="container">
		<div class="row">
		<a href="custlist"> &lt;-Back </a>
			<div class="col-md-6 col-md-offset-3">
				<form:form action="savecustomer" method="post" modelAttribute="customer">
				<form:hidden path="id"/>
					<div class="w3-container">
						<div class="row">
							<div class="w3-card-2">
								<table class="table">
									<tr>
										<td>Enter First Name</td>
										<td><form:input  path="firstName" /></td>
									</tr>
									<tr>
										<td>Enter Last Name</td>
										<td><form:input  path="lastName" /></td>
									</tr>
									<tr>
										<td>Enter Email Id</td>
										<td><form:input  path="emailId" /></td>
									</tr>
									<tr>
										<td colspan="2"><input type="submit"
											value="Upate Customer"
											class="w3-btn w3-ripple w3-yellow text-center"></td>

									</tr>
								</table>
							</div>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>