package modele;

public class GestionUtilisateurImpl implements GestionUtilisateur{
	
	private static GestionUtilisateur instance = null;
	
	public GestionUtilisateur getInstance(){
		if (instance == null){
			instance = new GestionUtilisateurImpl();
		}
		return instance;
	}

	public Utilisateur connecterUtilisateur(String email, String password){
		String erreur = "";
		
		//Verif champs vide
		if (email.equals("")){
			erreur = "Email obligatoire";
		}
		else if (password.equals("")) {
			erreur = "Mot de passe obligatoire";
		}
		else{
		
			UtilisateurDAO udao = new UtilisateurDAO();
			
			return udao.connecterUtilisateur(email, password);
		}
	}
	
}
