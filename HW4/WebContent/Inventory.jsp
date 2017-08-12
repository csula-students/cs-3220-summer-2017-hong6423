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
	 	  <c:forEach items="${list}" var="entry">
	 	  <li>${newEntry.name} - ${newEntry.description} - ${newEntry.Url}- ${newEntry.Price}</li>
	 	 </c:forEach>
    </ul>
	  <a href="create">Add new comment</a>
</body>
</html>

