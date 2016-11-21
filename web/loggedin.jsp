
<%@page import="Domain.User"%>
<%@page import="java.util.List"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!--Thomas: Jeg har tilføjer de 2 linjer ovenfor. Desuden har jeg tilføjet jstl jar fil fra: http://central.maven.org/maven2/javax/servlet/jstl/1.2/jstl-1.2.jar-->
 
<%-- 
    Document   : loggedin
    Created on : 21-11-2016, 13:41:43
    Author     : sbh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href="css/jspStyles.css" rel="stylesheet" type="text/css"/>
    <body>
        <h1>Liste med alle brugere</h1>
        <div class="menubar">
            Logget ind som: <%= request.getParameter("username")%>         
        </div>      

<c:forEach var="asd" items="${requestScope.userlist}">
    <%-- This calls the getId() method on your asd object --%>
    <c:out value="${asd.id}"/>
    <%-- This calls the getName() method on your asd object --%>
    <c:out value="${asd.username}"/>
    <%-- This calls the getAge() method on your asd object --%>
    <c:out value="${asd.password}"/>
</c:forEach>
        <!--Thomas: Hver af disse linjer skal pakkes ind i <tr> og hvert felt i <td> tags-->
</table>
    </body>
</html>
