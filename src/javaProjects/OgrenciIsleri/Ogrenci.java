package javaProjects.OgrenciIsleri;

public class Ogrenci {
	private static int ogrNo=1000;
	private String ad,soyad;
	private double ortalama;
	
	
	public Ogrenci(String ad, String soyad, double ortalama) {
		this.ad=ad;
		this.soyad=soyad;
		this.ortalama=ortalama;
	}
	public int getOgrNo() {
		return ++ogrNo;
	}
	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public double getOrtalama() {
		return ortalama;
	}
	@SuppressWarnings("static-access")
	public void setOgrNo(int ogrNo) {
		this.ogrNo = ogrNo;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}
	
	

}
