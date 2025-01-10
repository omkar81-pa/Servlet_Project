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
		String pCode = request.getParameter("code");
		String pName = request.getParameter("name");
		float pPrice = Float.parseFloat(request.getParameter("price"));
		int pQty = Integer.parseInt(request.getParameter("qty"));
		out.println("**********Product Details**********<br>");
		out.println("Product Code:"+pCode+"<br>");
		out.println("Product Name:"+pName+"<br>");
		out.println("Product Price:"+pPrice+"<br>");
		out.println("Product Qty:"+pQty+"<br>");
	%>
</body>
</html>