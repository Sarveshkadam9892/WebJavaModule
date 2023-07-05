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
    <form class="from" action="show.jsp" method="get">
    
        <div class="form-group">
            <label>Enter User Name</label>
            <input type="text" class="form-control"
            placeholder="User Name" name="username">  
        </div>
        
       <div class="form-group">
            <label>Enter User Email</label>
            <input type="email" class="form-control"
            placeholder="User Email" name="email">  
        </div>
        
         <div class="form-group">
            <label>Enter User Contact Number</label>
            <input type="text" class="form-control"
            placeholder="User Contact" name="contact">  
        </div>
        
      <input type="submit" class="btn btn-block btn-success"
      value="Click to Send" name="btnSend">
    </form>
    </div>
</body>
</html>