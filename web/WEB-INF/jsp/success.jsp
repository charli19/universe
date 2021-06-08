<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Universe</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body background="../public/images/universe.jpg">
        <div class="container">
            <div class="row align-center">
                <h1 style="text-align: center">Register Successfully</h1>
                <br>
                <div style="justify-content: center; display: flex;">
                    <a href="<c:url value="home.htm" />" class="btn btn-primary"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> GO TO HOME</a>
                    &nbsp;
                    <a href="<c:url value="add.htm" />" class="btn btn-success"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> GO TO IDENTIFICATION</a>
                </div>
            </div>
        </div>
    </body>
</html>
