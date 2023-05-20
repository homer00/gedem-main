package model;

public class Administratif extends Personne {
	// correspond à la table h_personne_administratif de MySQL
	private int idAdministratif, idPersonne;
	private String fonction;

	/**
	 * Constructeur 1 paramètre : idPersonne commun à la classe "Personne"
	 * @param idPersonne
	 */
	public Administratif (int idPersonne) {
		super(); // appel du constructeur vide parent
		this.idPersonne = idPersonne;
	}
	/**
	 * Constructeur 3 paramètres : ensemble des champs de la table "h_personne_administratif" dans la BDD
	 * @param idAdministratif
	 * @param idPersonne
	 */
	public Administratif (int idAdministratif, int idPersonne, String fonction) {
		super(); // appel du constructeurur vide parent
		this.idAdministratif = idAdministratif;
		this.idPersonne = idPersonne;
		this.fonction = fonction;
	}


//========================================= ACCESSEURS

public void setidPersonne(int sip) {
	this.idPersonne = sip;
}
public int getIdAdministratif() {
	return this.idAdministratif;
}
@Override
public int getIdPersonne() {
	return this.idPersonne;
}

public String getFonction() {
	return fonction;
}
public void setFonction(String fonction) {
	this.fonction = fonction;
}

}