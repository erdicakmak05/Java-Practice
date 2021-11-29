package Haluk_Hoca_Odev_Variables_Scanner;

import java.util.Scanner;

public class Q_Scanner_05 {

	public static void main(String[] args) {

    	/*
    	 * Kullanicidan alacaginiz vize1 vize2 ve final notlarini 
    	 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
    	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vize 1 notunuzu giriniz...");
		int vize1 = scan.nextInt();
		System.out.println("Vize 2 notunuzu giriniz...");
		int vize2 = scan.nextInt();
		System.out.println("Final notunuzu giriniz...");
		int finalNotu = scan.nextInt();
		
		int vizeOrtalamasi = (vize1+vize2)/2;
		
		int gecmeNotu = (vizeOrtalamasi*3/10)+(finalNotu*7/10);
		System.out.println("Sýnav ortalamanýz "+ gecmeNotu +" dir.");
		
	}

}
