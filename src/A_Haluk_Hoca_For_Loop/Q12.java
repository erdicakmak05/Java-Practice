package A_Haluk_Hoca_For_Loop;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin ve 1'den girilen tam
		 * sayıya kadar olan sayıların karelerinin toplamını hesaplayan kodu yazınız.
		 * 
		 * Örnek Ekran Çıktısı
		 * 
		 * Girilen sayı=4
		 * 
		 * Kareler toplamı=30
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz.");
		int sayi = scan.nextInt();

		int toplamSonucu = 0;

		if (sayi < 0) {
			System.out.println("Hatalı İşlem");
		} else {
			for (int i = 1; i <= sayi; i++) {

				toplamSonucu += (i * i);
			}
			System.out.println("Girilen Sayi= " + sayi);
			System.out.println("Kareler toplamı= " + toplamSonucu);
		}
		scan.close();
	}

}
