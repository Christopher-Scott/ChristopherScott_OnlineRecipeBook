<%@ page language="java" contentType="text/html"%>
<%@ page import="java.text.*,java.util.*"%>
<html>
<head>
<title>Date JSP</title>
</head>
<% SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy"); %>
<body>
<h1>You did it! Today is <%= sdf.format(new Date()) %></h1>
</body>
</html>