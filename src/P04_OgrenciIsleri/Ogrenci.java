package P04_OgrenciIsleri;

public class Ogrenci {
	private int ogrNo;
	private static int ogrNoSayaci=1000;
	private String ad,soyad;
	private double ortalama;
	
	
	
	public Ogrenci(int id,String ad, String soyad, double ortalama) {
		this.ad=ad;
		this.soyad=soyad;
		this.ortalama=ortalama;
		this.ogrNo=ogrNoSayaci++;
	}
	public int getOgrNo() {
		return ogrNo;
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
