<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Series</title>
</head>
<body style="font-family: Courier">
	<h1 style="color: #404040">
		<strong>List of all Series</strong>
	</h1>
	<c:forEach var="item" items="${myListOfSeries}">
		<div>${item}</div>
	</c:forEach>
	
	<h4 style="color: #404040">
		<strong>Adriana Costa</strong>
		<strong>Filipa Costa</strong>
	</h4>
</body>
</html>