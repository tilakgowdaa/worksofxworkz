<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>


<body>

	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="44" class="d-inline-block align-text-top">
				X-works ODC
			</a> <a href="AeroplaneSearch.jsp" class="btn btn-success">Search</a>

		</div>

	</nav>

	<h1>Enter Aeroplane details</h1>

	<c:forEach var="V" items="${violation }">
	<span style="color: red">${V.message}</span><br>
	</c:forEach>

	<form action="plane" method="post">

		<div class="mb-3">
			<label for="formFile" class="form-label">Company</label> <input
				class="form-control" type="text" value="${dto.company}" id="name"
				name="company" placeholder="Enter the company">
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				class="form-control" type="text" id="name" value="${dto.name}"
				name="name" placeholder="Enter the name">
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">Cost</label> <input
				class="form-control" type="text" id="name" value="${dto.cost}"
				name="cost" placeholder="Enter the name">
		</div>


		<div>
			<label>Type</label> <select class="form-select"
				aria-label="Default select example" name="type">
				<option value="">Select</option>
				<c:forEach items="${type }" var="t">
					<option value="${t}">${t}</option>
				</c:forEach>
			</select>
		</div>

		<div>
			<label>Country</label> <select class="form-select"
				aria-label="Default select example" name="country">
				<option value="">Select</option>
				<c:forEach items="${country }" var="c">
					<option value="${c }">${c }</option>
				</c:forEach>
			</select>
		</div>
		<br>

		<button type="Submit" name="Order" class="btn btn-dark">Send</button>

	</form>

</body>
</html>