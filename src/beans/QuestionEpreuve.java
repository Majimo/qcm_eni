package beans;

public class QuestionEpreuve {

	private boolean estMarquee;
	private int idQuestion;
	private int numOrdre;
	private int idEpreuve;
	
	public QuestionEpreuve() {
		
	}

	public QuestionEpreuve(boolean estMarquee, int idQuestion, int numOrdre, int idEpreuve) {
		super();
		this.estMarquee = estMarquee;
		this.idQuestion = idQuestion;
		this.numOrdre = numOrdre;
		this.idEpreuve = idEpreuve;
	}

	public boolean isEstMarquee() {
		return estMarquee;
	}

	public void setEstMarquee(boolean estMarquee) {
		this.estMarquee = estMarquee;
	}

	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public int getNumOrdre() {
		return numOrdre;
	}

	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}

	public int getIdEpreuve() {
		return idEpreuve;
	}

	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}

	@Override
	public String toString() {
		return "QuestionEpreuve [estMarquee=" + estMarquee + ", idQuestion=" + idQuestion + ", numOrdre=" + numOrdre
				+ ", idEpreuve=" + idEpreuve + "]";
	}
	
}
