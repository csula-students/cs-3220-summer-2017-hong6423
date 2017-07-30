<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "<c:url value = '/app.css'/>">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title><h2>Hong's restaurant</h2></title>
</head>
<body>
	<header>
		<p>
			<h2>Hong's restaurant </h2>
				<ul>
					<li><a href = "<c:url value = '../orders'/>">Status</a></li>
				</ul>
		</p>
	</header>
	<table>
		<tr>
			<thead>
				<th> Name</th>
				<th> desctiption</th>
				<th> url </th>
				<th> price </th>
				<th> delete</th>
			</thead>
		</tr>
		<tbody>
	
		<tr> 
			<td> ${Fooditem.getname()}</td>
			<td> ${Fooditem.getdiscription()}</td>
			<td> ${Fooditem.geturl()}</td>
			<td> ${Fooditem.getprice()}</td>
	 		<td><a href = 'delete id = ${Fooditem.getId() }'> Remove it</a></td>
	 	</tr>
	
		</tbody>		
	</table>
	<a href = "<c:url value = '../menu.jsp'/>" class "button"> menu</a>
</body>
</html>