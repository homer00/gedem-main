package model;

public class Df_formateur_formation {

	private int idFormateur_Formation;
	private int idFormateur;
	private int idFormation;

	public Df_formateur_formation(int idff, int idf1, int idf2) {
		this.idFormateur_Formation = idff;
		this.idFormateur = idf1;
		this.idFormation = idf2;
	}

	public int getIdFormateur_Formation() {
		return idFormateur_Formation;
	}

	public void setIdFormateur_Formation(int idFormateur_Formation) {
		this.idFormateur_Formation = idFormateur_Formation;
	}

	public int getIdFormateur() {
		return idFormateur;
	}

	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}

	public int getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}


}
