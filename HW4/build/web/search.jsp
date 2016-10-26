

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="database.css"/>
        <title>Search Games</title>        
    </head>
    <body>
        
        
        <form name="searchForm" action="search" method="get">
            <table class="table2">
                <th colspan="2">Search for a game:</th>
                <tr>
                    <td>Game Name:</td>
                    <td><input type="text" name="searchVal" value=""/></td>
                </tr>
            </table>
            
            <br>
            
            <input type="submit" name="submit" value="Search"/>
          
              
         </form>
    </body>
</html>
