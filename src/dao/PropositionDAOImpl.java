package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Epreuve;
import beans.Proposition;

public class PropositionDAOImpl implements PropositionDAO{

	private static PropositionDAO instance = null;
	
	public static PropositionDAO getInstance(){
		if (instance == null){
			instance = new PropositionDAOImpl();
		}
		return instance;
	}
	
	@Override
	public ArrayList<Proposition> listePropositions(int idQuestion) throws SQLException {
		Connection cnx=null;
		PreparedStatement rqt=null;
		ResultSet rs=null;
		ArrayList<Proposition> listePropositions = new ArrayList<Proposition>();
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("SELECT idProposition, enonce, estBonne, idQuestion"
								  + " FROM PROPOSITION WHERE idQuestion = ?");		
			rqt.setInt(1, idQuestion);
			rs=rqt.executeQuery();
			Proposition proposition;
			while (rs.next()){
				proposition = new Proposition(
									rs.getInt("idProposition"),
									rs.getString("enonce"),
									rs.getBoolean("estBonne"),
									rs.getInt("idQuestion")
						);
				listePropositions.add(proposition);				
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		return listePropositions;
	}
	
}
