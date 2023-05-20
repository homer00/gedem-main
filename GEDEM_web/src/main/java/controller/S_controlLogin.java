package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;

import model.LoginModel;
import tools.Connexion;
import view.Frame_Admin;
import view.Frame_Formateur;
import view.Frame_User;
import view.VueConnexion;

/**
 * Servlet implementation class S_controlLogin
 */
@WebServlet("/S_controlLogin")
public class S_controlLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connexion cc; // type DAO Acces
	protected HttpSession session;
	private String str_login_session="";
	private String str_pass_session="";
	private String login;
	private String pass;
	private int monIdRole;
	//private Frame_User fu;
	//private Frame_Admin fa;
	//private Frame_Formateur ff;
	
	//private ViewFormPersonne vfp;
	//private ViewListeFormation vform;
	private int flag;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public S_controlLogin() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
		
		//getServletContext().getRequestDispatcher("/VueStagiaire").forward(request,response);
		//package controller;

			// /** CONSTRUCTEUR =========================
			/**
			 *
			 * @param cn1
			 * @param app2
			 */
			//public ControlLogin(ViewConnexion cn,App appli) {
	/*
			public S_controlLogin(VueConnexion vc) {
				 cc = new Connexion();
				// VueConnexion et App en paramètres, pour pouvoir échanger
				// des infos entre les vues et le controleur - 
				 
				String loginStr = vc.getULogin().getText();
				// recupère le login avec le getter de la classe VueConnexion
				// on transforme l'objet TextField en String (getText), pour le passer en paramètre de la requête SQL
				JTextField password = cc.getUPassword();
				String passwordStr = password.getText();
				// idem pour le mot de passe

				this.flag=0;

			try {

				String req2="SELECT idRole,login,password from personne where login='"+loginStr+"' AND password='"+passwordStr+"' ; ";
				//la requete récupère les infos dans la BDD en sélectionnant les champs qui correspondent aux
				//logins, pasword et role de la vue "VueConnexion"
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
			//vls = new ViewListeStagiaire(appli);
			//appli.getContentPane().add(vls);
							break;
						case 2:
							// cas "Admin"
							vfp = new ViewFormPersonne(appli);
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
 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String str_login = request.getParameter("uLogin");
		String str_pass = request.getParameter("uPassword");
		session = request.getSession();
		if (session!=null) {
/*
			// Instanciation d'un objet LoginModel pour conserver les variables de session.
			LoginModel lm = new LoginModel(str_login, str_pass);
		session.setAttribute("str_login_session", lm.getUserName());
		session.setAttribute("str_pass_session", lm.getPassWord());
		// ATTENTION : str_login_session et str_pass_session doivent absolument être entourés de guillemets.
		// sinon pas de transmission des valeurs à la vue.
		this.login = (String)session.getAttribute(str_login_session);
		this.pass = (String)session.getAttribute(str_pass_session);
*/
			session.setAttribute("str_login_session", str_login);
			session.setAttribute("str_pass_session", str_pass);
			this.login = (String)session.getAttribute("str_login_session");
			this.pass = (String)session.getAttribute("str_pass_session");
		}
		
		try {
			cc = new Connexion();
			
			String req_scl="SELECT idRole,login,password from personne where login='"+login+"' AND password='"+pass+"' ; ";
			Statement st_scl = cc.getStatement();
			ResultSet rs_scl = st_scl.executeQuery(req_scl);
			/*
			System.out.println("test avant rs_scl.next : ");
			System.out.println("S_controlLogin, str_login : "+str_login);
			System.out.println("S_controlLogin, str_pass : "+str_pass);
			System.out.println("this.login :"+this.login);
			System.out.println("this.pass :"+this.pass);
			*/
			
			if(rs_scl.next()) { // Si Login et password matchent
				System.out.println("Login et password matchent");
				/*
				System.out.println("test dans la condition rs_scl.next : ");
				System.out.println("S_controlLogin, str_login : "+str_login);
				System.out.println("S_controlLogin, str_pass : "+str_pass);
				*/
				
				// Décommenter la ligne en dessous pour tester le résultat dans une ServLet.
				//getServletContext().getRequestDispatcher("/DebugVueConnexion").forward(request, response);
				String monIdRole = Integer.toString(rs_scl.getInt(1)); // conversion int > String
				System.out.println("int monIdRole : "+rs_scl.getInt(1));
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
					//appli.getContentPane().removeAll();
					// on supprime ce qu'il y avait précédemment sur le JPanel
					switch (flag) {
					case 1:
						// cas "User" --> Stagiaire
						getServletContext().getRequestDispatcher("/VueStagiaire").forward(request, response);
		//vls = new ViewListeStagiaire(appli);
		//appli.getContentPane().add(vls);
						break;
					case 2:
						// cas "Admin"
						getServletContext().getRequestDispatcher("/VueAdmin").forward(request, response);
						//fu = new Frame_User();
						//appli.getContentPane().add(vfp);
						break;
					case 3:
						// cas "Formateur"
						getServletContext().getRequestDispatcher("/VueFormateur").forward(request, response);
						//ff = new Frame_Formateur();
						//appli.getContentPane().add(vform);
						break;

					}

					//appli.getContentPane().repaint();
					//appli.getContentPane().revalidate();
	
			} // Fin if (rs3.next())
	
			}
			else {
				System.out.println("Pas de correspondance Login / password dans la BDD");
			}
			
		}
		catch (SQLException e1) {
			System.out.println("Erreur e1 S_controlLogin");
			e1.printStackTrace();
		}


	
	}
}

