package model;

import java.util.Date;

public class Formation {
	private int idFormation;
	private String intituleFormation;
	private Date debutFormation;
	private Date finFormation;
	//private String  commentFormation ;
	//private ArrayList<Formation> listFormation;


	public Formation(int idf, String ifor, Date df, Date ff) {
		this.idFormation = idf;
		this.intituleFormation = ifor;
		this.debutFormation = df;
		this.finFormation = ff;
		//this.commentFormation = cf;
		//this.listFormation = new ArrayList<Formation>();

	}

	public int getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}

	public String getIntituleFormation() {
		return intituleFormation;
	}

	public void setIntituleFormation(String intituleFormation) {
		this.intituleFormation = intituleFormation;
	}

	public Date getDebutFormation() {
		return debutFormation;
	}

	public void setDebutFormation(Date debutFormation) {
		this.debutFormation = debutFormation;
	}

	public Date getFinFormation() {
		return finFormation;
	}

	public void setFinFormation(Date finFormation) {
		this.finFormation = finFormation;
	}

	/*
	public ArrayList<Formation> getListFormation() {
		return listFormation;
	}

	public void setListFormation(ArrayList<Formation> listFormation) {
		this.listFormation = listFormation;
	}
*/


}
