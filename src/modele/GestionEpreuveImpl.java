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
	public List<Epreuve> listeEpreuve() {
		List<Epreuve> lesEpreuves = new ArrayList<Epreuve>();
		EpreuveDAO edao = EpreuveDAOImpl.getInstance();
		try {
			lesEpreuves = edao.listeEpreuves();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lesEpreuves;
	}
}
