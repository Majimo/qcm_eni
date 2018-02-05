package beans;

public class Epreuve {
	
	private int idEpreuve;
	private double dateDebutValidite;
	private double dateFinValidite;
	private int tempsEcoule;
	private String etat;
	private float noteObtenue;
	private String niveauObtenu;
	private int idTest;
	private int idUtilisateur;
	
	public Epreuve() {
		
	}

	public Epreuve(int idEpreuve, double dateDebutValidite, double dateFinValidite, int tempsEcoule, String etat,
			float noteObtenue, String niveauObtenu, int idTest, int idUtilisateur) {
		super();
		this.idEpreuve = idEpreuve;
		this.dateDebutValidite = dateDebutValidite;
		this.dateFinValidite = dateFinValidite;
		this.tempsEcoule = tempsEcoule;
		this.etat = etat;
		this.noteObtenue = noteObtenue;
		this.niveauObtenu = niveauObtenu;
		this.idTest = idTest;
		this.idUtilisateur = idUtilisateur;
	}

	public int getIdEpreuve() {
		return idEpreuve;
	}

	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}

	public double getDateDebutValidite() {
		return dateDebutValidite;
	}

	public void setDateDebutValidite(double dateDebutValidite) {
		this.dateDebutValidite = dateDebutValidite;
	}

	public double getDateFinValidite() {
		return dateFinValidite;
	}

	public void setDateFinValidite(double dateFinValidite) {
		this.dateFinValidite = dateFinValidite;
	}

	public int getTempsEcoule() {
		return tempsEcoule;
	}

	public void setTempsEcoule(int tempsEcoule) {
		this.tempsEcoule = tempsEcoule;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public float getNoteObtenue() {
		return noteObtenue;
	}

	public void setNoteObtenue(float noteObtenue) {
		this.noteObtenue = noteObtenue;
	}

	public String getNiveauObtenu() {
		return niveauObtenu;
	}

	public void setNiveauObtenu(String niveauObtenu) {
		this.niveauObtenu = niveauObtenu;
	}

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	@Override
	public String toString() {
		return "Epreuve [idEpreuve=" + idEpreuve + ", dateDebutValidite=" + dateDebutValidite + ", dateFinValidite="
				+ dateFinValidite + ", tempsEcoule=" + tempsEcoule + ", etat=" + etat + ", noteObtenue=" + noteObtenue
				+ ", niveauObtenu=" + niveauObtenu + ", idTest=" + idTest + ", idUtilisateur=" + idUtilisateur + "]";
	}

}
