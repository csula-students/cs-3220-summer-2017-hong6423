<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "<c:url value = '/app.css'/>">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Hong's restaurant</title>
</head>
<body>
	<ul>
	<li><a href="<c:url value='/orderpage.jsp'/>">order status</a></li>
	</ul>
	
		<table>
			<thead>
				<th> name</th>
				<th> description</th>
					<th>url </th>
						<th>price </th>
							<th> delete</th>
			</thead>
			
			
			<tbody>
				<td> ${Fooditem.getname()}</td>
				<td> ${Fooditem.getdiscription()}</td>
				<td> ${Fooditem.geturl()}</td>
				<td> ${Fooditem.getprice()}</td>
		 		<td><a href = 'delete id = ${Fooditem.getId() }'> Remove it</a></td>
		 
			</tbody>
		</table>
	
				<form action="Cart" method="post">  
       				<label>Your Name:</label> <br>
       				<input name="name" type="text">
       				<button class="button" >Order here</button>
           		</form>         
	
	
	
	
</body>
</html>