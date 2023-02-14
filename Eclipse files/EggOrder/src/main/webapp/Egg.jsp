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
		</a>
		<a href="index.jsp" class="btn btn-success">Home</a>

	</div>
	
</nav>

	<h1>Enter order details</h1>
	
<form action="egg" method="post">

<div class="mb-3">
				<label for="formFile" class="form-label">Hotel name</label> <input
					class="form-control" type="text" id="name" name="hotelName"
					placeholder="Enter the Hotel name">
			</div>
			<div>
			<select class="form-select" aria-label="Default select example" name="dishName">
  			<option selected>Dish Name</option>
  			<option value="1">Omlet</option>
  			<option value="2">Egg Chilli</option>
 			 <option value="3">Double Omlet</option>
 			 <option value="4">Egg masala</option>
 			 <option value="5">Egg bonda</option>
			</select>
			</div>
			
			<div>
			<select class="form-select" aria-label="Default select example" name="type">
  			<option selected>Type</option>
  			<option value="1">Nati</option>
  			<option value="2">Farm</option>
 			 <option value="3">Duck</option>
			</select>
			</div>
			
			<div class="mb-3">
				<label for="formFile" class="form-label">Price</label> <input
					class="form-control" type="number" id="name" name="price"
					placeholder="Enter the price">
			</div>
			
			<div class="mb-3">
				<label for="formFile" class="form-label">Quantity</label> <input
					class="form-control" type="number" id="name" name="quantity"
					placeholder="Enter the quantity">
			</div>
			
			<h6>Take away</h6>
			<div class="form-check">
 
		
  <input class="form-check-input" type="radio" value="true" id="flexCheckDefault" name="takeAway">
  <label  class="form-check-label" for="flexCheckDefault">
 Yes
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" value="false" id="flexCheckChecked" name="takeAway" checked>
  <label class="form-check-label" for="flexCheckChecked">
 No
  </label>
</div>
			
	
			<button type="Submit" name="Order" class="btn btn-dark">Order</button>

</form>

</body>
</html>