package modele;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Epreuve;
import dao.EpreuveDAO;
import dao.EpreuveDAOImpl;

public class GestionEpreuveImpl implements GestionEpreuve {
	
	private static GestionEpreuve instance = null;
	
	public static GestionEpreuve getInstance(){
		if (instance == null){
			instance = new GestionEpreuveImpl();
		}
		return instance;
	}

	@Override
	public List<Epreuve> listeEpreuve(int idUtilisateur) {
		List<Epreuve> lesEpreuves = new ArrayList<Epreuve>();
		EpreuveDAO edao = EpreuveDAOImpl.getInstance();
		try {
			lesEpreuves = edao.listeEpreuves(idUtilisateur);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lesEpreuves;
	}

	@Override
	public Epreuve getEpreuveByTest(int idTest, int idUtilisateur) {
		Epreuve ep = new Epreuve();
		EpreuveDAO edao = EpreuveDAOImpl.getInstance();
		
		try{
			ep = edao.getEpreuveByTest(idTest, idUtilisateur);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return ep;
	}
}
