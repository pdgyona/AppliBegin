<%-- 
    Document   : conok
    Created on : 21 juin 2016, 14:48:57
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

        <title>Signin Template for Bootstrap</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">


        <!-- Custom styles for this template -->
        <link href="signin.css" rel="stylesheet">

        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="js/ie-emulation-modes-warning.js"></script>

    </head>

    <body>

        <div class="container">

            <div class="masthead">

                <div class="titre">
                    <c:import url="_TITRE.jsp" />
                </div>

                <div class="menu">
                    <c:import url="_MENU.jsp" />
                </div>
                <div class="row">

                <!-- Jumbotron -->
                <div class="jumbotron">
                    <h1>Oscar Land</h1>
                    <p class="lead">Bienvenue , vous pouvez ajouter un film</p>
                    <p><a class="btn btn-lg btn-success" href="ajouter_film" role="button">Ajouter un film</a></p>
                </div>
            </div>
            </div>
        </div><!-- /masthead -->


        </div> <!-- /container -->


        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>
