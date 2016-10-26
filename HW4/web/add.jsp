

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="database.css"/>
        <title>Add A New Game</title>
    </head>
    <body>
        
        
        <form name="addForm" action="addGame" method="get">
            
            <table class="table2">
                <th colspan="2">Add A New Game:</th>
                <tr>
                    <td>Game Name:</td>
                    <td><input type="text" name="name" value=""/></td>
                </tr>
                
                <tr>
                    <td>Release Year:</td>
                    <td><input type="text" name="year" value=""/></td>
                </tr>
                
                <tr>
                    <td>Console:</td>
                    <td><input type="text" name="console" value=""/></td>
                </tr>
            
            </table>
            <br>
            <input type="submit" name="submit" value="Submit"/>
            <input type="reset" name ="reset" value="Reset" />
        </form>
        
            
        
        
        
        
        
        
        
    </body>
</html>
