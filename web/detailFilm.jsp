<%-- 
    Document   : listeDetail
    Created on : 17 juin 2016, 15:20:24
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" /> 
    </head>
    <body>
        <div class="container">

            <div class="masthead">
                <h1>Detail du Film</h1>
                <table  width="1000" style="border: red  solid 2px  ">
                    <thead>FILMS</thead>
                    <tbody>

                        <tr>
                            <!-- <th>TITRE</th><th>ANNEE</th><th>GENRE</th><th>PAYS</th>-->
                        </tr>
                        <tr>
                            <td width="300"><a href="detail_film?id=${film.id}">${film.titre}</a></td>
                            <td width="75">${film.annee}</td>
                            <td width="75">${film.genre.nom}</td>

                            <td width="75">${pays.nom}</td>
                            <td width="400">${film.synopsis}</td>
                            <c:forEach items="${film.liens}" var="lien">
                                <td width="400">${lien.langue} ${lien.qualite}<a href="${lien.url}"> Voir en stringming</a></td>
                            </c:forEach>

                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
