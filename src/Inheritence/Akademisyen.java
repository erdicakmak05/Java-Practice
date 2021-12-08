package Inheritence;

public abstract class Akademisyen extends Calisan{
	
	String bolum,gorevler;
	String ders;
	
	public Akademisyen(String adSoyad, String eposta, String telefon,String bolum, String gorevler, String ders) {
		super(adSoyad,eposta,telefon);
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.ders = ders;
	}
	
	public abstract void derseGir(int dersSaati);
	
	public String giris() {
		return super.giris()+" A kapısından.";
	}

	public String getBolum() {
		return bolum;
	}

	public String getGorevler() {
		return gorevler;
	}

	public String getDers() {
		return ders;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

	public void derseGir() {
		System.out.println("Derse girildi.");
	}
}
