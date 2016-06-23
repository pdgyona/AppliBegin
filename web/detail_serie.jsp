<%-- 
    Document   : detail_serie
    Created on : 20 juin 2016, 10:29:11
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">

            <div class="masthead">
                <h1>Detail Serie</h1>
                <table width="500" style="border: blue  solid 2px">
                    <thead>Serie</thead>
                    <tbody>


                        <tr class="success">
                            <td width="200"><a href="detail_serie?id=${serie.id}">${serie.titre}</a></td>
                            <td width="75">${serie.synopsis}</td>
                            <td width="75">${serie.genre.nom}</td>
                            <td width="75">${serie.saisons.size()}</td>


                            <td>
                                <c:forEach items="${serie.realisateurs}" var="realisateurserie">
                                    ${realisateurserie.nom} ${realisateurserie.prenom}
                                </c:forEach>
                            </td>
                            <td>
                                <c:forEach items="${serie.acteurs}" var="acteurserie">
                                    ${acteurserie.nom} ${acteurserie.prenom}
                                </c:forEach>
                            </td>


                        </tr>

                    </tbody>
                </table>
            </div>
        </div>

    </body>
</html>
