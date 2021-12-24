package AbstractOrnek2;

public class Kare extends Sekil {
	
	private int kenar;
	
	public Kare(String isim,int kenar) {
		super(isim);
		this.kenar=kenar;
	}

	@Override
	public void alanHesapla() {
		System.out.println(getIsim()+ " nin alanı :" + (kenar*kenar));
		
	}

	@Override
	public void cevreHesapla() {
		System.out.println(getIsim()+ " nin çevresi :" + kenar*4 );
		
	}
	

}
