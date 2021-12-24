package AbstractOrnek;

public class Main {

	public static void main(String[] args) {
		
		// Sekil sekil = new Sekil();  Abstract dan obje oluşturamayız
		Sekil sekil;
		sekil = new Kare("Kare2",6);
		Kare kare1 = new Kare("Kare", 5);
		Daire daire1 = new Daire("Daire", 3);
		
		kare1.alanHesapla();
		daire1.alanHesapla();
		
		sekil.alanHesapla();
		
		kare1.cevreHesapla();
		
		

	}

}
