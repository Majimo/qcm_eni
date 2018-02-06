package modele;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Epreuve;
import beans.Test;
import dao.TestDAO;
import dao.TestDAOImpl;

public class GestionTestImpl implements GestionTest {

	private static GestionTest instance = null;

	public static GestionTest getInstance() {
		if (instance == null) {
			instance = new GestionTestImpl();
		}
		return instance;
	}

	@Override
	public Test getTestById(int idTest) {
		TestDAO tdao = TestDAOImpl.getInstance();
		Test t = new Test();

		try {
			t = tdao.getTestById(idTest);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return t;
	}

	@Override
	public List<Test> listeTests(int idUtilisateur) {
		GestionEpreuve ge = GestionEpreuveImpl.getInstance();
		List<Epreuve> lesEpreuves = ge.listeEpreuve(idUtilisateur);
		List<Test> lesTests = new ArrayList<Test>();

		for (Epreuve e : lesEpreuves) {
			Test t = getTestById(e.getIdTest());
			lesTests.add(t);
		}

		return lesTests;
	}

}
