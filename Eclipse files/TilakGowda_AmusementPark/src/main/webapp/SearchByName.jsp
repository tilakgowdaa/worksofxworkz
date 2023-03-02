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


<body style="background-image: url('https://c1.wallpaperflare.com/preview/866/867/579/airplanes-clouds-earth-flight.jpg');">

	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="44" class="d-inline-block align-text-top">
				X-works ODC
			</a> <a href="index.jsp" class="btn btn-success">Home</a>

		</div>

	</nav>

	<h1>Search By Name</h1>
	
	<span style="color: red">${msg }</span>
	<span style="color: red">${delete }${id }</span>
	<span style="color: red">${notDeleted }</span>
	
	<form action="findByName" method="get" >
	<input type="text" name="name" placeholder="Enter the name">
	<input type="submit" name="Submit">
	</form>
	<table class="table table-bordered" border="2">
	<tr>
	<th>ID
	<th>Name
	<th>Address
	<th>EntryFee
	<th>TicketType
	<th>Children allowed
	<th>Edit
	<th>Delete
	</tr>
	<c:forEach var="L" items="${list }">
	<tr>
	
	<td>${L.id }</td>
	<td>${L.name }</td>
	<td>${L.address }</td>
	<td>${L.entryFee }</td>
	<td>${L.ticketType }</td>
	<td>${L.childrenAllowed }</td>
	<td><a href="update?id=${L.id}">edit</a></td>
	<td><a href="delete?id=${L.id }" class="btn btn-danger">Delete</a></td>
	</tr>
	
	</c:forEach>
	
	</table>
	
	
</body>
</html>