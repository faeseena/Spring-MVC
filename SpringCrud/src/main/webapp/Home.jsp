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
<h1>Home Page</h1>
<h1>Welcome ${name}
</h1>
<br>
<a href="login.jsp">please login here</a>

<%
studentDTO fromdb=(studentDTO)session.getAttribute("student");
int sid=fromdb.getSid();

%>
<br>
<br>
<a href="Edit.jsp?id=<%=sid %>">Edit your details</a>
</body>
</html>