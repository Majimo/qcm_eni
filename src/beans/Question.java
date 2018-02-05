package beans;

public class Question {

	private int idQuestion;
	private String enonce;
	private boolean media;
	private int points;
	private int idTheme;
	
	public Question() {
		
	}

	public Question(int idQuestion, String enonce, boolean media, int points, int idTheme) {
		super();
		this.idQuestion = idQuestion;
		this.enonce = enonce;
		this.media = media;
		this.points = points;
		this.idTheme = idTheme;
	}

	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getEnonce() {
		return enonce;
	}

	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}

	public boolean isMedia() {
		return media;
	}

	public void setMedia(boolean media) {
		this.media = media;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getIdTheme() {
		return idTheme;
	}

	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}

	@Override
	public String toString() {
		return "Question [idQuestion=" + idQuestion + ", enonce=" + enonce + ", media=" + media + ", points=" + points
				+ ", idTheme=" + idTheme + "]";
	}
	
}
