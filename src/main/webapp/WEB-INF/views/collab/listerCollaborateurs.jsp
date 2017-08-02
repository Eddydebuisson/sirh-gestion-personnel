<%@page import="dev.sgp.entite.Collaborateur"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="<c:url value='/bootstrap-3.3.7-dist/css/bootstrap.css' />:">
</head>
<body>
<h1>Les collaborateurs</h1>
<!-- Liste des noms -->
	<ul>
	
		<c:set var="listeCollabs" scope="session" value="${param.listeCollabs}" />
		<c:forEach var="col" items="${listeCollabs }" >
		<li>${col.matricule}</li> 
		<li>${col.nom}</li> 
		<li>${col.prenom}</li> 
		<li>${col.dateDeNaissance}</li> 
		<li>${col.adresse}</li> 

		</c:forEach>
		
	</ul>

</body>
</html>