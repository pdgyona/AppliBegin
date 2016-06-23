<%-- 
    Document   : login
    Created on : 21 juin 2016, 12:14:30
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico">

        <title>Se sonnecter</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/min.css" rel="stylesheet">


    </head>

    <body>

        <div class="container">

            <form class="form-signin" action="loggin" method="POST">
                <h2 class="form-signin-heading">Se sonnecter</h2>
                <label for="inputEmail" class="sr-only">login</label>
                <input type="text"  name="login"id="inputEmail" class="form-control" placeholder="Entrer login" required autofocus>
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password"  name="pass" id="inputPassword" class="form-control" placeholder="Password" required>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> Se souvenir de moi
                    </label>
                </div>
                <button class="btn btn-lg btn-success btn-block" type="submit">Se connecter</button>
            </form>

        </div> <!-- /container -->



        <script src="js/bootstrap.js"></script>
    </body>
</html>
