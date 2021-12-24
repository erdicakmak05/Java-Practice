package P09_AracKiralama;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Arac> araclar = new ArrayList<>();
	static List<Musteri> musteriBilgileri = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int aracNo = 100;

	public static void main(String[] args) {

		aracEkle(araclar);
		menu();
		musteriDetay(musteriBilgileri);

		System.out.println(araclar.toString());

	}

	private static void musteriDetay(List<Musteri> musteriBilgileri2) {
		System.out.println("Kaç numaralı aracı istiyorsunuz");
		System.out.println(araclar);
		int tercih = scan.nextInt();
		System.out.println("Adınız : ");
		String ad = scan.next();
		System.out.println("Soyadınız : ");
		String soyad = scan.next();
		System.out.println("Yaşınız : ");
		String yas = scan.next();
		System.out.println("Telefon Numaranız : ");
		String telNo = scan.next();
		System.out.println("TC Numaranız : ");
		String tc = scan.next();
		System.out.println("Kart No : ");
		String kartNo = scan.next();
		System.out.println("Alınacak Şehir :");
		String alinacakSehir = scan.next();
		System.out.println("Alincak günü giriniz. (DD-MM-YYYY)");
		String alinacakGun = scan.next();
		System.out.println("Alınacak saati giriniz. (HH:MM:SS");
		String alisSaati = scan.next();
		System.out.println("Teslim gününü giriniz. (DD-MM-YYYY)");
		String teslimGun = scan.next();
		System.out.println("Teslim saati giriniz. (HH:MM:SS");
		String teslimSaati = scan.next();
		
		Tarih.tarihFarkiBul(alinacakGun, teslimGun);
		
		Tarih tarih =new Tarih();
		
		Musteri musteri = new Musteri(ad, soyad, yas, telNo, tc, kartNo, alinacakSehir, alinacakGun, alisSaati, teslimGun, teslimSaati);
		
		musteriBilgileri.add(musteri);
		System.out.println(musteri);
		System.out.println("Kiralanacak Gün Sayısı" + Tarih.tarihFarkiBul(alinacakGun, teslimGun));
		System.out.println("Odenecek tutar : " + araclar.get(tercih-1).getGunlukUcret()*Tarih.tarihFarkiBul(alinacakGun, teslimGun));
		
	}

	private static void menu() {
		System.out.println("======Araçlarımız=====");
		System.out.println(araclar);
		System.out.println("1- Araç Kiralama");
		System.out.println("2- Çıkış");
		System.out.println("Seçiminizi yapınız.");

		int tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			aracKiralama(aracNo);
			break;
		case 2:
			System.out.println("Teşekkürler");
			System.exit(0);
			break;

		default:
			break;
		}

	}

	private static void aracKiralama(int aracNo) {
		System.out.println("Hangi aracı kiralamak istiyorsunuz");
		int tercih = scan.nextInt();
		for (Arac arac : araclar) {
			if (arac.getAracNo()==tercih) {
				System.out.println("Aracınızın bilgileri\n" + araclar.get(tercih));
			}
		}
		
	}

	private static void aracEkle(List<Arac> araclar2) {
		Arac opel1 = new Arac(++aracNo, "Opel", "Astra", "Dizel", "Manuel", 100);
		araclar.add(opel1);
		Arac toyota1 = new Arac(++aracNo, "Toyota", "Corolla", "Benzin", "Otomatik", 120);
		araclar.add(toyota1);
		Arac volvo1 = new Arac(++aracNo, "Volvo", "S60", "Elektrik", "Otomatik", 150);
		araclar.add(volvo1);

	}

}

/*
 * Arac opel1 = new Arac(++Arac.aracNum,"Opel","Astra", "Dizel", "Manuel", 100);
 * araclar.add(opel1); Arac toyota1 = new
 * Arac(++Arac.aracNum,"Toyota","Corolla", "Benzin", "Otomatik", 120);
 * araclar.add(toyota1); Arac volvo1 = new Arac(++Arac.aracNum,"Volvo","S60",
 * "Elektrik", "Otomatik", 150); araclar.add(volvo1);
 */