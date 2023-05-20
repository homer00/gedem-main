package controller;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import tools.ControlConnection;
import view.App;
import view.ViewListeFormation;
import view.ViewListeStagiaire;

public class ControlStagiaire {
	public String requete;
	protected ArrayList<String> enteteFormation;
	protected Vector<Vector> leVector2;
	protected Vector<String> leVector;
	protected ArrayList<String> monArrayList;
	protected ArrayList<String> listStagiaire;
	
	
	public ControlStagiaire(App appli,ViewListeStagiaire vls) {

		listStagiaire = new ArrayList<>();
		enteteFormation = new ArrayList<>();
		leVector = new Vector<>();
		leVector2 = new Vector<>();
	}
	public Vector<Vector> showTableFormationJT() {
		
		ControlConnection cc = new ControlConnection();
		requete = "SELECT * from personne WHERE idRole='3';";
		
		try {
			ResultSet rs = cc.getStatement().executeQuery(requete);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cpt = 1;
			while (cpt < rsmd.getColumnCount()) {
				enteteFormation.add(rsmd.getColumnName(cpt));
				//enteteFormation : ArrayList qui récupère le nom des colonnes de la table
				cpt++;
			}
			System.out.println("Entete  "+ enteteFormation);
			while (rs.next()) {
				monArrayList = new ArrayList<>();
				monArrayList.add(Integer.toString(rs.getInt(1)));
				monArrayList.add(rs.getString(2));
				monArrayList.add(rs.getString(3));
				monArrayList.add(rs.getString(4));
				monArrayList.add(rs.getString(5));
				monArrayList.add(rs.getString(6));
				monArrayList.add(rs.getString(7));
				
				
				this.leVector2.addElement(new Vector<>(monArrayList));
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ControlFormateur : Erreur dans le traitement executeQuery, ControlFormateur");
			e.printStackTrace();
		}
		cc.fermerConn();

		return leVector2;
}

	public ArrayList<String> getEnteteFormation() {
		return enteteFormation;
	}

	public void setEnteteFormation(ArrayList<String> enteteFormation) {
		this.enteteFormation = enteteFormation;
	}

	public Vector<Vector> getLeVector2() {
		return leVector2;
	}

	public void setLeVector2(Vector<Vector> leVector2) {
		this.leVector2 = leVector2;
	}

	public ArrayList<String> getMonArrayList() {
		return monArrayList;
	}

	public void setMonArrayList(ArrayList<String> monArrayList) {
		this.monArrayList = monArrayList;
	}
	
}
