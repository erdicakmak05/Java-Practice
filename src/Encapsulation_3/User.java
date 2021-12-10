package Encapsulation_3;

import _14_Encapsulation.Q02.UserMain;

public class User {
	//id, username, password, active (boolean), signedIn (boolean)
	private static int id=1000;
	private String userName;
	private String password;
	private boolean active=true;
	private boolean signedIn=true;
	
	@SuppressWarnings("static-access")
	public User(int id, String userName, String password, boolean active, boolean signedIn) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.active = active;
		this.signedIn = signedIn;
	}
	
	
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	public User() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return ++id;
	}


	public String getUserName() {
		return userName;
	}


	public String getPassword() {
		return password;
	}


	public boolean isActive() {
		return active;
	}


	public boolean isSignedIn() {
		return signedIn;
	}


	@SuppressWarnings("static-access")
	public void setId(int id) {
		this.id = id;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public void setPassword(String password) {
		if(password.length()<6) {
			System.out.println("Şireniz en az 6 karakter içermelidir.");
			System.out.println("==============HATA=================");
			System.out.println("Bilgilerinizi tekrar doldurunuz.");
			UserMain.kullaniciOlustur();
		}else {
			this.password = password;
		}
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public void setSignedIn(boolean signedIn) {
		this.signedIn = signedIn;
	}


	
	

}
