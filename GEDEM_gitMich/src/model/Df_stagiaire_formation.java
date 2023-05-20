package model;

public class Df_stagiaire_formation {

	private int idStagiaire_Formation;
	private int idStagiaire;
	private int idFormation;

	public Df_stagiaire_formation(int idsf, int ids, int idf) {
		this.idStagiaire_Formation = idsf;
		this.idStagiaire = ids;
		this.idFormation = idf;
	}

	public int getIdStagiaire_Formation() {
		return idStagiaire_Formation;
	}

	public void setIdStagiaire_Formation(int idStagiaire_Formation) {
		this.idStagiaire_Formation = idStagiaire_Formation;
	}

	public int getIdStagiaire() {
		return idStagiaire;
	}

	public void setIdStagiaire(int idStagiaire) {
		this.idStagiaire = idStagiaire;
	}

	public int getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}

}
