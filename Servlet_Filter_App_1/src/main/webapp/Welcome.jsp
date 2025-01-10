<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String uName = request.getParameter("uname");
String filterName = (String)request.getAttribute("filterName");
String servletName = (String)request.getAttribute("servletName");
out.println("Welcome User: "+uName+"<br>");
out.println("Filter Name: "+filterName+"<br>");
out.println("ServletName: "+servletName+"<br>");
%>
</body>
</html>