package Haluk_Hoca_Odev_Variables_Scanner;

import java.util.Scanner;

public class Q_Scanner_06 {

	public static void main(String[] args) {

		/*
		 * Problem Tanýmý Kullanýcýdan a,b ve c sayýlarýný okuyarak aþaðýdaki iþlemi
		 * yapan kodu yazýnýz a'nýn karesinden b'nin karesini cikarip c nin 3 katina
		 * bolunuz nin karesi
		 * 
		 * Örnek Ekran Çýktýsý a sayýsýný giriniz: 5 b sayýsýný giriniz: 3 c sayýsýný
		 * giriniz: 1 sonuç : 5.333333333333333
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("ilk sayýyý giriniz...");
		int a = scan.nextInt();
		System.out.println("ikinci sayýyý giriniz...");
		int b = scan.nextInt();
		System.out.println("üçüncü sayýyý giriniz...");
		int c = scan.nextInt();

		double sonuc = (double) (Math.pow(a,2) - Math.pow(b,2)) / (c * 3);
		System.out.println("Sonuç : " + sonuc);
	}

}
