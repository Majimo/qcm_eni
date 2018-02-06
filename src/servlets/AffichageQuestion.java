package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Epreuve;
import beans.Question;
import beans.QuestionEpreuve;

public class AffichageQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ((Test) request.getAttribute("test")).getIdTest()
		GestionQuestion gq = GestionQuestionImpl.getInstance();
		
		List<QuestionEpreuve> lesQuestionsEpreuve = gq.listeQuestions(((Epreuve) request.getAttribute("epreuve")).getIdEpreuve());
		
		Question question = gq.getQuestionById(lesQuestionsEpreuve.get((int) request.getAttribute("questionInt")));
		
		
		// GestionProposition gp = 
		// listePropositions(idQuestion)
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
