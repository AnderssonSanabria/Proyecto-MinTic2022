<%-- 
    Document   : index
    Created on : 8/09/2021, 10:34:21 p. m.
    Author     : ander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String user = request.getParameter("user");
        String pass = request.getParameter("password"); 
        if(user.equals("user") && pass.equals("123")){
            out.println("login ok");
            }
            else{
            out.println("login failed");
            }
        %>
    </body>
</html>
