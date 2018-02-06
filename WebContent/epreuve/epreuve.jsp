<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Raleway"
	rel="stylesheet">

<title>Epreuves</title>
</head>
<body style="font-family: 'Raleway', sans-serif;">
	
	<div class="grand-container">
	<div class="form-group col-md-6">
	<h2>Epreuve pour ${ sessionScope.utilisateur.nom } ${ sessionScope.utlisateur.prenom }</h2>
	<br/>
	<h3>Liste des tests</h3>
	</div>
	
	<div class="form-group col-md-6">
		<form method="post" action="qcm">
			<div class="form-row">
			      <label for="sel1">Liste des tests :</label>
				      <select class="form-control" id="listeTests" name="listeTests" style="width: 50%;">
				     	<c:forEach items="${ requestScope.listeTests }" var="test">
				     		<option value="${ test.idTest }">${ test.libelle }</option>
				     	</c:forEach>
				     	<option value="salut">salut</option>
				      </select>
			</div>
		</form>
	</div>
	
	<div>
		<input type="submit" class="btn btn-primary" value="Lancer le QCM" />
	</div>
	</div>

</body>
</html>