package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Epreuve;

public class EpreuveDAOImpl implements EpreuveDAO{
	
	private static EpreuveDAO instance = null;
	
	public static EpreuveDAO getInstance(){
		if (instance == null){
			instance = new EpreuveDAOImpl();
		}
		return instance;
	}
	
	@Override
	public ArrayList<Epreuve> listeEpreuves(int idUtilisateur) throws SQLException {
		Connection cnx=null;
		PreparedStatement rqt=null;
		ResultSet rs=null;
		ArrayList<Epreuve> listeEpreuves = new ArrayList<Epreuve>();
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("SELECT idEpreuve, dateDebutValidite, dateFinValidite, tempsEcoule, etat, note_obtenue, niveau_obtenu, idTest, idUtilisateur " +
									 "FROM EPREUVE WHERE idUtilisateur = ?");		
			rqt.setInt(1, idUtilisateur);
			rs=rqt.executeQuery();
			Epreuve epreuve;
			while (rs.next()){
				epreuve = new Epreuve(
									rs.getInt("idEpreuve"),
									rs.getDate("dateDedutValidite").getTime(),
									rs.getDate("dateFinValidite").getTime(),
									rs.getInt("tempsEcoule"),
									rs.getString("etat"),
									rs.getFloat("note_obtenue"),
									rs.getString("niveau_obtenu"),
									rs.getInt("idTest"),
									rs.getInt("idUtilisateur")
						);
				listeEpreuves.add(epreuve);				
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		return listeEpreuves;
	}

	@Override
	public Epreuve getEpreuveByTest(int idTest, int idUtilisateur) throws SQLException {
		Connection cnx=null;
		PreparedStatement rqt=null;
		ResultSet rs=null;
		String sql = "SELECT * FROM EPREUVE WHERE idTest = ? AND idUtilisateur = ?";
		
		Epreuve e = new Epreuve();
		
		try{
			cnx = AccesBase.getConnection();
			
			rqt = cnx.prepareStatement(sql);
			rqt.setInt(1, idTest);
			rqt.setInt(2, idUtilisateur);
			rs = rqt.executeQuery();
			
			if (rs.next()){
				e.setIdEpreuve(rs.getInt("idEpreuve"));
				e.setDateDebutValidite(rs.getDate("dateDebutValidite").getTime());
				e.setDateFinValidite(rs.getDate("dateFinValidite").getTime());
				e.setEtat(rs.getString("etat"));
				e.setIdTest(idTest);
				e.setIdUtilisateur(idUtilisateur);
				e.setNiveauObtenu(rs.getString("niveau_obtenu"));
				e.setNoteObtenue(rs.getFloat("note_obtenue"));
				e.setTempsEcoule(rs.getInt("tempsEcoule"));
			}
		}
		finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		
		return e;
	}
}
