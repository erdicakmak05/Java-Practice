package javaProjects.OgrenciIsleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Ogrenci> ogrenciListesi = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		

		menuGoster();
		
		Ogrenci ogr1 = new Ogrenci("Erdi", "Çakmak", 15.5);
		ogrenciListesi.add(ogr1);

		Ogrenci ogr2 = new Ogrenci("Hasan", "Çelik", 60.5);
		ogrenciListesi.add(ogr2);

		Ogrenci ogr3 = new Ogrenci("Kadir", "Durmaz",15.5);
		ogrenciListesi.add(ogr3);
		
	

		
		
	



	}

	private static void menuGoster() {
		System.out.println("Seçimizi yapınız.");
		System.out.println("1-) Öğrenci Kaydı");
		System.out.println("2-) Ogrenci Listeleme");
		System.out.println("3-) Öğrenci Kayıt Silme");
		System.out.println("4-) Çıkış Yap.");
		
		int tercih = 0;
		tercih = scan.nextInt();

		switch (tercih) {
		case 1:
			ogrenciKaydıYap();
			menuGoster();
			break;
		case 2:
			ogrenciListele();
			menuGoster();
			break;
		case 3:
			ogrenciKaydiSil();
			menuGoster();
			break;
		case 4:
			System.exit(tercih);
		default:
			System.out.println("Yanlış giriş yaptınız.");
			menuGoster();
			break;
		}
		
	}

	private static void ogrenciKaydiSil() {
		ogrenciListele();
		System.out.println("Silme istediğiniz Öğrencinin Öğrenci Numarasini Giriniz.");
		int ogrenciNumara = 0;
		ogrenciNumara=scan.nextInt();
		for (int i = 0; i < ogrenciListesi.size(); i++) {
			if(ogrenciListesi.get(i).getOgrNo()==ogrenciNumara) {
				System.out.println(ogrenciListesi.get(i).getAd()+" " + ogrenciListesi.get(i).getSoyad()+"'nin kaydı silindi.");
				ogrenciListesi.remove(i);
			}else {
				System.out.println("Geçersiz öğrenci numarası girdiniz.");
			}
			
		}

	}

	private static void ogrenciListele() {
		System.out.println("======= Öğrenci Listesi ========");
		for (int i = 0; i < ogrenciListesi.size(); i++) {
			System.out.println(ogrenciListesi.get(i).getOgrNo()+"\t"+ogrenciListesi.get(i).getAd() + " " + ogrenciListesi.get(i).getSoyad() + "\t"
					+ ogrenciListesi.get(i).getOrtalama());
		}
	}

	private static void ogrenciKaydıYap() {
		String ad;
		String soyad;
		double ortalama;
		System.out.println("===Öğrenci Kaydı===");
		System.out.println("Öğrencini Adı : ");
		ad = scan.next();
		System.out.println("Öğrenci Soyadı : ");
		soyad = scan.next();
		System.out.println("Öğrencinin Ortalamasi");
		ortalama = scan.nextDouble();
		System.out.println(ad + " " + soyad + "'in kaydı oluşturuldu.");
		Ogrenci obj = new Ogrenci(ad, soyad, ortalama);
		ogrenciListesi.add(obj);
	}

}
