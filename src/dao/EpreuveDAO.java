package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import beans.Epreuve;

public interface EpreuveDAO {
	public ArrayList<Epreuve> listeEpreuves(int idUtilisateur) throws SQLException;
	
	public Epreuve getEpreuveByTest(int idTest, int idUtilisateur) throws SQLException;
}
