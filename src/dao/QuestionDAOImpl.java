package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Question;
import beans.QuestionEpreuve;

public class QuestionDAOImpl implements QuestionDAO{

	private static QuestionDAO instance = null;
	
	public static QuestionDAO getInstance(){
		if (instance == null){
			instance = new QuestionDAOImpl();
		}
		return instance;
	}

	@Override
	public List<QuestionEpreuve> listeQuestions(int idEpreuve) throws SQLException{
		Connection cnx = AccesBase.getConnection();
		ResultSet rs = null;
		PreparedStatement req = null;
		String sql = "SELECT * FROM QUESTION_TIRAGE WHERE idEpreuve = ?";
		
		List<QuestionEpreuve> lesQuestions = new ArrayList<QuestionEpreuve>();
		
		try{
			req = cnx.prepareStatement(sql);
			req.setInt(1, idEpreuve);
			
			rs = req.executeQuery();
			
			while (rs.next()){
				QuestionEpreuve q = new QuestionEpreuve();
				q.setEstMarquee(rs.getBoolean("estMarquee"));
				q.setIdEpreuve(rs.getInt("idEpreuve"));
				q.setIdQuestion(rs.getInt("idQuestion"));
				q.setNumOrdre(rs.getInt("numOrdre"));
				
				lesQuestions.add(q);
			}
			
		}
		finally {
			if (rs!=null) rs.close();
			if (req!=null) req.close();
			if (cnx!=null) cnx.close();
		}
		
		
		return lesQuestions;
	}

	@Override
	public Question getQuestionById(int idQuestion) throws SQLException {
		Question q = new Question();
		Connection cnx = AccesBase.getConnection();
		ResultSet rs = null;
		PreparedStatement req = null;
		String sql = "SELECT * FROM QUESTION WHERE idQuestion = ?";
		
		try{
			req = cnx.prepareStatement(sql);
			req.setInt(1, idQuestion);
			
			rs = req.executeQuery();
			
			if (rs.next()){
				q.setIdQuestion(idQuestion);
				q.setEnonce(rs.getString("enonce"));
				q.setIdTheme(rs.getInt("idTheme"));
				System.out.println(rs.getBytes("media") == null || rs.getBytes("media")[0] == 0? false : true);
				q.setMedia(rs.getBytes("media") == null ? false : true);
				q.setPoints(rs.getInt("points"));
			}
		}
		finally{
			if (rs!=null) rs.close();
			if (req!=null) req.close();
			if (cnx!=null) cnx.close();
		}
		
		return q;
	}
	
}
