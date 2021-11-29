package Replit_ForLoop;

import java.util.Scanner;

public class Q4_ForLoop {

	public static void main(String[] args) {

		/*Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

		Input : 6

		Output: 6!=65432*1=720*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz.");
		int sayi = scan.nextInt();
		int carpimSonucu = 1;
		
		System.out.print(sayi+"!=");
		for (int i = sayi; i >= 1; i--) {
			carpimSonucu=i*carpimSonucu;
			System.out.print(i);

		}
		System.out.println("="+carpimSonucu);
		
	}

}
