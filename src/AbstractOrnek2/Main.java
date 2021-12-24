package AbstractOrnek2;

public class Main {

	public static void main(String[] args) {
		Kare kare1 = new Kare("Kare1", 5);
		
		Ucgen ucgen1 = new Ucgen("Üçgen1",3, 4, 5);
		
		kare1.alanHesapla();
		kare1.cevreHesapla();
		
		ucgen1.alanHesapla();
		ucgen1.cevreHesapla();

	}

}
