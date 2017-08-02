<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-
dist/css/bootstrap.css">
</head>
<body>
<h1>Nouveau Collaborateur</h1>

<form class="form-horizontal" method="post" >
<fieldset>


<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Nom</label>  
  <div class="col-md-4">
  <input id="textinput" name="nom" type="text" placeholder="nom" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Prenom</label>  
  <div class="col-md-4">
  <input id="textinput" name="prenom" type="text" placeholder="Prénom" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Date de Naissance</label>  
  <div class="col-md-4">
  <input id="textinput" name="dateDeNaissance" type="date" placeholder="Votre date de naissance" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Adresse</label>  
  <div class="col-md-4">
  <input id="textinput" name="adresse" type="text" placeholder="Votre Adresses" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Numéro de sécurité Social</label>  
  <div class="col-md-4">
  <input id="textinput" name="NumeSecu" type="text" placeholder="Votre numéro de sécu" class="form-control input-md">
    
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button type="submit" value="submit" id="singlebutton" name="singlebutton" class="btn btn-success">Créer</button>
  </div>
</div>

</fieldset>
</form>

</body>
</html>