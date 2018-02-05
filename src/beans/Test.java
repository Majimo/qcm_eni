package beans;

public class Test {
	
	private int idTest;
	private String libelle;
	private String description;
	private int duree;
	private int seuilHaut;
	private int seuilBas;
	
	public Test() {
		
	}

	public Test(int idTest, String libelle, String description, int duree, int seuilHaut, int seuilBas) {
		super();
		this.idTest = idTest;
		this.libelle = libelle;
		this.description = description;
		this.duree = duree;
		this.seuilHaut = seuilHaut;
		this.seuilBas = seuilBas;
	}

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getSeuilHaut() {
		return seuilHaut;
	}

	public void setSeuilHaut(int seuilHaut) {
		this.seuilHaut = seuilHaut;
	}

	public int getSeuilBas() {
		return seuilBas;
	}

	public void setSeuilBas(int seuilBas) {
		this.seuilBas = seuilBas;
	}

	@Override
	public String toString() {
		return "Test [idTest=" + idTest + ", libelle=" + libelle + ", description=" + description + ", duree=" + duree
				+ ", seuilHaut=" + seuilHaut + ", seuilBas=" + seuilBas + "]";
	}
	
}
