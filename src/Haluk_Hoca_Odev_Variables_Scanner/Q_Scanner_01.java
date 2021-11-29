package Haluk_Hoca_Odev_Variables_Scanner;

import java.util.Scanner;

public class Q_Scanner_01 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan uc basamakli bir sayi alin 
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
		 * 
		 * 
		 * Ornek : Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi :  5 
		 *          Girdiginiz sayinin yuzler basamagi : 8
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Üç basamaklý bir sayý giriniz...");
		
		int sayi = scan.nextInt();
		
		//sayinin birler basamaðýný bulalým  123
		
		int birler = sayi%10;
		int onlar = (sayi/10)%10;
		int yuzler = (sayi/100)%10;
		
		System.out.println(birler);
		System.out.println(onlar);
		System.out.println(yuzler);
		

		
		
	}

}
