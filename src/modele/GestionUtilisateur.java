package modele;

import java.util.List;

import beans.Epreuve;
import beans.Utilisateur;

public interface GestionUtilisateur {

	public Utilisateur connecterUtilisateur(String email, String password);
	
	public List<Epreuve> getListEpreuve();
	
}
