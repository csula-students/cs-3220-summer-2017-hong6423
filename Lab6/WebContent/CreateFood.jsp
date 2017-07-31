<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="app.css">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>New Food</title>
</head>
<body>
	  <form method="POST">
	  
	   <div>
            <label for="Food">Name:</label>
            <textarea id="name" type = "text" name="name" cols="30" rows="10"></textarea>
        </div>
        
         <div>
            <label for="Food">Description:</label>
            <textarea id="description" type = "text" name="description" cols="30" rows="10"></textarea>
        </div>
        
         <div>
            <label for="Food">Url:</label>
            <textarea id="url" type = "text" name="url" cols="30" rows="10"></textarea>
        </div>
        
         <div>
            <label for="price">Price:</label>
            <textarea id="price" type = "text" name="price" cols="30" rows="10"></textarea>
        </div>
	  
	  
	     <button>Post</button>
	  
	  
	  
</body>
</html>