<%-- 
    Document   : _STYLESHEET
    Created on : 17 juin 2016, 10:51:39
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:choose>
    <c:when test="${cookie.style1=='style1'}">
        <link href="css/style1.css" rel="stylesheet" type="text/css"/>
    </c:when>
</c:choose>
<c:otherwise>


    <c:if test="${cookie.style2=='style2' }">

        <link href="css/style2.css" rel="stylesheet" type="text/css"/>
    </c:if>
</c:otherwise>
        




