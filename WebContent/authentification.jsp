<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style.css"/>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet">
	
<title>Authentification</title>
</head>
<body>	
  	
	<!-- FORMULAIRE D'AUTHENTIFICATION -->
	<div class = "container">
	<div class="wrapper">
		<form method="post" action="connexion" name="Login_Form" class="form-signin">       
		    <h3 class="form-signin-heading">Connection</h3>
			  <hr class="colorgraph"><br>
			  
			  <input type="text" class="form-control" name="email" placeholder="Email" required="" autofocus="" />
			  <input type="password" class="form-control" name="password" placeholder="Password" required=""/>     		  
			 
			  <button class="btn btn-lg btn-primary btn-block" name="valider" value="Valider" type="submit">Se connecter</button>  			
		</form>			
	</div>
</div>

</body>
</html>