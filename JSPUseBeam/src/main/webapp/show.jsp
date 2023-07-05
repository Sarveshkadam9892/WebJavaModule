
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
     <div class="container">

         <jsp:useBean class="com.usebeamdemo.pojo.User"
          id="u" scope="page" ></jsp:useBean>
         <jsp:setProperty property="*" name="u"/>
         
         <h2 style="color:grey; text-align:center" >User Details are : </h2>
         <ul style="colour: slateblue">
           <li>Username : <jsp:getProperty property="username" name="u"/></li>
            <li>Email : <jsp:getProperty property="email" name="u"/></li>
             <li>Contact : <jsp:getProperty property="contact" name="u"/></li>
         </ul> 
     </div>
</body>
</html>