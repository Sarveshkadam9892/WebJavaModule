<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Divide Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
      <div class="container">
      <%
          int fnum = Integer.parseInt(request.getParameter("txtFnum"));
          int snum = Integer.parseInt(request.getParameter("txtSnum"));
      %>
      
      <h1 style="color:grey; text=align:center">Division of<%=fnum%> and <%=snum%> is <%=(fnum/snum)%></h1>
      </div>
     
</body>
</html>