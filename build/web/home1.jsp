<%-- 
    Document   : home1
    Created on : 21-11-2016, 21:03:09
    Author     : sbh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%= request.getParameter("username")%>
        <%= request.getAttribute("userList")%>
        
    </body>
</html>
