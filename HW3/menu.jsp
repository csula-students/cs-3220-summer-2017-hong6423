<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value='/app.css' />">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li><a href="<c:url value='/orderpage.jsp'/>">order status</a></li>
	</ul>
			
	<h1> Hong's restaurant</h1>
		<thead>
				<th> name</th>
				<th> description</th>
					<th>url </th>
						<th>price </th>
							<th> delete</th>
			</thead>
			<c:forEach items="${Inventory}" var="item">
				<tr>
					<td> ${foods.getName()} </td>
					<td> ${foods.getdiscription()}</td>
					<td> ${foods.geturl()}</td>
							<td><a href="<c:url value='/AddCart?Id=${foods.getId()}' />" class="button">Add Cart</a></td>
						
				</tr>
			</c:forEach>


</body>
</html>