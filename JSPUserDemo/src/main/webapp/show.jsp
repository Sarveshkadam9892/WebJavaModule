<%@page import="com.usebeamdemo.pojo.User"%>
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
         <%
            String uname = request.getParameter("txtUname");
            String email = request.getParameter("txtEmail");
            String contact = request.getParameter("txtContact");
            
            User u = new User();
            u.setUsername(uname);
            u.setEmail(email);
            u.setContact(contact);
         %>
         
         <h2 style="color:grey; text-align:center" >User Details are : </h2>
         <ul style="colour:slateblue">
           <li>Username : <%=u.getUsername() %></li>
            <li>Email : <%=u.getEmail() %></li>
             <li>Contact : <%=u.getContact() %></li>
         </ul> 
     </div>
</body>
</html>