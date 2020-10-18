<%@page import="java.util.List"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>

<h1>this is help page you know</h1>
<h1>mithilesh sha ka help page.......</h1>

<%
	// String name=(String)request.getAttribute("name");
// String city=(String)request.getAttribute("city");
// Integer rollno=(Integer)request.getAttribute("roll no");
// LocalDateTime localDateTime=(LocalDateTime)request.getAttribute("time");

// List<Integer> list=(List<Integer>)request.getAttribute("marks");
%>

<h1>it is your name: ${name}</h1>
<h1>it is your city:${city}</h1>
<h1>it is your rollno: ${rollno}</h1>
<h1>currently time:${time}</h1>

<hr>

<c:forEach var="item" items="${marks}">

<h1>${item }</h1>


</c:forEach>



</body>
</html>