package model;

public class Formateur extends Personne {
	// correspond à la table h_personne_formateur de MySQL
	private int idFormateur, idPersonne;

	/**
	 * Constructeur 1 paramètre : idPersonne commun à la classe "Personne"
	 * @param idPersonne
	 */
	public Formateur (int idPersonne) {
		super(); // appel du constructeur vide parent
		this.idPersonne = idPersonne;
	}
	/**
	 * Constructeur 2 paramètres : ensemble des champs de la table "h_personne_formateur" dans la BDD
	 * @param idFormateur
	 * @param idPersonne
	 */
	public Formateur (int idFormateur, int idPersonne) {
		super(); // appel du constructeurur vide parent
		this.idFormateur = idFormateur;
		this.idPersonne = idPersonne;
	}


//========================================= ACCESSEURS

public void setidPersonne(int sip) {
	this.idPersonne = sip;
}
public int getIdFormateur() {
	return this.idFormateur;
}
@Override
public int getIdPersonne() {
	return this.idPersonne;
}

}