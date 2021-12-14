package P02_okulYonetimi;

import java.util.Scanner;

public class Ogrenci extends Kisi {

	private String numara;
	private String sinif;
	static Scanner scan = new Scanner(System.in);

	public void ekleme() {
		String adSoyad, kimlikNo, numara, sinif;
		int yas;

		System.out.println("Öğrenci Adı Soyadı :");
		adSoyad = scan.nextLine();
		System.out.println("Öğrenci Yaşı");
		yas = scan.nextInt();
		scan.nextLine();
		System.out.println("Öğrenci TC NO :");
		kimlikNo = scan.nextLine();
		System.out.println("Öğrenci Numarası :");
		numara = scan.nextLine();
		System.out.println("Öğrenci Sınıfı :");
		sinif = scan.nextLine();

		Kisi obj = new Ogrenci(adSoyad, kimlikNo, yas, numara, sinif);
		Islemler.ogrenciList.add(obj);
		
		
	}
	
	



	@Override
	public String toString() {
		return "Ogrenci  [Ad Soyad : " + getAdSoyad() + ", KimlikNo : " + getKimlikNo() + ", Yas : " + getYas()
				+ ", numara : " + numara + ", sinif : " + sinif + "]";
	}





	public Ogrenci() {

	}

	public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {
		super(adSoyad, kimlikNo, yas);
		this.numara = numara;
		this.sinif = sinif;
	}

	public String getNumara() {
		return numara;
	}

	public String getSinif() {
		return sinif;
	}

	public void setNumara(String numara) {
		this.numara = numara;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

}
