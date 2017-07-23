<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
     <%@ taglib uri="admin-header.tld" prefix= "point"%>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="app.css">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Hong's restaurant(order_statuses)</title>
</head>



<body>
	<table>
		<tr>
			<th> Creat</th>
			<th> Item</th>
			<th> Customer</th>
			<th> Status</th>
		</tr>
			<td> <img src="http://www.danjee.com.au/home/wp-content/themes/theme/img/menu.png" alt="Bibimbap" width="300" height="300">
			</td>
			<td><select>
				<option value = "pending"> pending </option>
				<option value = "completed"> complete</option>
			</select>
	
	</table>
</body>
</html>