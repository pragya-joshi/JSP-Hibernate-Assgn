<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String userEmail="abc@gmail.com";
String userPassword="1234"; %>
<% 
String email=request.getParameter("emailId");
String password=request.getParameter("password");
if(email.length()==0 || password.length()==0){
	throw new Exception("Password or Email is blank");
}
else if(email.equals(userEmail) && password.equals(userPassword))
		out.println("User Logged In");
else
	out.println("Invalid Login Credentials");
%>
</body>
</html>