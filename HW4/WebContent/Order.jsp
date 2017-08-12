<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Hong's Restaurant</title>
<link rel="stylesheet" type="text/css" href="app.css">
</head>
<body>
	 <ul>
	 	  <c:forEach items="${list}" var="newEntry">
	 	  <li>${newEntry.Id} - ${newEntry.Name} - ${newEntry.Description} - ${newEntry.Url} - ${newEntry.Price} - ${newEntry.CustomerName}</li>
	 	 </c:forEach>
    </ul>
	  <a href="create">Add </a>
</body>
</html>

