<%-- 
    Document   : inscription
    Created on : 22 juin 2016, 11:47:10
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
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


                <h2 class="form-signin-heading">S' inscrire</h2>


                <form class="form-inline" method="POST" action="inscription">
                    <div class="form-group">
                        <label for="exampleInputName2">login</label>
                        <input type="text" class="form-control" id="exampleInputName2" name="login" placeholder="Oscar Nam">
                    </div>

                    <div class="form-group">
                        <label for="exampleInputEmail2">Email</label>
                        <input type="email"  name="email" class="form-control" id="exampleInputEmail2" placeholder="oscar@nyona.com">
                    </div>

                    <div class="form-group">
                        <label for="inputPassword3">Le mot de pass</label>

                        <input type="password"  name="pass" class="form-control" id="inputPassword3" placeholder="Password">
                    </div>

                    <div class="form-group">
                        <label for="inputPassword3">Confirmer le mot de pass</label>

                        <input type="password" class="form-control"  name ="pass" id="inputPassword3" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <input type="submit" value="Envoyer" />
                    </div>


                </form>

            </div>
        </div>


    </body>
</html>
