package AbstractOrnek2;

public abstract class Sekil {
	
	private String isim;
	
	public Sekil(String isim) {
		super();
		this.isim = isim;
	}
	
	
	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public abstract void alanHesapla();
	public abstract void cevreHesapla();

}
