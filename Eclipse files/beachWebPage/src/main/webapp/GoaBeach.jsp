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
<form action="beach" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name of the beach</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the beach name" name="name">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Location</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the Location" name="location">
</div>


<div class="form-check" >
<div><label>Is Clean</label></div> 
  <input class="form-check-input" type="radio" value="Yes" id="flexCheckDefault" name="clean" required="required">
 <label class="form-check-label" for="flexCheckDefault">
    Yes
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" value="No" id="flexCheckChecked" name="clean">
  <label class="form-check-label" for="flexCheckChecked">
    No
  </label>
</div>
<div><select class="form-select" aria-label="Default select example" name="games">
  <option selected>Games</option>
  <option value="1">Parasailing</option>
  <option value="2">Scuba Diving</option>
  <option value="3">Paragliding</option>
</select>
</div>
<div>
<input type="submit" class="btn btn-secondary" value="Send">
</div>
</form>
</body>
</html>