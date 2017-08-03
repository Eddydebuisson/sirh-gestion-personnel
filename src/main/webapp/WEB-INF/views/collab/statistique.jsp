<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value='/bootstrap-3.3.7-dist/css/bootstrap.css' />">
</head>
<body>
	<h1>Statistiques</h1>
	<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Chemin</th>
        <th>Nombre de visites</th>
        <th>Min (ms)</th>
        <th>Max (ms)</th>
        <th>Moyenne (ms) </th>
      </tr>
    </thead>
    <tbody>
		<c:set var="listeStat" scope="session" value="${param.listeStat}" />
		<c:forEach var="stat" items="${listeStat}" >
		<tr>
		<th>${stat.key}</th>	
		<th>${stat.value.getCount()}</th>
		<th>${stat.value.getMin()}</th>
		<th>${stat.value.getMax()}</th>
		<th>${stat.value.getAverage()}</th>
		</tr>
		</c:forEach>
	
	</tbody>
</body>
</html>