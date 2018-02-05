package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Test;
import beans.Utilisateur;
import modele.GestionEpreuve;

public class SelectionEpreuve extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String EPREUVE = "/epreuve/epreuve.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestionTest gt = GestionTestImpl.getInstance();
		
		HttpSession session = request.getSession();
		
		List<Test> listeTests = gt.listeTests(((Utilisateur) session.getAttribute("utilisateur")).getIdUtilisateur());
		
		request.setAttribute("listeTests", listeTests);
		
		this.getServletContext().getRequestDispatcher( EPREUVE ).forward( request, response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idTest = Integer.parseInt(request.getParameter("listeTests"));
		
		System.out.println("ID du Test sélectionné : " + idTest);
	}

}
