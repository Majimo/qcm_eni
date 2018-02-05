<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style.css"/>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Authentification</title>
</head>
<body>
	<h2>Formulaire d'authentification pour l'accès aux tests</h2>
	<hr style="border: 1px solid grey; margin-top: 30px;">
	
	<!-- FORMULAIRE D'AUTHENTIFICATION -->
	<form method="post" action="/connexion">
		<div class="form-row">
			<div class="form-group col-md-6">
				<label>Email</label> <input type="text" name="email" class="form-control"
					value="" width="30" />
			</div>
			<div class="form-group col-md-6">
				<label>Password</label> <input type="password" name="password"
					class="form-control" value="" width="30"/>
			</div>
		</div>
		<div>
			<input type="submit" class="btn btn-primary" value="Valider" />
		</div>
	</form>

</body>
</html>