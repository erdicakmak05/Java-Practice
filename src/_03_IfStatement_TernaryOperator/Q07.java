package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		 * hatali giris seklinde kod yazniz
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir karakter girin.");
		char a = scan.next().charAt(0);
		
		if ( a >= 'a' && a<= 'z') {
			System.out.println("K���k harf girdiniz.");
			
		} else if (a>='A' && a <= 'Z') {
			System.out.println("B�y�k harf girdiniz.");
		} else {
			System.out.println("Hatal� giri� yapt�n�z");
		}
	}

}
