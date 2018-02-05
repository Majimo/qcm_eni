package modele;

import java.util.List;

import beans.Test;

public interface GestionTest {

	public Test getTestById(int idTest);
	
	public List<Test> listeTests(int idUtilisateur);
	
}
