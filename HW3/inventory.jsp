<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value='/app.css' />">

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Hong's restaurant </title>
</head>
<body>
	<h2> Inventory </h2>
	
	<table>
		<thead>
			<th>name </th>
			<th>description </th>
			<th>price </th>
			<th>add </th>
			<th>remove </th>
		</thead>
		
		<tbody>
			<c:forEach items="${inventory}" var="item">
			
					<td>${item.getName()}</td>
					<td>${item.getDescription()}</td>
					<td>${item.getPrice()}</td>
					<td><a href="<c:url value='/foods/edit?id=${item.getId()}' />"
						class="button">Edit</a></td>
					<td><a
						href="<c:url value='/foods/delete?id=${item.getId()}' />"
						class="button">Remove</a></td>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>