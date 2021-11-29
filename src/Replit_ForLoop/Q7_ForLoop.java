package Replit_ForLoop;

import java.util.Scanner;

public class Q7_ForLoop {

	public static void main(String[] args) {
		/*
		 * Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		 * 
		 * Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi
		 * bir sayı Mükemmel Sayı olarak bilinir. Input :
		 * 
		 * 6
		 * 
		 * Output:
		 * 
		 * 6 Mukemmel Sayidir.
		 * 
		 * ======================
		 * 
		 * Input
		 * 
		 * 7
		 * 
		 * Output:
		 * 
		 * 7 Mukemmel Sayidir degildir.
		 */
		Scanner scan = new Scanner(System.in);
		
		int sayi = scan.nextInt();

		int yedekSayi= sayi ;
		int toplamaSayaci = 0;

		for (int i = 1; i <= sayi; i++) {

			if (yedekSayi % i == 0) {
				toplamaSayaci += i;
				yedekSayi = yedekSayi / i;
				System.out.println(yedekSayi);
			}
		
		}
		if (sayi == toplamaSayaci) {
			System.out.println(sayi + " Mukemmel Sayidir.");
			System.out.println("Bölenler toplami " + toplamaSayaci);

		} else {
			System.out.println(sayi + " Mukemmel Sayi degildir.");

		}
		scan.close();

	}

}
