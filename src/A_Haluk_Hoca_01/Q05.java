package A_Haluk_Hoca_01;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ya��n�z� giriniz");
		int yas = scan.nextInt();
		System.out.println("Kilonuzu giriniz.");
		int kilo = scan.nextInt();
		
		if (yas>18 && kilo<50) {
			System.out.println("Kan ba��s� yapamazs�n�z");
		} else if (yas>18 && kilo>50) {
			System.out.println("Kan ba���� yapabilir");
		} else {
			System.out.println("Ge�ersiz i�lem yapt�n�z.");
		}
		

	}

}
