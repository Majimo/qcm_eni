package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Proposition;
import beans.Question;
import modele.GestionQuestion;
import modele.GestionQuestionImpl;

public class AffichageQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String TEST = "/test.jsp";


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ((Test) request.getAttribute("test")).getIdTest()
		GestionQuestion gq = GestionQuestionImpl.getInstance();
		Question question = gq.getQuestionById(lesQuestionsEpreuve.get((int) request.getAttribute("questionInt")));
		
		GestionProposition gp = GestionPropositionImpl.getInstance();
		List<Proposition> lesPropositions = gp.listePropositions(question.getIdQuestion());

		request.setAttribute("question", question);
		request.setAttribute("listePropositions", lesPropositions);
		
		this.getServletContext().getRequestDispatcher( TEST ).forward( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
