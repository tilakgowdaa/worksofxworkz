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

	<h1>Search By ID</h1>

	<form action="search" method="post">
		<input type="number" name="id" placeholder="Enter the ID"> <input
			type="submit" value="Submit">
</form>

<span style="color:red" >${msg } </span>

	<h3 style="color:blue">

	
	
		<%-- Name:${dto.name } <br>
		Address:${dto.address } <br> 
		EntryFee:${dto.entryFee} <br>
		TicketType:${dto.ticketType }<br> 
		Children Allowed:${dto.childrenAllowed } <br> --%>

	</h3>
	
	<table border="2" class="table table-bordered">
	<tr>
	<th>Name</th>
	<td>${dto.name }</td>
	</tr>
	
	<tr>
	<th>Address</th>
	<td>${dto.address }</td>
	</tr>
	
	<tr>
	<th>EntryFee</th>
	<td>${dto.entryFee }</td>
	</tr>
	
	<tr>
	<th>TicketType</th>
	<td>${dto.ticketType }</td>
	</tr>
	
	<tr>
	<th>Children Allowed</th>
	<td>${dto.childrenAllowed }</td>
	</tr>
	
	</table>
	</body>
</html>