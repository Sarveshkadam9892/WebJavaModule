<%
    String choice = request.getParameter("radCurrency");
    String pageUrl = "";
    
    switch(choice){
    case "d" : 
               pageUrl = "dollar.jsp";
               break;
               
   case "p" : 
               pageUrl = "pound.jsp";
               break;
    }
 %>
 
 <jsp:forward page="<%=pageUrl %>"></jsp:forward>
       