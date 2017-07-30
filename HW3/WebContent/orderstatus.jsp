<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value='/app.css' />">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Hong's restaurant</title>
</head>
<body>
	<ul>
		<li><a href="<c:url value='/orderpage.jsp'/>">order status</a></li>
	</ul>

		<table>
			<thead> 
				<th>order </th>
					<th>customer </th>
						<th>status </th>
						
			</thead>
			
			<tbody>
				<td> ${order.getId()}</td>
				<td><select>
				<option value="pending">progress</option>
				<option value="in-queue">que</option>
				<option value="completed">complete</option>
				</select></td>
			</tbody>
		</table>
</body>
</html>