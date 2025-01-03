<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>User Details</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="details-container">
        <h2>User Registration Details</h2>
        <p><strong>Username:</strong>${username}</p>
        <p><strong>First Name:</strong>${firstname}</p>
        <p><strong>Last Name:</strong>${lastname}</p>
        <p><strong>City:</strong>${city}</p>
        <p><strong>Email:</strong>${mailId}</p>
        <p><strong>Phone Number:</strong>${phone}</p>
    </div>
</body>
</html>