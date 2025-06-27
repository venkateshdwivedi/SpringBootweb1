<%@page language="java" %>
<html>

 <head>
        <link rel="stylesheet" type="text/css" href="style.css">
</head>
    <body>
        <!-- <h2>Result is: <%=  session.getAttribute("result") %></h2> -->

        <!-- This is using JSTL -->
        <h2>Welcome to Alien world </h2> 
        <p> ${alien} </p> 
        <p> Welcome to ${course} course</p>

        

    </body>
</html>