<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Xworkz</title>
</head>
<body>
	<nav class="navbar navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="30" height="24" class="d-inline-block align-text-top">
				<div>
					<span style="font-weight: bolder;">Xworkz</span></a>
		</div>
	</nav>

<span style="color: red">${userMsg}</span>
<span style="color: red">${emailMsg}</span>
<span style="color: red">${mobileMsg}</span>
<span style="color: red">${passwordMsg}</span>
<c:forEach var="vio" items="${violation }">
<span style="color: red">${vio.message}</span>
</c:forEach>
	<form action="signUp" method="post" >
		<div class="col-12">
			<label for="inputAddress" class="form-label">User ID</label> <input
				type="text" class="form-control" id="inputUserId"
				placeholder="Enter the user id" name="userId">
		</div>
		<div class="col-md-6">
			<label for="inputEmail4" class="form-label">Email</label> <input
				type="email" class="form-control" id="inputEmail" name="email"
				placeholder="Enter the email Id">
		</div>
		<div class="col-12">
			<label for="inputAddress" class="form-label">Mobile No</label> <input
				type="number" class="form-control" id="inputMobileNo"
				placeholder="Enter the mobile no" name="mobileNo">
		</div>
		<div class="col-md-6">
			<label for="inputPassword4" class="form-label">Password</label> <input
				type="password" class="form-control" id="inputPassword4"
				placeholder="enter the password" name="password">
		</div>
		<div class="col-12">
			<label for="inputAddress" class="form-label">Confirm Password</label>
			<input type="password" class="form-control" id="inputConfirmPassword"
				placeholder="re-enter the password" name="confirmPassword">
		</div>

		<div class="col-12">
			<div class="form-check">
				<input class="form-check-input" type="checkbox" id="gridCheck"
					required="required"> <label class="form-check-label"
					for="gridCheck"> Accept Agreement </label>
			</div>
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary">Sign in</button>
		</div>
		<span style="color: green">${success}</span>
		
	</form>
</body>
</html>