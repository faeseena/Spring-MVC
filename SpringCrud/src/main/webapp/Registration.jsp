<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Student Registration</h1>
<form action="register.do" method="post">
Student Name     : <input type="text" name="sname"> <BR>
<br> 

Student Address  : <input type="text" name="Addr"> <br>
<br> 
Student Course   :<select name="course"><br>
<br> 
<option value="BCOM">BCOM</option>
<option value="BSC">BSC COMPUTER SCIENCE</option>
<option value="BCA">BCA</option>
<option value="MCOM">MCOM</option>
<option value="MSC">MSC</option>
<option value="MCA">MCA</option>

</select><br>
<br> 
Student place    : <input type="text" name="place"><br> 
<br> 
Student Age      :<input type="number"  name="sage"><br>
<br> 
Email Id         :<input type="email" name="email"><br>
<br>
password         :<input type="password" name="pwd"><br>
<br>
<input type="submit" value="Register">




</form>
</body>
</html>