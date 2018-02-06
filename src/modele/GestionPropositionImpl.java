package modele;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Proposition;
import dao.PropositionDAO;
import dao.PropositionDAOImpl;

public class GestionPropositionImpl implements GestionProposition {
	
	private static GestionProposition instance = null;
	
	public static GestionProposition getInstance(){
		if (instance == null){
			instance = new GestionPropositionImpl();
		}
		return instance;
	}

	@Override
	public List<Proposition> listePropositions(int idQuestion){
		List<Proposition> lesProps = new ArrayList<Proposition>();
		PropositionDAO pdao = PropositionDAOImpl.getInstance();
		
		try{
			lesProps = pdao.listePropositions(idQuestion);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return lesProps;
	}

}
