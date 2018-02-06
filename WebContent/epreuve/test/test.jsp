<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Raleway"
	rel="stylesheet">
<title>QCM</title>
</head>
<body style="font-family: 'Raleway', sans-serif;">

	<h1 id="testN"
		style="margin-left: 31rem; margin-top: 2rem; margin-bottom: 2rem;">Test
		n° ${ test.idTest } - ${ test.libelle }</h1>

	<hr id="trait3" style="border: 1px solid grey; width: 47rem;">
	<form name="qcm1" id="qcm1" style="margin-left: 28rem;">
			<div id="question" style="margin-bottom: 29px;">
				<b>${ question.enonce }</b> <br />
			</div>
		<div id="propositions">
			<b>Propositions :</b>
		</div>
		<c:forEach items="${ requestScope.listePropositions }"
			var="proposition">
			<div id="reponses">
				<br /> <input type=checkbox name="choix${ proposition.idProposition }"
					value="${ proposition.idProposition }">${ proposition.enonce }
				<br />
			</div>
		</c:forEach>
		<div>
			<input type="button" id="valider" class="btn btn-primary"
				style="margin-left: 38rem;" value="Valider" />
		</div>
	</form>

</body>
<footer>
<p class="text-center"> Copyright2018 © Create by Pierre - Félix - Jérome & Claire. All right reserved. </p>
</footer>
</html>