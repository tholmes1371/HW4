
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="database.css"/>
        <title>Game Database</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    
    <body>
        <h1>Tom's Game Database</h1>
        
        <%= table %>
        
        <br>
        
        <a href="add">Add a new game</a>
        <br><br>
        <a href="search.jsp">Search All Games</a>
        <br><br>
        <a href="read">View All Games</a>
        
    </body>
</html>
