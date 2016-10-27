

<%@page import="model.Games"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<% Games game = (Games) request.getAttribute("game");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="database.css"/>
        <title>Edit A Game</title>
    </head>


    <body>
        <div class="wrap"> <!-- wrap -->

            <%@include file="includes/header.jsp" %>

            <%@include file="includes/menu.jsp" %>

            <div class="main"> <!-- main -->


                <form name="editForm" action="editGame" method="get">
                    <table class="table2">
                        <th colspan="2">Edit a Game:</th>
                        <tr>
                            <td>Game ID:</td>
                            <td><input type="text" name="gameID" value="<%= game.getGameID()%>" readonly/></td>
                        </tr>

                        <tr>
                            <td>Game Name:</td>
                            <td><input type="text" name="name" value="<%= game.getGameName()%>"/></td>
                        </tr>

                        <tr>
                            <td>Release Year:</td>
                            <td><input type="text" name="year" value="<%= game.getReleaseYear()%>"/></td>
                        </tr>

                        <tr>
                            <td>Console:</td>
                            <td><input type="text" name="console" value="<%= game.getConsole()%>"/></td>
                        </tr>

                    </table>
                    <br>
                    <input type="submit" name="submit" value="Edit"/>
                    <button onclick="href = 'read'">Go Back</button>


                </form>



            </div> <!-- close main -->


            <%@include file="includes/footer.jsp" %>

        </div> <!-- close wrap -->          





    </body>
</html>
