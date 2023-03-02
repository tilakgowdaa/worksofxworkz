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


<body
	style="background-image: url('https://c1.wallpaperflare.com/preview/866/867/579/airplanes-clouds-earth-flight.jpg');">

	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="44" class="d-inline-block align-text-top">
				X-works ODC
			</a> <a href="index.jsp" class="btn btn-success">Home</a> </a> <a
				href="SearchByName.jsp" class="btn btn-success">Search By Name</a>

		</div>

	</nav>


	<h1>Update the AmusementPark details</h1>

	<c:forEach items="${err }" var="V">
		<span style="color: red">${V.message}</span>

	</c:forEach>

	<span style="color: green">${msg }</span>
	

	<form action="update" method="post">

		<div class="mb-3">
			<label for="formFile" class="form-label">ID</label> <input
				class="form-control" type="number" value="${dto.id}" id="id" name="id"
				placeholder="Enter the id">
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				class="form-control" type="text" value="${dto.name}" id="name"
				name="name" placeholder="Enter the name">
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">address</label> <input
				class="form-control" type="text" id="name" value="${dto.address}"
				name="address" placeholder="Enter the address">
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">entryFee</label> <input
				class="form-control" type="text" id="name" value="${dto.entryFee}"
				name="entryFee" placeholder="Enter the fee">
		</div>


		<div>
			<label>Ticket Type</label> <select class="form-select"
				aria-label="Default select example" name="ticketType">
				<option selected value="${dto.ticketType }">${dto.ticketType }</option>
				<c:forEach items="${type }" var="t">
					<option value="${t}">${t}</option>
				</c:forEach>
			</select>
		</div>

		<div class="form-check" >
			<div>
				<label>Children allowed</label>
			</div>
			<input class="form-check-input" type="radio"
				value="${dto.childrenAllowed }" id="flexCheckDefault"
				name="childrenAllowed"> <label class="form-check-label"
				for="flexCheckDefault"> Yes </label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" 
				value="${dto.childrenAllowed }" id="flexCheckChecked"
				name="childrenAllowed" > <label class="form-check-label"
				for="flexCheckChecked"> No </label>
		</div>

		<button type="Submit" name="Order" class="btn btn-dark">Update</button>

	</form>

</body>
</html>