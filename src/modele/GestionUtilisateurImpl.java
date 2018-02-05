package modele;

import java.util.List;

import beans.Epreuve;
import beans.Utilisateur;
import dao.EpreuveDAO;
import dao.EpreuveDAOImpl;
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
		String erreur = "";
		
		//Verif champs vide
		UtilisateurDAO udao = UtilisateurDAOImpl.getInstance();
		
		return udao.connecterUtilisateur(email, password);
	}

	
	
}
