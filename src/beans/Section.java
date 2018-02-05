package beans;

public class Section {

	private int nbQuestions;
	private int idTest;
	private int idTheme;
	
	public Section() {
		
	}

	public Section(int nbQuestions, int idTest, int idTheme) {
		super();
		this.nbQuestions = nbQuestions;
		this.idTest = idTest;
		this.idTheme = idTheme;
	}

	public int getNbQuestions() {
		return nbQuestions;
	}

	public void setNbQuestions(int nbQuestions) {
		this.nbQuestions = nbQuestions;
	}

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public int getIdTheme() {
		return idTheme;
	}

	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}

	@Override
	public String toString() {
		return "Section [nbQuestions=" + nbQuestions + ", idTest=" + idTest + ", idTheme=" + idTheme + "]";
	}
	
}
