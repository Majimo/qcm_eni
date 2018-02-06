package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Epreuve;
import beans.QuestionEpreuve;
import beans.Test;
import beans.Utilisateur;
import modele.GestionEpreuve;
import modele.GestionEpreuveImpl;
import modele.GestionQuestion;
import modele.GestionQuestionImpl;
import modele.GestionTest;
import modele.GestionTestImpl;

public class SelectionEpreuve extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String EPREUVE = "/epreuve/epreuve.jsp";
	public static final String TEST = "/question";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestionTest gt = GestionTestImpl.getInstance();
		
		HttpSession session = request.getSession();
		
		List<Test> listeTests = gt.listeTests(((Utilisateur) session.getAttribute("utilisateur")).getIdUtilisateur());
		
		request.setAttribute("listeTests", listeTests);
		
		this.getServletContext().getRequestDispatcher( EPREUVE ).forward( request, response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		GestionTest gt = GestionTestImpl.getInstance();
		int idTest = Integer.parseInt(request.getParameter("listeTests"));
		Test test = gt.getTestById(idTest);
		
		GestionEpreuve ge = GestionEpreuveImpl.getInstance();
		Epreuve epreuve = ge.getEpreuveByTest(idTest, ((Utilisateur) session.getAttribute("utilisateur")).getIdUtilisateur());
		
		GestionQuestion gq = GestionQuestionImpl.getInstance();		
		List<QuestionEpreuve> lesQuestionsEpreuve = gq.listeQuestions(epreuve.getIdEpreuve());
		

		System.out.println("ID du Test sélectionné : " + idTest);
		session.setAttribute("epreuve", epreuve);
		session.setAttribute("lesQuestionsEpreuve", lesQuestionsEpreuve);
		request.setAttribute("test", test);
		session.setAttribute("questionInt", 1);
		
		this.getServletContext().getRequestDispatcher( TEST ).forward(request, response);
	}

}
