package A_Haluk_Hoca_While_DoWhile;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz
		
		// Örnek
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String değer giriniz.");
		String str = scan.next();
		int indeks = 0;
		
		do {
			if(indeks%2==1) {
				System.out.print(str.charAt(indeks));
			}
			indeks++;
		}while(indeks<str.length());
		
		
		scan.close();
	}

}
