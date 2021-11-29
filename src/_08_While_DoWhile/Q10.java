package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("5 Sayı giriniz. En büyüğünü bulacağım");
		
		int enBuyuk = 0 ;
		int sayac = 0 ;
		
		
		
		while (sayac<5) {
			System.out.println("Sayı giriniz.");
			int sayi1 = scan.nextInt();
			sayac++;
			if (sayi1>enBuyuk) {
				enBuyuk=sayi1;
			}
		}
		System.out.println("En büyük sayi :" + enBuyuk);
	}

}
