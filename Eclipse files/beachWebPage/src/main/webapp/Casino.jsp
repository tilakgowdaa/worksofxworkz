<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="44" class="d-inline-block align-text-top">
     X-works ODC
    </a>
 
  <div>
  <a href="index.jsp" style="color: white;"  class="btn btn-outline-success"  >Home</a>
  </div>
   </div>
</nav>
<body>
<form action="casino" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the name" name="name">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Cruise Name</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the Cruise name" name="cruise">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Enter Fee</label>
  <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="00.00" name="price">
</div>

<div class="form-check" >
<div><label>Free Food</label></div> 
  <input class="form-check-input" type="radio" value="Yes" id="flexCheckDefault" name="food" required="required">
 <label class="form-check-label" for="flexCheckDefault">
    Yes
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" value="No" id="flexCheckChecked" name="food" >
  <label class="form-check-label" for="flexCheckChecked">
    No
  </label>
</div>

<div class="form-check" >
<div><label>Free Alcohol</label></div> 
  <input class="form-check-input" type="radio" value="Yes" id="flexCheckDefault" name="alcohol" required="required">
 <label class="form-check-label" for="flexCheckDefault">
    Yes
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" value="No" id="flexCheckChecked" name="alcohol" >
  <label class="form-check-label" for="flexCheckChecked">
    No
  </label>
</div>

<div>
<input type="submit" class="btn btn-secondary" value="Send">
</div>
</form>
</body>
</html>