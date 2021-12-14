package P02_okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	BİR OKUL YÖNETİM PLATFORMU KODALYINIZ.

	1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
		Kayıtlarda şu bilgiler olabilmelidir.

		Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
		Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.

	2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
		Aşağıdaki gibi bir menü gösterilsin.

	====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	 1- ÖĞRENCİ İŞLEMLERİ
	 2- ÖĞRETMEN İŞLEMLERİ
	 Q- ÇIKIŞ

	3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.

	============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 5-ANA MENÜ
		 Q-ÇIKIŞ

	SEÇİMİNİZ:

	4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
		Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.

 */

public class Islemler extends Kisi{
	public static List<Kisi> ogrenciList = new ArrayList<>();

	public static List<Kisi> ogretmenList = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);

	public static String kisiTuru;

	public static void anaMenu() {
		System.out.println("====================================\n" + "ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n"
				+ "====================================\n" + "1- ÖĞRENCİ İŞLEMLERİ\n" + "2- ÖĞRETMEN İŞLEMLERİ\n"
				+ "0- ÇIKIŞ\n" + "");
		System.out.print("İşleminizi seçiniz :");
		String secim = scan.next().toUpperCase();

		switch (secim) {
		case "1":
			kisiTuru = "OGRENCİ";
			islemMenusu();
			break;
		case "2":
			kisiTuru = "OGRETMEN";
			islemMenusu();
			break;
		case "q":
			System.exit(0);
			break;
		default:
			System.out.println("Yanlış giriş yaptınız.");
			anaMenu();
			break;
		}
	}

	private static void islemMenusu() {
		System.out.println("============= İŞLEMLER =============\n" + "1-EKLEME\n" + "2-ARAMA\n" + "3-LİSTELEME\n"
				+ "4-SİLME\n" + "5-ANA MENÜ\n" + "Q-ÇIKIŞ\n" + "");
		System.out.println("İşlem tercihinizi seçiniz");
		int islemTercihi=scan.nextInt();
		switch (islemTercihi) {
		case 0:
			anaMenu();
			break;
		case 1:
			ekleme();
			islemMenusu();
			break;
		case 2:
			//arama();
			islemMenusu();
		case 3:
			//listeleme();
			islemMenusu();
			break;
		case 4:
			//silme();
			islemMenusu();
			break;

		default:
			System.out.println("Hatalı giriş yaptınız");
			islemMenusu();
			break;
		}
	}



}
