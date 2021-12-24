package P09_AracKiralama;

public class Musteri {
	
	private String ad;
	private String soyAd;
	private String yas;
	private String telefon;
	private String id;
	private String kartNo;
	private String alinacakSehir;
	private String alinacakGun;
	private String alisSaati;
	private String teslimGunu;
	private String teslimSaati;
	
	
	public Musteri(String ad, String soyAd, String yas, String telefon, String id, String kartNo, String alinacakSehir,
			String alinacakGun, String alisSaati, String teslimGunu, String teslimSaati) {
		super();
		this.ad = ad;
		this.soyAd = soyAd;
		this.yas = yas;
		this.telefon = telefon;
		this.id = id;
		this.kartNo = kartNo;
		this.alinacakSehir = alinacakSehir;
		this.alinacakGun = alinacakGun;
		this.alisSaati = alisSaati;
		this.teslimGunu = teslimGunu;
		this.teslimSaati = teslimSaati;
	}
	
	public String getAd() {
		return ad;
	}
	public String getSoyAd() {
		return soyAd;
	}
	public String getYas() {
		return yas;
	}
	public String getTelefon() {
		return telefon;
	}
	public String getId() {
		return id;
	}
	public String getKartNo() {
		return kartNo;
	}
	public String getAlinacakSehir() {
		return alinacakSehir;
	}
	public String getAlinacakGun() {
		return alinacakGun;
	}
	public String getAlisSaati() {
		return alisSaati;
	}
	public String getTeslimGunu() {
		return teslimGunu;
	}
	public String getTeslimSaati() {
		return teslimSaati;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	public void setYas(String yas) {
		this.yas = yas;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setKartNo(String kartNo) {
		this.kartNo = kartNo;
	}
	public void setAlinacakSehir(String alinacakSehir) {
		this.alinacakSehir = alinacakSehir;
	}
	public void setAlinacakGun(String alinacakGun) {
		this.alinacakGun = alinacakGun;
	}
	public void setAlisSaati(String alisSaati) {
		this.alisSaati = alisSaati;
	}
	public void setTeslimGunu(String teslimGunu) {
		this.teslimGunu = teslimGunu;
	}
	public void setTeslimSaati(String teslimSaati) {
		this.teslimSaati = teslimSaati;
	}
	
	

}
