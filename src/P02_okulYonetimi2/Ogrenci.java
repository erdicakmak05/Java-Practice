package P02_okulYonetimi2;

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

	public void arama() {
		System.out.println("Bulmak istediğiniz öğrenicin TCK numarasini giriniz.");
		String tcNo = scan.next();
		for (int i = 0; i < Islemler.ogrenciList.size(); i++) {
			if (Islemler.ogrenciList.get(i).getKimlikNo().equals(tcNo)) {
				System.out.println("=====Öğrenci Bilgileri=====");
				System.out.println(Islemler.ogrenciList.get(i).toString());
			} else {
				System.out.println("===== Öğrenci Bulunamadı.=====");
			}

		}
	}

	@Override
	public String toString() {
		return "Ogrenci  [Ad Soyad : " + getAdSoyad() + ", KimlikNo : " + getKimlikNo() + ", Yas : " + getYas()
				+ ", numara : " + numara + ", sinif : " + sinif + "]\n";
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

	public void listeleme() {
		System.out.println("===== Öğrenci Listesi ======");
		System.out.println(Islemler.ogrenciList.toString());
	}

	public void silme() {
		System.out.println("Silmek istediğiniz öğrenci TC no giriniz.");
		String tcNo = scan.next();
		for (int i = 0; i < Islemler.ogrenciList.size(); i++) {
			if (Islemler.ogrenciList.get(i).getKimlikNo().equals(tcNo)) {
				System.out.println(Islemler.ogrenciList.get(i).getAdSoyad() + " adlı Öğrencinin Bilgileri Silindi");
				Islemler.ogrenciList.remove(i);
			} else {
				System.out.println("Girdiğiniz TCK numaralı öğrenci bulunamadı.");
			}
		}

	}

}
