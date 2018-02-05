package dao;

import java.sql.SQLException;

import beans.Utilisateur;

public interface UtilisateurDAO {
	
	public Utilisateur connecterUtilisateur(String email, String password) throws SQLException;
}
