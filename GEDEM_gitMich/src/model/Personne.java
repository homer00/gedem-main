package model;

import java.util.Vector;

public class Personne {

	private int idPersonne;
	private int idRole;
	private String nom;
	private String prenom;
	private String mail;
	private String tel;
	private String login;
	private String password;


public Personne(){
	// constructeur vide pour les héritages Stagiaire, Administratif, Formateur
}

	public Personne(String n, String p, String m, String t) {

		this.nom = n;
		this.prenom = p;
		this.mail = m;
		this.tel = t;

	}
public Personne(String n, String p, String m, String t, String login, String password) {

		this.nom = n;
		this.prenom = p;
		this.mail = m;
		this.tel = t;


	}
public Personne(int idRole,String n, String p, String m, String t) {
	this.idRole=idRole;
	this.nom = n;
	this.prenom = p;
	this.mail = m;
	this.tel = t;

}

public Personne(int idRole, String n, String p, String m, String t, String login, String password) {
	// reprend tous les champs de la table, sauf le premier (idPersonne, auto-incrémenté)
		this.nom = n;
		this.prenom = p;
		this.mail = m;
		this.tel = t;

	}

public void show1Personn() {
	// méthode pout test héritage Personne > Stagiaire
	Personne pTest = new Personne();
	pTest.idRole = 3;
	pTest.nom = "Richard";
	pTest.prenom = "Pierre";
	Vector<String> vec = new Vector<>();
	vec.add(String.valueOf(pTest.idRole));vec.add(pTest.nom);vec.add(pTest.prenom);
	System.out.print("Méthode test --> La personne : ");
	for (int i=0; i<vec.size(); i++) {
		System.out.print(vec.elementAt(i)+" ");
	}

}

//========================================= ACCESSEURS

	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}


}
