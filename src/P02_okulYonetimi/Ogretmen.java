package P02_okulYonetimi;

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
		System.out.println("Öğretmenin TC NO :");
		kimlikNo = scan.nextLine();
		scan.nextLine();
		System.out.println("Öğretmenin Sicil Numarası :");
		sicilNo = scan.nextLine();
		System.out.println("Öğretmenin Bölümü :");
		bolum = scan.nextLine();

		Kisi obj = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);
		Islemler.ogretmenList.add(obj);

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

}
