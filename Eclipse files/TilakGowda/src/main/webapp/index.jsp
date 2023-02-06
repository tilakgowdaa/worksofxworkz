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
<nav class="navbar navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			alt="" width="80" height="44" class="d-inline-block align-text-top">
			X-works ODC
		</a>

	</div>
</nav>
<body>
	<h4>Click to get the Data</h4>

	<form action="email" method="post">
		<input type="submit" value="Email" class="btn btn-outline-success" />
		<br> <label>${email}</label>
	</form>
	<br>
	<form action="mobile" method="post">
		<input type="submit" value="Mobile" class="btn btn-outline-success" />
		<br> <label>${mobile}</label>
	</form>
	<br>
	<form action="aadhar" method="post">
		<input type="submit" value="Aadhar" class="btn btn-outline-success" />
		<br> <label>${aadhar}</label>
	</form>
	<br>
	<form action="age" method="post">
		<input type="submit" value="Age" class="btn btn-outline-success" /> <br>
		<label>${age}</label>
	</form>
	<br>
	<form style="margin-top: -340px; margin-left: 150px;" action="dob"
		method="post">
		<input type="submit" value="DOB with Time"
			class="btn btn-outline-success" /> <br> <label>${dob}</label>
	</form>
	<br>
	<form style="margin-left: 150px;" action="salary" method="post">
		<input type="submit" value="Desired Salary"
			class="btn btn-outline-success" /> <br> <label>${salary}</label>
	</form>
	<br>
	<form style="margin-left: 150px;" action="friend" method="post">
		<input type="submit" value="List Of Friends"
			class="btn btn-outline-success" /> <br>
		<ul>
			<c:forEach items="${friend}" var="reference">
				<li>${reference}</li>
			</c:forEach>
		</ul>
	</form>
	<br>
	<form style="margin-left: 150px;" action="place" method="post">
		<input type="submit" value="List Of visited Places"
			class="btn btn-outline-success" /> <br>
		<ul>
			<c:forEach items="${place}" var="reference">
				<li>${reference}</li>
			</c:forEach>
		</ul>
	</form>
	<br>
	<form style="margin-top: -340px; margin-left: 350px;" action="skill"
		method="post">
		<input type="submit" value="List Of Skill Set"
			class="btn btn-outline-success" /> <br>
		<ul>
			<c:forEach items="${skill}" var="reference">
				<li>${reference}</li>
			</c:forEach>
		</ul>
	</form>
	<br>
	<form style="margin-left: 350px;" action="education" method="post">
		<input type="submit" value="EducationDTO" class="btn btn-outline-success" />
		 <br><label>${info.qualification}</label>
		 <br><label>${info.schoolName}</label>
		 <br><label>${info.sslcPercentage}</label>
		 <br><label>${info.diplomaCollege}</label>
		 <br><label>${info.diplomaPercentage}</label>
		 <br><label>${info.engineeringCollege}</label>
		 <br><label>${info.bePercentage}</label>
		 <br><label>${info.branch}</label>
		 <br><label>${info.trainingInstitute}</label>
		 <br><label>${info.learntJava}</label>
		 
		</form>
		<br>
		<form style="margin-left: 350px;" action="family" method="post">
		<input type="submit" value="FamilyDTO" class="btn btn-outline-success" />
		 <br><label>${fam.motherName}</label>
		 <br><label>${fam.fatherName}</label>
		 <br><label>${fam.siblings}</label>
		 <br><label>${fam.siblingRelation}</label>
		 <br><label>${fam.siblingName}</label>
		 <br><label>${fam.noOfPeople}</label>
		 <br><label>${fam.livesIn}</label>
		 <br><label>${fam.grandFather}</label>
		 <br><label>${fam.grandMother}</label>
		 <br><label>${fam.married}</label>
		 </form>
		 <br>
		 <form style="margin-top: -660px; margin-left: 650px;" action="mobiledto" method="post">
		<input type="submit" value="MobileDTO" class="btn btn-outline-success" />
		 <br><label>${sim.company}</label>
		 <br><label>${sim.model}</label>
		 <br><label>${sim.noOfSim}</label>
		 <br><label>${sim.simCompany}</label>
		 <br><label>${sim.dualSim}</label>
		 </form>
		<br>
		<form style="margin-left: 650px" action="juice" method="post">
		<input type="submit" value="BeverageDTO" class="btn btn-outline-success" />
		 <br><label>${drink.brand}</label>
		 <br><label>${drink.price}</label>
		 <br><label>${drink.alcohol}</label>
		 <br><label>${drink.quantity}</label>
		 <br><label>${drink.color}</label>
		 <br><label>${drink.tastesGood}</label>
		 <br><label>${drink.goodForHealth}</label>
		 <br><label>${drink.madeOfFruit}</label>
		 </form>
		 <br>
		 <form style="margin-left: 650px" action="chat" method="post">
		<input type="submit" value="ChatDTO" class="btn btn-outline-success" />
		 <br><label>${chat.name}</label>
		 <br><label>${chat.price}</label>
		 <br><label>${chat.goodForHealth}</label>
		 <br><label>${chat.available}</label>
		 <br><label>${chat.shopName}</label>
		 <br><label>${chat.ownerName}</label>
		 <br><label>${chat.tastesGood}</label>
		 <br><label>${chat.location}</label>
		 <br><label>${chat.distance}</label>
		 <br><label>${chat.shopOpensAt}</label>
		 <br><label>${chat.shopClosesAt}</label>
		 </form>


</body>
</html>