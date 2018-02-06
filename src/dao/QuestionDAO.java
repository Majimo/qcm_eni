package dao;

import java.sql.SQLException;
import java.util.List;

import beans.Question;
import beans.QuestionEpreuve;

public interface QuestionDAO {

	public List<QuestionEpreuve> listeQuestions(int idTest) throws SQLException;
	
	public Question getQuestionById(int idQuestion) throws SQLException;
	
}
