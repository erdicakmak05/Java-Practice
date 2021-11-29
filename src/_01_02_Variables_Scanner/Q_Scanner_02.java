package _01_02_Variables_Scanner;

import java.util.Scanner;

public class Q_Scanner_02 {

	public static void main(String[] args) {

		 /*  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
		 *  
		 *   Ex :
		 *   input  : 12345
		 *   output : 12
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("5 BASAMAKLI B�R SAYI G�R�N�Z...");
		int sayi = scan.nextInt();
		//12345
		if (sayi < 99999 && sayi>9999) {
		
			int birler = sayi%10;
			int onlar = (sayi/10)%10;
			int binler = (sayi/1000)%10;
			int onbinler = (sayi/10000)%10;
					
			System.out.println("Girdi�iniz say�n�n ilk ve ikinci basama��n�n toplam� : " + (birler+onlar+binler+onbinler));
		}
		else  {
				System.out.println("Ge�ersiz say� girdiniz");

			}
		
		
		
		
	}

}
