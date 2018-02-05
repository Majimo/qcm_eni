package beans;

public class ReponseEpreuve {
	
	private int idProposition;
	private int idQuestion;
	private int idEpreuve;
	
	public ReponseEpreuve() {
		
	}

	public ReponseEpreuve(int idProposition, int idQuestion, int idEpreuve) {
		super();
		this.idProposition = idProposition;
		this.idQuestion = idQuestion;
		this.idEpreuve = idEpreuve;
	}

	public int getIdProposition() {
		return idProposition;
	}

	public void setIdProposition(int idProposition) {
		this.idProposition = idProposition;
	}

	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public int getIdEpreuve() {
		return idEpreuve;
	}

	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}

	@Override
	public String toString() {
		return "ReponseEpreuve [idProposition=" + idProposition + ", idQuestion=" + idQuestion + ", idEpreuve="
				+ idEpreuve + "]";
	}

}
