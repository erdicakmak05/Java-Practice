package P06_hastaneOtomasyon;

public class Hasta {

	private String isim;
	private String soyIsim;
	private int hastaID;
	private Durum hastaDurumu;
	
	
	public String getIsim() {
		return isim;
	}
	public String getSoyIsim() {
		return soyIsim;
	}
	public int getHastaID() {
		return hastaID;
	}
	public Durum getHastaDurumu() {
		return hastaDurumu;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	public void setHastaID(int hastaID) {
		this.hastaID = hastaID;
	}
	public void setHastaDurumu(Durum hastaDurumu) {
		this.hastaDurumu = hastaDurumu;
	}
	
	

}
