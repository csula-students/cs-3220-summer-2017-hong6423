<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
   <link rel="stylesheet" href="app.css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Hong's restaurant(create_food)</title>
</head>
<body>
	<point:AdminHeader/>
		<form method = "post">
			Food_name:
			</br>
				<input name = "name", type = "text">
			</br>
			URL:
			</br>
				<input name = "url" type="text">
			</br>
			Description:
			</br>
				<input name = "description">
			</br>
			Price:
			</br>
				<input name = "price"> 
			</br>
		</form>

	<button class = 'add'>Add</button>

</body>
</html>