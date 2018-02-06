package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

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
			rqt=cnx.prepareStatement("SELECT idEpreuve, dateDedutValidite, dateFinValidite, tempsEcoule, etat, noteObtenue, niveauObtenu, idTest, idUtilisateur " +
									 "FROM EPREUVE WHERE idUtilisateur = ?");		
			rqt.setInt(1, idUtilisateur);
			rs=rqt.executeQuery();
			Epreuve epreuve;
			while (rs.next()){
				epreuve = new Epreuve(
									rs.getInt("idEpreuve"),
									rs.getDate("dateDedutValidite"),
									rs.getDate("dateFinValidite"),
									rs.getInt("tempsEcoule"),
									rs.getString("etat"),
									rs.getFloat("noteObtenue"),
									rs.getString("niveauObtenu"),
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
}
