package Encapsulation_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	static Scanner scan = new Scanner(System.in);
	static List <User> kullanicilar = new ArrayList<>(); 
	
	static List <String> kAdi = new ArrayList<>(); 
	static List <String> sifre = new ArrayList<>(); 

	public static void main(String[] args) {
		System.out.println("Kaç tane kullanıcı olusturmak istiyorsunuz.");
		int istekSayisi = scan.nextInt();
		for (int i = 0; i < istekSayisi; i++) {
			System.out.println((i+1)+"'inci kullaninin bilgilerini girin.");
			kullaniciEkle();
		}

	}
	private static void kullaniciEkle() {
		Scanner scan = new Scanner(System.in);
		
		String username;
		String sifree;
		System.out.println("Kullanici adınızı giriniz.");
		username=scan.next();
		
		System.out.println("Şifrenizi giriniz");
		sifree=scan.next();
		
		User obj = new User(username,sifree);
		kullanicilar.add(obj);
		
	}

}
