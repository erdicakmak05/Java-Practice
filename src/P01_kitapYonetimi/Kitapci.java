package P01_kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi
		işlemleri yapmasına imkan tanıyan bir uygulama yazınız.

	2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli.
		Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
		Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.

		========= KİTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitapları listele
			4: Bitir

 */
public class Kitapci {
	static List<Kitap> kitapListesi = new ArrayList<>();

	static int kitapNo=1000;
	public static void main(String[] args) {
		

		menuGoster();

	}

	private static void menuGoster() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int secim = 0;
		System.out.println("1: Kitap ekle\n" + "2: Numara ile kitap sil\n"
				+ "3: Tüm kitapları listele\n" + "4: Bitir");
		System.out.println("Seçiminizi yapınız.");
		secim= scan.nextInt();
		switch (secim) {
		case 1:
			kitapEkle();
			menuGoster();
			
			break;
		case 2:
			numaraIleKitapSil();
			menuGoster();
			break;
		case 3:
			kitaplariListele();
			menuGoster();
			break;
		case 4:
			System.exit(secim);
			break;

		default:
			System.out.println("Geçersiz tercih yaptınız.");
			menuGoster();
			break;
		}		
	}

	private static void numaraIleKitapSil() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Silmek istediğiniz kitabın id sini girin.");
		int id = scan.nextInt();
		for (Kitap k : kitapListesi) {
			if(k.getKitapID()==id) {
				kitapListesi.remove(k);
			}
		}
		
		
	}

	private static void kitaplariListele() {
		System.out.println(kitapListesi.toString());
		
	}

	private static void kitapEkle() {
		String kitapAdi;
		int yayinYili;
		double fiyat;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Kitabın adını giriniz.");
		kitapAdi=scan.nextLine();
		System.out.println("Yayin yilini giriniz.");
		yayinYili = scan.nextInt();
		System.out.println("Fiyatini giriniz");
		fiyat= scan.nextDouble();
		Kitap obj = new Kitap(++kitapNo,kitapAdi, yayinYili,fiyat);
		kitapListesi.add(obj);
		

	}

}
