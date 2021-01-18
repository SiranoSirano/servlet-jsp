package package8syou2kaime.model;

//登録ユーザーを示すJavaBeans

import java.io.Serializable;

public class User implements Serializable {

	private String mail;
	private String pass;

	public User() {}
	public User(String mail,String pass) {

		this.mail = mail;
		this.pass = pass;
	}
	//getの時のみ登録に入るのでsetterはいらない


	public String getMail() {return mail;}

	public String getPass() {return pass;}
}
