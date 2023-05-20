package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;

import tools.ControlConnection;
import view.App;
import view.Fenetre;
import view.ViewConnexion;
import view.ViewFormPersonne;
import view.ViewListeFormation;
import view.ViewListeStagiaire;
//import view.ViewListeStagiaire;



public class ControlLogin {

	private ControlConnection cc; // type DAO Acces, package "tools"
	//ArrayList<Login> listeLogin;
	//private ViewListeStagiaire vls;
	private Fenetre vfp;
	private ViewListeFormation vform;
	private ViewListeStagiaire vls;

	private int flag;

	// /** CONSTRUCTEUR =========================
	/**
	 *
	 * @param cn1
	 * @param app2
	 */
	public ControlLogin(ViewConnexion cn,App appli) {

		 cc = new ControlConnection();
		// ViewConnexion et App en paramètres, pour pouvoir échanger
		// des infos entre les vues et le controleur - 	cn : JPanel		appli : JFrame
		//this.app = appli;

		String loginStr = cn.getULogin().getText();
		// recupère le login avec le getter de la classe ViewConnexion
		// on transforme l'objet TextField en String (getText), pour le passer en paramètre de la requête SQL
		JTextField password = cn.getUPassword();
		String passwordStr = password.getText();
		// idem pour le mot de passe

		this.flag=0;

	try {

		String req2="SELECT idRole,login,password from personne where login='"+loginStr+"' AND password='"+passwordStr+"' ; ";
		//la requete récupère les infos dans la BDD en sélectionnant les champs qui correspondent aux
		//logins, pasword et role de la vue "ViewConnexion"
		// table : personne

		ResultSet rs2 = cc.getStatement().executeQuery(req2);
		// on fait un get pour recup le statement de ControlerConnection

		if (rs2.next()) { // si rs2 contient une donnée, donc si login et mot de passe correspondent
			System.out.println("LOGIN ET MOT DE PASSE OK");
			int monIdRole = rs2.getInt(1); // on recup le 1er champ du resultset, qui est idRole
			System.out.println("int monIdRole : "+rs2.getInt(1));
			String req3="SELECT nomRole FROM role WHERE idRole='"+monIdRole+"';";
			ResultSet rs3 = cc.getStatement().executeQuery(req3);


			if (rs3.next()) { // si le resultSet retourne nomRole


				System.out.println(rs3.getString(1));
				//================================================= Traitement des resultats dans la console
				if (rs3.getString(1).equals("User")) {
					System.out.println("Vous etes stagiaire.");
					flag = 1;

				}
				else if (rs3.getString(1).equals("Admin")) {
					System.out.println("Vous etes admin.");
					flag = 2;
				}
				else if (rs3.getString(1).equals("Formateur")) {
					System.out.println("Vous etes formateur/trice.");
					flag = 3;
				}
				else System.out.println("Valeur de rs3.getString(1): "+rs3.getString(1));
				//============================================ Traitement des resultats vers la JFrame
				appli.getContentPane().removeAll();
				// on supprime ce qu'il y avait précédemment sur le JPanel
				switch (flag) {
				case 1:
					// cas "User" --> Stagiaire
					vls = new ViewListeStagiaire(appli);
					appli.getContentPane().add(vls);
					break;
				case 2:
					// cas "Admin"
					vfp = new Fenetre();
					appli.getContentPane().add(vfp);
					break;
				case 3:
					// cas "Formateur"
					vform = new ViewListeFormation(appli);
					appli.getContentPane().add(vform);
					break;

				}

				appli.getContentPane().repaint();
				appli.getContentPane().revalidate();

						}
			else { // Affichage console si login et password ne "match" pas avec la BDD
				System.out.println("ACCESS REFUSE console");

				appli.getContentPane().add(cn.getMessage2());
				appli.getContentPane().repaint();
				appli.getContentPane().revalidate();

			}
		} // Fin if (rs2.next())
	}

		catch (SQLException efc){
			System.out.println("ControlLogin : Erreur ControlLogin");
			efc.printStackTrace();
			}

}

}




