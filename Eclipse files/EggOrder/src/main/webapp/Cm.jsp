<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
			</a> <a href="index.jsp" class="btn btn-success">Home</a>

		</div>

	</nav>

	<h1>Enter Chief Minister Info</h1>

	<form action="cm" method="post">

		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				class="form-control" type="text" id="name" name="name"
				placeholder="Enter the CM name">
		</div>
		<div>
			<select class="form-select" aria-label="Default select example"
				name="party">
				<option selected>Select</option>
				<option value="1">BJP</option>
				<option value="2">Congress</option>
				<option value="3">JDS</option>
				<option value="4">AAP</option>
				<option value="5">KJP</option>
			</select>
		</div>

		<div>
			<select class="form-select" aria-label="Default select example"
				name="state">
				<option selected>Select</option>
				<option value="1">KA</option>
				<option value="2">TN</option>
				<option value="3">KL</option>
			</select>
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">Tenure</label> <input
				class="form-control" type="number" id="name" name="tenure"
				placeholder="Enter the Tenure">
		</div>

		<h6>Portfolio</h6>
		<div class="form-floating" >
			<textarea class="form-control" placeholder="Enter the Portfolio's" name="portfolio"
				id="floatingTextarea"></textarea>
			<label for="floatingTextarea">Portfolio</label>
		</div>


		<button type="Submit" name="Order" class="btn btn-dark">Order</button>

	</form>

</body>
</html>