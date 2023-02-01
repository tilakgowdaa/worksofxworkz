<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="44" class="d-inline-block align-text-top">
     X-works ODC
    </a>
    <a href="index.jsp" style="color: white;" class="btn btn-outline-success">Home</a>
  </div>
</nav>
<body>
<form action="food" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name of the food</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the food name" name="name">
</div>

<div><select class="form-select" aria-label="Default select example" name="type">
  <option selected>Type</option>
  <option value="1">Veg</option>
  <option value="2">Non-Veg</option>
  <option value="3">Both</option>
</select>
</div>


<div>
<label for="customRange2" class="form-label">Quantity</label>
<input type="range" class="form-range" min="0" max="5" id="customRange2" name="quantity">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Price</label>
  <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="00.00" name="price">
</div>

<div>
<input type="submit" class="btn btn-secondary" value="Send">
</div>

</form>
</body>
</html>