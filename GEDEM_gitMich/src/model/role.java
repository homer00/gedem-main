package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import tools.ControlConnection;

public class role {
	protected int idRole;
	protected String nomRole;
	protected ControlConnection ccr;
	protected static Vector<String> vectorRole;

	public role(int id, String n) {
		this.idRole=id;
		this.nomRole=n;

	}
	public role() {
		System.out.println("Contructeur pour role avec connexion BDD");
		vectorRole = new Vector<>();
		boolean flag_role = false;
		if (role.vectorRole.isEmpty()) {
			// on instancie une connexion bdd si la liste de roles n'existe pas encore.
			flag_role = true;
			ccr = new ControlConnection();
		}
		String msg = (flag_role)? "Nouvelle connexion BDD (Vector vide)" : "Vector role deja rempli";
		System.out.println("flag_role : "+flag_role+ "\t"+msg);

	}

	/**
	 * 			METHODE listerRole()
	 *
	 * @return
	 */

	public Vector<String> listerRole() {

		String req = "SELECT nomRole FROM role;";

		try {
			ResultSet rs = ccr.getStatement().executeQuery(req);
			//int i=0;
			String roleStr2 = "?";
			vectorRole.addElement("");	// on ajoute un premier élément vide en début de liste
			while (rs.next()) {

				String roleStr = (rs.getString(1)); //=="Admin")? "Administratif":"";

						if (roleStr.equals("Admin")) {
							roleStr2="Administratif";
						}
							else if (roleStr.equals("Formateur")) {
								roleStr2="Formateur";
							}
							else if (roleStr.equals("User")) {
								roleStr2="Stagiaire";
							}


				// on récupère les noms de la table role, et on leur attribue les valeurs
				// "Administratif", "Formateur" ou "Stagiaire" en fonction du role

				vectorRole.addElement(roleStr2);
				 // on remplit le vector avec les éléments correspondant aux roles

			}
			for (String element : vectorRole) {
				System.out.print("vectorRole : "+element+"\t");
				}
			System.out.println("");

		} catch (SQLException e) {
			System.out.println("erreur pour recuperer le role");
			e.printStackTrace();
		}
		//cc.fermerConn();
		return vectorRole;

	}
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public String getNomRole() {
		return nomRole;
	}
	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}
	public ControlConnection getCcr() {
		return ccr;
	}
	public void setCcr(ControlConnection ccr) {
		this.ccr = ccr;
	}
	public Vector<String> getVectorRole() {
		return vectorRole;
	}
	public void setVectorRole(Vector<String> vectorRole) {
		role.vectorRole = vectorRole;
	}

}
