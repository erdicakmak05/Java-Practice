package P01_kitapYonetimi;

public class Kitap {
	// Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat
	private int kitapID;
	private String kitapAdi;
	private int yayinYili;
	private double fiyat;

	
	public Kitap() {
		
	}
	
	@Override
	public String toString() {
		return "kitapID=" + kitapID + ", kitapAdi=" + kitapAdi + ", yayinYili=" + yayinYili + ", fiyat=" + fiyat
				+ "\n";
	}

	public Kitap(int kitapID,String kitapAdi, int yayinYili, double fiyat) {
		this.kitapID = kitapID;
		this.kitapAdi = kitapAdi;
		this.yayinYili = yayinYili;
		this.fiyat = fiyat;
	}
	
	
	
	public int getKitapID() {
		return kitapID;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public int getYayinYili() {
		return yayinYili;
	}
	public double getFiyat() {
		return fiyat;
	}
	
	public void setKitapID(int kitapID) {
		this.kitapID = kitapID;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

}
