package A_Haluk_Hoca_While_DoWhile;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// //  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
		Scanner scan = new Scanner(System.in);
		System.out.println("Pin Kodunuzu giriniz.");
		int pinKodu = scan.nextInt();
		
		int dogruPin = 1453;
		
		while(pinKodu!=dogruPin) {
			System.out.println("***Hatalı Giriş Yapıldı.***");
			System.out.println("***Tekrar Deneyiniz.***");
			pinKodu = scan.nextInt();
		}
		System.out.println("Giriş başarılı");
		
		

	}

}
