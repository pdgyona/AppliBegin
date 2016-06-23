<%-- 
    Document   : _MENU
    Created on : 17 juin 2016, 10:55:25
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="nav nav-justified">
    <ul class="nav nav-justified">
        <li class="active"><a href="inscription">S'inscrire</a></li>
        <li><a href="film_liste">Films</a></li>
        <li><a href="serie_liste">Series</a></li>
        <li><a href="form">Contact</a></li>
        <li><a href="ajouter_film">Ajouter Film</a></li>
        <li> <c:choose>
                <c:when test="${cookie.loggin==null}">
                    <a href="loggin">Connexion</a>

                </c:when>
                <c:otherwise>
                    <a href="logout">Deconnexion</a>
                    <c:if test="${cookie.util_type.getValue()==ADMIN }">
                        <a href="ajouter_film">Ajouter Film</a>
                        <a href="ajouter_serie">Ajouter Serie</a>

                    </c:if>
                </c:otherwise>
            </c:choose>
              
                        




    </ul>
</nav>