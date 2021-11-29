package A_Haluk_Hoca_While_DoWhile;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		 //Bir top belirli  yükseklikten atılmaktadır.
	    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
	    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
	    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Topu kaç metre yüksekten bırakacaksınız");
		double mesafe = scan.nextDouble();
		int toplam = 0;
		int sayac = 0;
		
		
		
		while(mesafe>=1) {
			toplam+=mesafe;
			mesafe*=(0.75);
			toplam+=mesafe;
			sayac++;
		}
		
		System.out.println("Zıplama sayısı =" + sayac);
		System.out.println("Toplam mesafe =" + (toplam+mesafe));
		scan.close();
	}

}
