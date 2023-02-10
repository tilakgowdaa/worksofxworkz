<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> </a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
		</div>


	</nav>

	<h1>Welcome to bekary</h1>
	<pre>
<form action="cake" method="post">
<div class="mb-3">
				<label for="formFile" class="bekary">BakeryName</label> <input
					class="form-control" type="text" id="name" name="name"
					placeholder="Enter your bekary name">
			</div>
			<div class="mb-3">
				<label for="formFile" class="bekary">BakeryOwnerName</label> <input
					class="form-control" type="text" id="name" name="ownerName"
					placeholder="Enter bekary Owner name">
			</div>
			<div class="mb-3">
				<label for="formFile" class="bekary">BakeryOwnerWifeName</label> <input
					class="form-control" type="text" id="name" name="wifeName"
					placeholder="Enter bekary Owner wife name">
			</div>
			<div class="form-check">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
  <label class="form-check-label" for="flexRadioDefault1">
   married
  </label>
</div>

<div class="form-floating">
  <textarea class="form-control" placeholder="famousFor"
				name="famousFor"	id="floatingTextarea"></textarea>
  <label for="floatingTextarea">famousFor</label>
</div>
<div class="mb-3">
				<label for="formFile" class="bekary">Since</label> <input
					class="form-control" type="text" id="name" name="since"
					placeholder="since">
			</div>
			<button type="Submit" name="save" class="btn btn-dark">cake</button>

</form>
</pre>
</body>
</html>