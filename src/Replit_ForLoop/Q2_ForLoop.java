package Replit_ForLoop;

import java.util.Scanner;

public class Q2_ForLoop {

	public static void main(String[] args) {

		/*
		 * Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
		 * 
		 * Input :
		 * 
		 * 30
		 * 
		 * 40
		 * 
		 * Beklenen Cikti: Beklenen Cikti: 30 ve 40 icin GCD = 10
		 * 
		 * 30 ve 40 icin LCM = 120
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz.");
		int sayi1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz.");
		int sayi2 = scan.nextInt();
		int carpim = 1;
		

		
		
		for (int i = 1; i <= sayi1; i++) {
			if(sayi1%i==0 && sayi2%i==0) {
				sayi1= sayi1/i;
				sayi2= sayi2/i;
				carpim=carpim*i;
			}
		}
		System.out.println("30 ve 40 icin GCD = "+carpim);
		
		System.out.println("30 ve 40 icin LCM = " + (sayi1*sayi2)*carpim);

	}

}
