package P07_galeriOtomasyon;

public class Main {

	public static void main(String[] args) {
		
		Araba luxHonda1 = new LuxHonda("Honda", "CRV", 2021, "Siyah");
		
		luxHonda1.move();
		
		Araba siradanHonda = new BasicHonda("Sıradan Honda", "CıVık", 2001, "Yeşil");
		
		siradanHonda.move();
		
		siradanHonda.benzin();

	}

}
