<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="Error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
float avg(int x, int y){
	float z = (float)(x+y)/2;
	return z;
}
%>
<%
int v1 = Integer.parseInt(request.getParameter("v1"));
int v2 = Integer.parseInt(request.getParameter("v2"));
float res = avg(v1, v2);
out.println("Average: "+res+"<br>");
%>
<%@include file="input.html" %>
</body>
</html>