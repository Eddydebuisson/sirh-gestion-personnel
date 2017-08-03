<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value='/bootstrap-3.3.7-dist/css/bootstrap.css' />">
</head>
<body>

<h1>Activités depuis le démarrage de l'application</h1>

	<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>DateHeure</th>
        <th>Libellé</th>
      </tr>
    </thead>
    <tbody>
		<c:set var="listeActivite" scope="session" value="${param.listeActivite}" />
	<c:forEach var="activite" items="${listeActivite}" >
		<tr>
		<th>${activite.dateHeure.getDayOfMonth()}/${activite.dateHeure.getMonthValue()}/${activite.dateHeure.getYear()}  ${activite.dateHeure.getHour()}:${activite.dateHeure.getMinute()}:${activite.dateHeure.getSecond()} </th>
		<th>${activite.type.getValue()} - matricule : ${activite.matricule} </th>
		</tr>
		</c:forEach>
	
	</tbody>



</body>
</html>