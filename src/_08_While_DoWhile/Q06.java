package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {

		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
		//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz.");
		int bolunen = scan.nextInt();
		System.out.println("İkinci sayiyi giriniz.");
		int bolen = scan.nextInt();
		int sayac = 0;
		
		
		bol(bolunen, bolen , sayac);
		
		
	}

	private static void bol(int bolunen, int bolen, int sayac) {
		while (bolunen>0) {
			bolunen-=bolen;
			++sayac;
		}		
		
		System.out.println(sayac);		
	}

}
