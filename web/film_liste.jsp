<%-- 
    Document   : TEMPLATE
    Created on : 17 juin 2016, 10:50:46
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_STYLESHEET.jsp" />
        <link rel="stylesheet" href="css/bootstrap.min.css" /> 
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


                <div class="contenu">
                    <h1>Liste des Films</h1>

                    <table width="500" style="border: blue  solid 2px">
                        <thead>FILMS</thead>
                        <tbody>

                            <tr class="active">
                                <th>TITRE</th><th>ANNEE</th><th>GENRE</th><th>PAYS</th>
                            </tr>
                            <c:forEach items="${film}" var="film">
                                <tr class="success">
                                    <td width="200"><a href="detail_film?id=${film.id}">${film.titre}</a></td>
                                    <td width="75">${film.annee}</td>
                                    <td width="75">${film.genre.nom}</td>
                                    <c:forEach items="${film.pays}" var="pays">
                                        <td width="75">${pays.nom}</td>
                                    </c:forEach>

                                    <td><a  href="supprimer_film?id=${film.id}">supp </a></td>

                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>

                <div class="footer">
                    <c:import url="_FOOTER.jsp" />
                </div>
            </div>
        </div>
    </body>
</html>