package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*
		 * Kullanici tarafindan girilen bir sayinin mutlak degerini yazdirmak icin bir
		 * program yazin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("�r�n adedini giriniz");
		int urun = scan.nextInt();
		
		System.out.println("Liste fiyat�n� giriniz");
		double fiyat =scan.nextDouble();
		
		System.out.println("M��teri kart� varsa E Yoksa H girin");
		char kart = scan.next().toUpperCase().charAt(0);
		
		int toplam = (int) (fiyat*urun);
		
		if (kart=='E' && urun>=10) {
			System.out.println("Borcunuz..:" +  (toplam*20/100));
		}else if (kart=='H' && urun>=10) {
			System.out.println("Borcunuz..:" +  (toplam*15/100));
		}else if(kart=='H' && urun<10){
			System.out.println("Borcunuz..:" +  (toplam*10/100) );
		}

		scan.close();
	}

}
