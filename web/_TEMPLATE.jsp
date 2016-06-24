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
        
         
    </head>
    <body>
         <div class="container">

      <!-- The justified navigation menu is meant for single line per list item.
           Multiple lines will require custom code not provided by Bootstrap. -->
      <div class="masthead">
        <h3 class="text-muted">First DPSTREAMProject </h3>
        
    

        <div class="titre">
            <c:import url="_TITRE.jsp" />
        </div>
        <nav >
        <div class="menu">
            <c:import url="_MENU.jsp" />
        </div>
        </nav>
        <div class="jumbotron">DPOSCAREAM</div>
       <div class="row">
        <div class="col-lg-4">
        <div class="contenu">
        </div></div>

        </div>
        <footer class="footer">
        <div class="footer">
            <c:import url="_FOOTER.jsp" />
        </div>
        </footer>
    </div>
         </div>
    </body>
</html>