
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="database.css"/>
        <title>Game Database</title>
    </head>

    <% String table = (String) request.getAttribute("table");%>


    <body>
        <div class="wrap"> <!-- wrap -->

            <%@include file="includes/header.jsp" %>

            <%@include file="includes/menu.jsp" %>

            <div class="main"> <!-- main -->

                <h1>Tom's Game Database</h1>

                <%= table%>

                <br>


            </div> <!-- close main -->


            <%@include file="includes/footer.jsp" %>

        </div> <!-- close wrap -->   
    </body>
</html>
