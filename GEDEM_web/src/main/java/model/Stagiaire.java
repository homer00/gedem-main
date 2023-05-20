package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import tools.Connexion;

/**
 *  Sous-classe de "Personne"
 *  Mysql : h_personne_stagiaire
 * @author hs
 *
 */
public class Stagiaire extends Personne{
	private int idStagiaire;
	private int idPersonne;
	Connexion cc;
/**
 * Constructeur 1 paramètre : idPersonne (attribut commun à la classe Personne)
 * @param idPersonne
 */
	public Stagiaire(int idPersonne) {
		super(); // appel du constructeur vide parent
		this.idPersonne = idPersonne;
		// test d'appel d'une méthode de la Classe mère (Personne) :
		show1Personn();

	}
/**
 * Constructeur 2 paramètres (les 2 champs de la table stagiaire)
 * @param idStagiaire
 * @param idPersonne
 */
	public Stagiaire(int idStagiaire, int idPersonne) {
		super(); // appel du constructeur vide parent
		this.idStagiaire = idStagiaire;
		this.idPersonne = idPersonne;
		// test d'appel d'une méthode de la Classe mère (Personne) :
		show1Personn();

	}

	public void afficheStagiaires() {

		// requete SQL pour sélectionner l'ensemble des stagiaires
		String reqAS = "SELECT p.nom,p.prenom,s.idStagiaire FROM Personne p JOIN h_personne_stagiaire s USING (idPersonne) WHERE idRole='3'";
		// Dans la table role, idRole=3 correspond à "User", qui est le rôle correspondant aux stagiaires.

		try {
			cc = new Connexion();
			ResultSet rs = cc.getStatement().executeQuery(reqAS);
			while (rs.next()) {
				System.out.println("Nom : "+rs.getString(1)+"\tPrenom : "+rs.getString(2)+"\tid Stagiaire : "+rs.getInt(3));
			}
		}
		catch (SQLException e){
			System.out.println("Erreur SQL - Classe Stagiaire");
			e.printStackTrace();

		}
	}

	//=========================================  ACCESSEURS
	public int getIdStagiaire() {
		return this.idStagiaire;
	}
	@Override
	public int getIdPersonne() {
		return this.idPersonne;
	}
	public void setIdStagiaire(int ids) {
		this.idStagiaire = ids;
	}
	@Override
	public void setIdPersonne(int idp) {
		this.idPersonne = idp;
	}

}
