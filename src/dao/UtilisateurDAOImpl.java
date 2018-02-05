package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Utilisateur;

public class UtilisateurDAOImpl implements UtilisateurDAO {
	/*
	 * Recherche par login et mot de passe
	 */
	public Utilisateur connecterUtilisateur(String email, String password) throws SQLException{
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Utilisateur utilisateur=null;
		try{
			cnx = AccesBase.getConnection();
			rqt = cnx.prepareStatement("select idUser, nom, prenom, email, password from UTILISATEUR where email=? and motdepasse=?");
			rqt.setString(1, email);
			rqt.setString(2, password);
			rs=rqt.executeQuery();
			// SI on trouve au moins 1 résultat, on prend le 1er pour mettre à jour les informations du candidat utilisé pour la recherche.
			if (rs.next()){
				utilisateur = new Utilisateur();
				utilisateur.setIdUtilisateur(rs.getInt("idUser"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setPassword(rs.getString("motdepasse"));
			}
			// ...sinon on renvoie null
			else {
				utilisateur = new Utilisateur();;
			}
			
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		return utilisateur;
	}
}
