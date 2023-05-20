package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {

	private String dbName="gedem" ;
	//private String sql_host = "localhost";
	//private String sql_host = "192.168.1.121";
	private String sql_host = "localhost";
	private String dao_strClassName = "com.mysql.cj.jdbc.Driver";
	private int sqlPort = 3306;
	//private String loginDb = "root";
	private String loginDb = "root";
	private String passwordDb = "root";
	private String strUrl = "jdbc:mysql://"+sql_host+":"+sqlPort+"/" +  dbName+"?useSSL=false&serverTimezone=UTC";
	private Connection conn;
	private Statement st;
	


	// >>>>>>>>>>>> PENSER A MODIFIER l'utilisateur (root) et password (root) en fonction de votre base de donnée.

	/**
	 *  Constructeur sans paramètres
	 * @param dao_db
	 * @param dao_login
	 * @param dao_password
	 */
	public Connexion() {

		try {
			Class.forName(dao_strClassName);
			sop("\nConnexion effectuee.");
			System.out.println("ControlConnection : Constructeur sans parametres (1)");
			System.out.println("Adresse de connexion : "+ strUrl+"\n");
			this.conn = DriverManager.getConnection(strUrl, loginDb, passwordDb);
			 this.st = conn.createStatement();

		}
		catch (SQLException e) {
			System.out.println("ControlConnection : erreur au premier \"try\".  Probleme de Connection ou Statement.");
			System.out.println("Le serveur SQL est-il démarré ?");
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			System.out.println("ControlConnection : classe introuvable : erreur de driver jdbc");
			e.printStackTrace();
		}
	}

	/**
	 *  CONSTRUCTEUR SURCHARGE
	 *  Ce constructeur prend 3 paramètres : le nom de la base, le login et le password.
	 * @param dao_db
	 * @param dao_login
	 * @param dao_password
	 */
	public Connexion(String dao_db, String dao_login, String dao_password) {
		this.dbName = dao_db;
		this.loginDb = dao_login;
		this.passwordDb = dao_password;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			sop("Connexion effectuee.");
			System.out.println("ControlConnection : Constructeur 2 avec parametres (2)");
			System.out.println("Adresse de connexion : "+ strUrl+" ");
			this.conn = DriverManager.getConnection(strUrl, loginDb, passwordDb);
			this.st = conn.createStatement();

					}
		catch (SQLException e) {
			System.out.println("ControlConnection : erreur au premier \"try\".  Probleme de Connection ou Statement -> Constructeur 2");
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			System.out.println("ControlConnection : classe introuvable : erreur de driver.");
			e.printStackTrace();
		}

		} // FIN CONSTRUCTEUR


	// ---------------------------------------getters , Setters -------------------


	public String getDao_strClassName() {
		return dao_strClassName;
	}

	public void setDao_strClassName(String dao_strClassName) {
		this.dao_strClassName = dao_strClassName;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public Statement getStatement() {
		return st;
	}

	public void setSt(Statement st) {
		this.st = st;
	}

	// =========================================== Alias S.O.P
	public void sop(String texte) {
		System.out.println(texte);
	}
	// =========================================== fermerConn()
	/**
	 *  Fonction fermerConn()
	 *  Fermeture de la connexion mysql:jdbc
	 *  Fermeture du Statement instancié à partir de cette connexion
	 *  @param
	 *  {@summary}
	 */
public void fermerConn() {
	try {
		getConn().close();
		getStatement().close();
	}
	catch (SQLException efc){
		System.out.println("ControlConnection : erreur de fermeture de connexion / Statement (Driver jdbc)");
		efc.printStackTrace();
		}
}



}