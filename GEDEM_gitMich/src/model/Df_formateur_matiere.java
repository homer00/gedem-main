package model;

public class Df_formateur_matiere {

	private int idFormateur_Matiere;
	private int idFormateur;
	private int idMatiere;


	public Df_formateur_matiere(int idfm, int idf, int idm){
		this.idFormateur_Matiere = idfm;
		this.idFormateur = idf;
		this.idMatiere = idm;
	}

	public int getIdFormateur_Matiere() {
		return idFormateur_Matiere;
	}

	public void setIdFormateur_Matiere(int idFormateur_Matiere) {
		this.idFormateur_Matiere = idFormateur_Matiere;
	}

	public int getIdFormateur() {
		return idFormateur;
	}

	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}

	public int getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}


}
