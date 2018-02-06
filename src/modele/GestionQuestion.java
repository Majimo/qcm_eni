package modele;

import java.util.List;

import beans.Question;
import beans.QuestionEpreuve;

public interface GestionQuestion {

	public List<QuestionEpreuve> listeQuestions(int idEpreuve);
	
	public Question getQuestionById(int idQuestion);
	
}
