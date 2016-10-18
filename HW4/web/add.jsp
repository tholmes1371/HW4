

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="database.css"/>
        <title>Add A New Game</title>
    </head>
    <body>
        <div>
        <h1>Add a New Game</h1>
        <form name="addForm" action="addGame" method="get">
            
            Game Name:<br>
            <input type="text" name="name" value=""/><br>
            
            Release Year:<br>
            <input type="text" name="year" value=""/><br>
            
            Console:<br>
            <input type="text" name="console" value=""/><br>
            
            <input type="submit" name="submit" value="Submit"/>
        </form>
        </div>
            
        
        
        
        
        
        
        
    </body>
</html>
