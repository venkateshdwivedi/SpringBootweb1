<%@page language="java" %>
<html>

 <head>
        <link rel="stylesheet" type="text/css" href="style.css">
</head>
    <body>
        <h2>Add Alien</h2>


         <form action="addAlien">
                <label for="aid">Enter Alien id :</label>
                <input type="text" id="aid" name="aid"><br>
                <label for="aName">Enter Alien Name :</label>
                <input type="text" id="aName" name="aName"><br>
                <input type="submit" value="Submit">
            </form>
    </body>
</html>