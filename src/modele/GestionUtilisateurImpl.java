package modele;

import java.sql.SQLException;

import beans.Utilisateur;
import dao.UtilisateurDAO;
import dao.UtilisateurDAOImpl;

public class GestionUtilisateurImpl implements GestionUtilisateur{
	
	private static GestionUtilisateur instance = null;
	
	public static GestionUtilisateur getInstance(){
		if (instance == null){
			instance = new GestionUtilisateurImpl();
		}
		return instance;
	}

	public Utilisateur connecterUtilisateur(String email, String password){
		// String erreur = "";
		Utilisateur u = new Utilisateur();
		
		//Verif champs vide
		UtilisateurDAO udao = UtilisateurDAOImpl.getInstance();
		
		try {
			u = udao.connecterUtilisateur(email, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}

	
	
}
