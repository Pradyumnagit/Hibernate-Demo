<%-- 
    Document   : index
    Created on : Jan 26, 2019, 10:54:40 PM
    Author     : Pradyumna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="RegisterServlet" method="Post">
            
            <input type="password" name="upass" placeholder="Enter Password"><br>
            <input type="email" name="umail" placeholder="Enter Mail-id"><br>
            <input type="submit" name="submit" value="submit">
           </form>
    </body>
</html>
