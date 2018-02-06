package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Utilisateur;
import modele.GestionUtilisateur;
import modele.GestionUtilisateurImpl;

/**
 * Servlet implementation class ConnexionUtilisateur
 */
public class ConnexionUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String ATT_USER = "utilisateur";
	public static final String CONNEXION = "/authentification.jsp";
	public static final String EPREUVE = "/selectionEpreuve";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		this.getServletContext().getRequestDispatcher( CONNEXION ).forward( request, response );
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GestionUtilisateur gu = GestionUtilisateurImpl.getInstance();

		Utilisateur u = gu.connecterUtilisateur(request.getParameter("email"), request.getParameter("password"));
		if (u.getIdUtilisateur() > 0) {
			HttpSession session = request.getSession();
			
			System.out.println(u.toString());
			
			session.setAttribute( ATT_USER, u );
        	response.sendRedirect(request.getContextPath() + EPREUVE);
		} else {
			System.out.println("Fail !");			
		}
		
	}

}
