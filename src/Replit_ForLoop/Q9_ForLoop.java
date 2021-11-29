package Replit_ForLoop;

import java.util.Scanner;

public class Q9_ForLoop {

	public static void main(String[] args) {

		/*
		 * Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız.
		 * (Mulakat Sorusu)
		 * 
		 * Input :1238
		 * 
		 * Output :Girilen Numananin Tersi: 8321
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi girini<");
		int sayi = scan.nextInt();

		String sayiStringDegeri = sayi + "";
		System.out.println(sayi);

		for (int i = sayiStringDegeri.length() - 1; i <= 0; i--) {
			System.out.println(sayiStringDegeri.substring(i, i + 1));
		}
		scan.close();
	}

}
