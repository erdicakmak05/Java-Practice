package P02_okulYonetimi2;

import java.util.Scanner;

public class Ogretmen extends Kisi {

	private String sicilNo;
	private String bolum;
	static Scanner scan = new Scanner(System.in);

	public void ekleme() {
		String adSoyad, kimlikNo, sicilNo, bolum;
		int yas;

		System.out.println("Öğretmenin Adı Soyadı :");
		adSoyad = scan.nextLine();
		System.out.println("Öğretmenin Yaşı");
		yas = scan.nextInt();
		scan.nextLine();
		System.out.println("Öğretmenin TC NO :");
		kimlikNo = scan.nextLine();
		System.out.println("Öğretmenin Sicil Numarası :");
		sicilNo = scan.nextLine();
		System.out.println("Öğretmenin Bölümü :");
		bolum = scan.nextLine();

		Kisi obj = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);
		Islemler.ogretmenList.add(obj);

	}

	public void arama() {
		System.out.println("Bulmak istediğiniz öğretmenin TCK numarasini giriniz.");
		String tcNo = scan.next();
		for (int i = 0; i < Islemler.ogretmenList.size(); i++) {
			if (Islemler.ogretmenList.get(i).getKimlikNo().equals(tcNo)) {
				System.out.println("=====Öğretmen Bilgileri=====");
				System.out.println(Islemler.ogretmenList.get(i).toString());
			} else {
				System.out.println("===== Öğretmen Bulunamadı.=====");
			}

		}
	}

	@Override
	public String toString() {
		return "Ogretmen [Ad Soyad : " + getAdSoyad() + ", KimlikNo : " + getKimlikNo() + ", Yas : " + getYas()
				+ ", sicilNo : " + sicilNo + ", bolum : " + bolum + "]";
	}

	public Ogretmen() {

	}

	public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolum) {
		super(adSoyad, kimlikNo, yas);
		this.sicilNo = sicilNo;
		this.bolum = bolum;
	}

	public String getSicilNo() {
		return sicilNo;
	}

	public String getBolum() {
		return bolum;
	}

	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	
	public void listeleme() {
		System.out.println("===== Öğretmen Listesi ======");
		System.out.println(Islemler.ogretmenList.toString());
	}
	public void silme() {
		System.out.println("Silmek istediğiniz öğretmen TC no giriniz.");
		String tcNo = scan.next();
		for (int i = 0; i < Islemler.ogretmenList.size(); i++) {
			if (Islemler.ogretmenList.get(i).getKimlikNo().equals(tcNo)) {
				System.out.println(Islemler.ogretmenList.get(i).getAdSoyad() + " adlı Öğrencinin Bilgileri Silindi");
				Islemler.ogretmenList.remove(i);
			} else {
				System.out.println("Girdiğiniz TCK numaralı öğretmen bulunamadı.");
			}
		}

	}

}
