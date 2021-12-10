package _14_Encapsulation.Q02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	Scanner scan = new Scanner(System.in);
	static List <User> kullanicilar = new ArrayList<>(); 
	public static void main(String[] args) {
		User usr1 = kullaniciOlustur();
		kullanicilar.add(usr1);
		System.out.println("====Birinci Kullanıcı Olusturuldu====");
		System.out.println("İkinci kullanıcının bilgilerini giriniz.");
		User usr2 = kullaniciOlustur(); 
		System.out.println("====İkinci Kullanıcı Olusturuldu====");
		kullanicilar.add(usr2);
		
		System.out.println(usr1.getUserName());
		
		System.out.println("Birinci Kullanıcının Bilgileri");
		System.out.println(usr1.getId() + " " + usr1.getUserName() + " " + usr1.getPassword()+ " "+ usr1.isActive() + " " +usr1.isSignedIn());
		System.out.println("İkinci kullanıcının Bilgileri");
		System.out.println(usr2.getId() + " " + usr2.getUserName() + " " + usr2.getPassword()+ " "+ usr2.isActive() + " " +usr2.isSignedIn());

		

		

	}
	public static User kullaniciOlustur() {
		Scanner scan = new Scanner(System.in);
		
		String kAdi="";
		String pass="";
		User obj = new User(kAdi, pass);
		
		
		System.out.println("Kullanici adınızı giriniz.");
		obj.setUserName(scan.next());
		
		System.out.println("Şifrenizi giriniz");
		obj.setPassword(scan.next());
	
		return obj;
	}


}
