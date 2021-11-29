package Replit_ForLoop;

import java.util.Scanner;

public class Q1_ForLoop {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz.");
		String isim = scan.nextLine();
		System.out.println("Bir karakter girin.");
		char krk = scan.next().charAt(0);
		
		int sayac = 0;
		
		//MehmetM
		
		for (int i = 0; i < isim.length(); i++) {
			if(isim.charAt(i)==krk) {
				sayac++;
			}
		}
		
		System.out.println("Number of a = "+sayac);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersten yazdırmak için bir yazı giriniz...:");
		String str = scan.nextLine();
		System.out.println("Bir karakter giriniz...:");
		char ch1 = scan.next().charAt(0);
		str = str.toLowerCase();
		int sayac = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==ch1) {
				sayac++;
			}
		}
		System.out.println("Number of a = " + sayac);	*/
	}

}
