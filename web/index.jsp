<%-- 
    Document   : index
    Created on : Dec 22, 2015, 7:18:16 PM
    Author     : M-Hadad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Email</title>
    </head>
    <body>
        <div>
            <p id = "error"></p>
            <form method="POST" action="Login">
                <table>
                    <tr><td>Username: </td><td><input type="text" name = "email"></td><tr>
                    <tr><td>Password: </td><td><input type="password" name = "password"></td><tr>                      
                </table>
                <input type="submit" value = "Login">
            </form>
        </div>
    </body>
</html>
