package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Test;

public class TestDAOImpl implements TestDAO {
	
	private static TestDAO instance = null;
	
	public static TestDAO getInstance(){
		if (instance == null){
			instance = new TestDAOImpl();
		}
		return instance;
	}
	
	@Override
	public Test getTestById(int idTest) throws SQLException{
		Connection cnx=null;
		PreparedStatement rqt=null;
		ResultSet rs=null;
		Test test = null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("SELECT idTest, libelle, description, duree, seuil_haut, seuil_bas "
					               + "FROM TEST WHERE idTest = ?");
			rqt.setInt(1, idTest);
			rs=rqt.executeQuery();
			while (rs.next()){
				if (test==null) test = new Test();
				test.setIdTest(rs.getInt("idTest"));
				test.setLibelle(rs.getString("libelle"));	
				test.setDescription(rs.getString("description"));
				test.setDuree(rs.getInt("duree"));
				test.setSeuilHaut(rs.getInt("seuil_haut"));
				test.setSeuilBas(rs.getInt("seuil_bas"));
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		return test;
	}
}
