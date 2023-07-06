<%@page import="com.jspvotedemo.pojo.User"%>
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
        
      <h2>Voting Eligibility Check Result</h2>
       <%
       String feedback;
       String uname = request.getParameter("txtname");
       int uage = Integer.parseInt(request.getParameter("txtage"));
  
       User u = new User();
       u.setName(uname);
       u.setAge(uage);
       
       if(uage >= 18){
    	   feedback = "Congratulations, " + u.getName() + " You are eligible to vote.";
       }else{
    	   feedback = "Sorry, " + u.getName() + ". You are not eligible to vote yet.";   
       }
       %>
       
        <p><%= feedback %></p>
     </div>
</body>
</html>