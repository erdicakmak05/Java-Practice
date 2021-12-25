package P07_galeriOtomasyon;

public abstract class Araba {
	
	
	public abstract void move();
	
	public static void benzin() {
		System.out.println("Araçınız benzinlidir.");
	}
	
	public static void diesel() {
		System.out.println("Aracınız dizeldir.");
	}
}
