package A_Haluk_Hoca_While_DoWhile;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {

	/*  Problem Tanımı
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.
        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6
        Faktöriyeli: 720
        Bir sayı giriniz: 3
        Faktöriyeli 6
     */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Kaçın faktöriyelini bulacaksınız.");
		int sayi = scan.nextInt();
		int carpim = 1;
		
		while(sayi>0) {
			carpim*=sayi;
			sayi--;
		}
		System.out.println("Faktoriyel : " + carpim);
		
	}

}
