<%@page import="com.demo.test.DTO.Registration.studentDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int id=Integer.parseInt(request.getParameter("id"));
studentDTO fromdb=(studentDTO)session.getAttribute("student");

%>
<h1>Update Registration</h1>
<form action="update.do" method="post">
Student Id    : <input type="text" name="sid" value="<%=fromdb.getSid()%>" disabled="disabled"><br> 
<br>

Student Name     : <input type="text" name="sname" value="<%=fromdb.getSname()%>"> <BR>
<br> 

Student Address  : <input type="text" name="Addr" value="<%=fromdb.getAddr()%>"> <br>
<br> 
Student Course   :<select name="course" ><br>
<br> 
<option><%=fromdb.getCourse()%></option>
<option value="BCOM">BCOM</option>
<option value="BSC">BSC COMPUTER SCIENCE</option>
<option value="BCA">BCA</option>
<option value="MCOM">MCOM</option>
<option value="MSC">MSC</option>
<option value="MCA">MCA</option>

</select><br>
<br> 
Student place    : <input type="text" name="place" value="<%=fromdb.getPlace()%>"><br> 
<br> 
Student Age      :<input type="number"  name="sage" value="<%=fromdb.getSage()%>"><br>
<br> 
Email Id         :<input type="email" name="email" value="<%=fromdb.getEmail()%>"><br>
<br>
password         :<input type="password" name="pwd" value="<%=fromdb.getPwd()%>"><br>

<br>
<input type="submit" value="Update">
</form>
</body>
</html>