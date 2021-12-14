package P02_okulYonetimi2;

import java.util.Scanner;

public class Kisi {
	
	private String adSoyad;
	private String kimlikNo;
	private int yas;
	static Scanner scan = new Scanner(System.in);
	
	public void silme() {
		
	}
	
	public void listeleme() {
		
	}
	public void ekleme() {
	
	}
	
	public void arama() {
		System.out.println("Arama kisi");		
	}
	
	public Kisi() {
		
	}
	
	public Kisi(String adSoyad, String kimlikNo, int yas) {
		super();
		this.adSoyad = adSoyad;
		this.kimlikNo = kimlikNo;
		this.yas = yas;
	}
	
	public String getAdSoyad() {
		return adSoyad;
	}
	public String getKimlikNo() {
		return kimlikNo;
	}
	public int getYas() {
		return yas;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}

}
