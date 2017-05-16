<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index2</title>
</head>
<body>
<style>
table, th, td
{
border: 1px solid black;
}
</style>
	<table style="align:center;">
		<tr>
			<th>SerialNumber</th>
			<th>Price</th>
			<th>Builder</th>
			<th>Model</th>
			<th>Type</th>
			<th>BackWood</th>
			<th>TopWood</th>
		</tr>
		<c:forEach items="${requestScope.results}" var="guitar">
			<tr>
				<td>${guitar.getSerialNumber()}</td>
				<td>${guitar.getPrice()}</td>
				<td>${guitar.getBuilder()}</td>
				<td>${guitar.getModel()}</td>
				<td>${guitar.getType()}</td>
				<td>${guitar.getBackWood()}</td>
				<td>${guitar.getTopWood()}</td>	
			</tr>
		</c:forEach>
	</table>
	
</body>

</html>