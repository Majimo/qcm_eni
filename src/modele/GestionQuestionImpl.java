package modele;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Question;
import beans.QuestionEpreuve;
import dao.QuestionDAO;
import dao.QuestionDAOImpl;

public class GestionQuestionImpl implements GestionQuestion{
	
	private static GestionQuestion instance = null;
	
	public static GestionQuestion getInstance(){
		if (instance == null){
			instance = new GestionQuestionImpl();
		}
		return instance;
	}

	@Override
	public List<QuestionEpreuve> listeQuestions(int idEpreuve) {
		QuestionDAO qdao = QuestionDAOImpl.getInstance();
		List<QuestionEpreuve> lesQuestions = new ArrayList<QuestionEpreuve>();
		try{
			lesQuestions = qdao.listeQuestions(idEpreuve);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return lesQuestions;
	}

	public Question getQuestionById(int idQuestion){
		QuestionDAO qdao = QuestionDAOImpl.getInstance();
		Question q = new Question();
		
		try{
			q = qdao.getQuestionById(idQuestion);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return q;
	}
}
