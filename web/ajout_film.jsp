<%-- 
    Document   : ajout_film
    Created on : 20 juin 2016, 13:42:56
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AjoutFilm</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
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
        <h1>Ajouter  Film</h1>
        <form method="POST" action="ajouter_film">
            <label for="titre">Titre</label><input  name="titre"  type="text" width="150"><br />
            <label for="synopsis">Synopsis</label><input  name="synopsis"  type="textarea" width="150"><br />
             <label for="annee">Année de Production</label><input  name="annee"  type="text" width="150"><br />
            
            <label for="genre">Genre</label>
            <select name="genre_id">
                <c:forEach items="${genres}" var="g" >
                <option value="${g.id}">${g.nom}</option>
                </c:forEach>
            </select><br />
            
            
           
            
            <input  value="Ajouter"  type="submit" width="150" style="background-color: blue; color: white">
        </form>
      </div></div>
    </body>
</html>
