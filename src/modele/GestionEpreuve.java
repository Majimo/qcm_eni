package modele;

import java.util.List;

import beans.Epreuve;

public interface GestionEpreuve {

	public List<Epreuve> listeEpreuve(int idUtilisateur);
	
	public Epreuve getEpreuveByTest(int idTest, int idUtilisateur);
	
}
