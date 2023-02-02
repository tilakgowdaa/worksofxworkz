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
<h2>This is interview Details</h2>
<form action="pass" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Candidate Name </label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the name" name="inter">
</div>

<div><select class="form-select" aria-label="Default select example" name="company">
  <option selected>Select company</option>
  <option value="1">Infosys</option>
  <option value="2">TCS</option>
  <option value="3">Dell</option>
</select>
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Required Role</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="enter the role" name="role">
</div>

<div>
<input type="submit" class="btn btn-secondary" value="Send">
</div>

</form>
</body>
</html>