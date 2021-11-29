package Replit_ForLoop;

public class Q10_ForLoop {

	public static void main(String[] args) {

		//1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
		
		int sayi = 100;
		int toplam = 0;
		
		for (int i = 1; i <= sayi; i++) {
			toplam+=i;
			
		}
		System.out.println("Sayilarin Toplami : "+toplam);
	}

}
