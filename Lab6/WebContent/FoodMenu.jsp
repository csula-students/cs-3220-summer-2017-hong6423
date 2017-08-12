<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="app.css">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Menu</title>
</head>
<body>
	<table>
		<thead> <tr>
			<th>Name </th>
			<th>Description </th>
			<th>Url </th>
			<th>Price </th>
						
		</tr></thead>
		<tbody>
			<ul>
		   		 <c:forEach items="${list}" var="entry">
		   		 <li>${Entry.name} - ${Entry.description} - ${Entry.url - ${Entry.price}</li>
		   		 </c:forEach>
			 </ul>
				
		
		
		</tbody>
	
	
	</table>
		//<a href="Menu/create">Add new comment</a>

</body>
</html>