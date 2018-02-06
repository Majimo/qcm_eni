package modele;

import java.sql.SQLException;
import java.util.List;

import beans.Proposition;

public interface GestionProposition {
	
	public List<Proposition> listePropositions(int idQuestion);
	
}
