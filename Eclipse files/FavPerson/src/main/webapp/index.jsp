<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Send Details of Favorite Person</h1>
<form action="detail" method="post">
<pre>
First Name <input type="text" name="fname"/>
Last Name <input type="text" name="lname"/>
Gender <input value="Male" type="radio" name="gender"checked="checked">
<input value="Female" type="radio" name="gender" checked="checked">
Reason <textarea rows="4" cols="10" name="reason"></textarea>
Address <textarea rows="4" cols="10" name="address"></textarea>
<input type="submit" value="Send">
</pre>
</form>
</body>
</html>