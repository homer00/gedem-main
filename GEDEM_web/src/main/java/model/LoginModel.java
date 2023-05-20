package model;

public class LoginModel {
	
	private String userName;
	private String passWord;
	
	public LoginModel(String un, String p) {
		this.userName = un;
		this.passWord = p;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
