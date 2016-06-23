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


                <h1>Liste des Series</h1>

                <div class="container-fluid"

                     <table width="500" style="border: blue  solid 2px">
                        <thead>FILMS</thead>
                        <tbody>


                            <tr>
                                <th>TITRE</th><th>SYNOPSIS</th><th>GENRE</th><th>SAISON</th>
                            </tr>
                            <c:forEach items="${serie}" var="serie">
                                <tr>
                                    <td width="200"><a href="detail_serie?id=${serie.id}">${serie.titre}</a></td>
                                    <td width="75">${serie.synopsis}</td>
                                    <td width="75">${serie.genre.nom}</td>
                                    <td width="75">${serie.saisons.size()}</td>

                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>





                </div>

                <div class="footer">
                    <c:import url="_FOOTER.jsp" />
                </div>
            </div>
    </body>
</html>