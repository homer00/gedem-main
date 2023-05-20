package model;

import java.util.ArrayList;

public class Login {
	private int	idPersonne;
	private String uLogin;
	private String uPassword;
	private String uRole;
	private ArrayList<String> listLogin;

	
	public Login(String ul, String up, String ur ){
		this.uLogin = ul;
		this.uPassword = up;
		this.uRole = ur;
		listLogin = new ArrayList<String>();
		
	}
	public Login(int ip, String ul, String up, String ur ){
		this.idPersonne = ip;
		this.uLogin = ul;
		this.uPassword = up;
		this.uRole = ur;
		listLogin = new ArrayList<String>();
		
	}

	public String getULogin() {
		return uLogin;
	}

	public void setULogin(String uLogin) {
		this.uLogin = uLogin;
	}

	public String getDbPassword() {
		return uPassword;
	}

	public void setUPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getURole() {
		return uRole;
	}

	public void setURole(String uRole) {
		this.uRole = uRole;
	}
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public ArrayList<String> getListLogin() {
		return listLogin;
	}
	public void setListLogin(ArrayList<String> listLogin) {
		this.listLogin = listLogin;
	}
	
	
}
