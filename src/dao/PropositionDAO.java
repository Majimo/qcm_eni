package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import beans.Proposition;

public interface PropositionDAO {

	ArrayList<Proposition> listePropositions(int idQuestion) throws SQLException;

}
