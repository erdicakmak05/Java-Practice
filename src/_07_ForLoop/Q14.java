package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {

		/*
	  	Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz.");
		int sayi = scan.nextInt();
		String bosluk = " ";
		
		
		for (int i = 1; i <= sayi; i++) {
			
			for (int j = sayi-i; j>=0 ; j--) {
				
				System.out.print(" ");				
				

			}
			System.out.println();
		}
		 
	}

}
