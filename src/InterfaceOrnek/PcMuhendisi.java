package InterfaceOrnek;

import java.util.Arrays;

public class PcMuhendisi implements IMuhendis {

	boolean askerlikDurumu;
	boolean adliSicil;
	
	

	public PcMuhendisi(boolean askerlikDurumu, boolean adliSicil) {
		super();
		this.askerlikDurumu = askerlikDurumu;
		this.adliSicil = adliSicil;
	}

	@Override
	public void askerlikDurumu() {
		if(askerlikDurumu=true) {
			System.out.println("Askerliğimi yaptım");
		}else {
			System.out.println("Askerliğimi henüz yapmadım");
		}
		
	}

	@Override
	public String mezuniyetOrtalamasi(double derece) {
		double ortalama = derece;
		return "Ortalamam : "+ortalama;
	}

	@Override
	public void adliSicilDurumu() {
		if(adliSicil) {
			System.out.println("Adli sicil kaydım var");
		}else {
			System.out.println("Adli sicil kaydım yok");
		}
		
	}

	@Override
	public void isTecrubesi(String[] arr) {
		System.out.println("----İş tecrübelerim----");
		System.out.println(Arrays.toString(arr));
	}

}
