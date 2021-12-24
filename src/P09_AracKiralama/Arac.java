package P09_AracKiralama;

public class Arac {
	
	private int aracNo;
	
	private String marka;
	private String model;
	private String yakitTipi;
	private String vites;
	private double gunlukUcret;
	


	@Override
	public String toString() {
		return "Arac [aracNo=" + aracNo + ", marka=" + marka + ", model=" + model + ", yakitTipi=" + yakitTipi
				+ ", vites=" + vites + ", gunlukUcret=" + gunlukUcret + "]" + "\n";
	}

	public Arac(int aracNo, String marka, String model, String yakitTipi, String vites, double gunlukUcret) {
		super();
		this.aracNo = aracNo;
		this.marka = marka;
		this.model = model;
		this.yakitTipi = yakitTipi;
		this.vites = vites;
		this.gunlukUcret = gunlukUcret;
	}
	
	public Arac() {
		
	}
	
	public int getAracNo() {
		return aracNo;
	}
	public String getMarka() {
		return marka;
	}
	public String getModel() {
		return model;
	}
	public String getYakitTipi() {
		return yakitTipi;
	}
	public String getVites() {
		return vites;
	}
	public double getGunlukUcret() {
		return gunlukUcret;
	}
	public void setAracNo(int aracNo) {
		this.aracNo = aracNo;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYakitTipi(String yakitTipi) {
		this.yakitTipi = yakitTipi;
	}
	public void setVites(String vites) {
		this.vites = vites;
	}
	public void setGunlukUcret(double gunlukUcret) {
		this.gunlukUcret = gunlukUcret;
	}
    
    

}
