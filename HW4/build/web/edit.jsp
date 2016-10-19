

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="database.css"/>
        <title>Edit A Game</title>
    </head>
    
    <%
        
        int gameID = Integer.parseInt(request.getParameter("gameID"));
        String gameName = request.getParameter("gameName");
        int releaseYear = Integer.parseInt(request.getParameter("releaseYear"));
        String console = request.getParameter("console");
        
     %>


     
     
     
    <body>
        
        
        <form name="editForm" action="editGame" method="get">
            <h2>Edit a Game</h2>
            Game ID:
            <input type="text" name="gameID" value="<%= gameID %>"/><br>
            
            Game Name:<br>
            <input type="text" name="name" value="<%= gameName %>"/><br>
            
            Release Year:<br>
            <input type="text" name="year" value="<%= releaseYear %>"/><br>
            
            Console:<br>
            <input type="text" name="console" value="<%= console %>"/><br><br>
            
            <input type="submit" name="submit" value="Submit"/>
        </form>
        
            
        
        
        
        
        
        
        
    </body>
</html>
