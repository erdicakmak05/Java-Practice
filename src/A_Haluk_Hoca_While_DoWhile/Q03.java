package A_Haluk_Hoca_While_DoWhile;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi alaliniz.
        //	1. sayi taban
        //	2. sayi Ust
        //	1 sayinin ussunu hesaplatan code create edinim.
        // 	3, 3  sonuc = 27

        //2  3 = 2*2*2=8
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz.");
		int taban = scan.nextInt();
		System.out.println("İkinci sayiyi giriniz.");
		int ust = scan.nextInt();
		
		System.out.println(taban+" sayısının "+ ust +" ü  = " +(int) Math.pow(taban, ust));
		
		scan.close();


	}

}
