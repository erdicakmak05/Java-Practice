package A_Haluk_Hoca_While_DoWhile;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		// verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz.");
		int sayi = scan.nextInt();
		
		int toplam = 0;
		int geciciSayi= sayi;
		int geciciSayi2= sayi;
		int rakam;
		
		
		while (sayi>0) {
			rakam= sayi% 10;
			toplam+=Math.pow(rakam, 3);
			sayi = sayi/10;
		}
		System.out.println(toplam);
		
		if(toplam == geciciSayi2) {
			System.out.println(geciciSayi2 + " Amstrong sayısıdır.");
		}else {
			System.out.println(geciciSayi2 + " Amstrong sayısı değildir.");
		}
		
		
	}

}
