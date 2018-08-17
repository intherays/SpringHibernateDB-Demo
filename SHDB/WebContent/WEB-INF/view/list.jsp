<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/w3.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="com.spring.hibernate.entity.Customer"%>
<div class="container">
<div class="col-md-6 col-md-offset-3">
<div class="w3-container w3-card-2">
<div class="row">
<div class="heading">
	<h1 class="text-center">Customer List</h1>
</div>
<div class="btn">
<a href="addcustomer" class="w3-btn w3-ripple w3-blue text-center"> ADD CUSTOMER</a>
</div>
</div>
<div class="row">

<table class="table" >
  <tr>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Email Id</th>
    <th colspan="2" class="text-center">Action</th>
  </tr>
  <c:forEach var="cust" items="${webCustomers}" >
  <tr>
    <td>	${cust.firstName} </td>
    <td>	${cust.lastName} </td>
      <td>	${cust.emailId} </td>
      <td class="text-center"><a href="update-customer?id=${cust.id}" >Update</a></td>
      <td class="text-center"><a href="delete?id=${cust.id}" >Delete</a></td>
  </tr>
  
</c:forEach>
</table>
</div>
</div>
</div>
</div>



