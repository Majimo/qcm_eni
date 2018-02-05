package modele;

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
		EpreuveDAO edao = EpreuveDAOImpl.getInstance();
		return edao.listeEpreuves();
	}
}
