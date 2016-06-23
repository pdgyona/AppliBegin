<%-- 
    Document   : form
    Created on : 17 juin 2016, 09:34:25
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Form</title>
        
    </head>
    <body>
        <h1>Formulaire</h1>
        <form method="POST">
            <label for="titre">Titre</label><input  name="titre"  type="text" width="150"><br />
            <label for="anneprod">Année Production</label><input   name="anneeProd" type="text" width="150"><br />
            <label for="genre">Genre</label>
            <select name="genre">
                <option value="Action">Action</option>
                <option value="Animé">Animé</option>
                <option value="Guerre">Osée</option>
                
            </select><br />
            
            <label for="pays">Pays</label>
            <select name="pays">
                <option value="RCA">RCA</option>
                <option value="France">France</option>
                <option value="Oscarica">OSCARICA</option>
                
            </select><br />
            <input  value="Ajouter"  type="submit" width="150" style="background-color: blue; color: white">
        </form>
    </body>
</html>
