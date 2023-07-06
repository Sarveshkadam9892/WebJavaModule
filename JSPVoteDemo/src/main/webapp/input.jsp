<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
     <div class="container">
     <form class="form" action="show.jsp"  method="get">
     
     <div class="form-group">
     <lable>Enter Name</lable>
     <input type="text" class="form-control"
     placeholder= "Name" name="txtname">
     </div>
     
     <div class="form-group">
     <lable>Enter Age</lable>
     <input type="text" class="form-control"
     placeholder= "Age" name="txtage">
     </div>
     
     <input type="submit" class="btn btn-block btn-success"
     value="Click to check" name="btnCheck"> 
     </form>
     </div>
</body>
</html>