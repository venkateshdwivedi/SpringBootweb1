<%@page language="java" %>
<html>

 <head>
        <link rel="stylesheet" type="text/css" href="style.css">
</head>
    <body>
        <h2>Result is: <%=  session.getAttribute("result") %></h2>

        <!-- This is using JSTL -->
        <!-- <h2>Result is: ${result}</h2>  -->

    </body>
</html>