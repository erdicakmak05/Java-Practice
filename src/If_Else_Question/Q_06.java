package If_Else_Question;

import java.util.Scanner;

public class Q_06 {

	public static void main(String[] args) {

		/*
		 * Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		 * Kullanicidan bir sifre girmesini isteyin Eger ilk harf buyuk harf ise �A�
		 * olup olmadigini kontrol edin. Ilk harf A ise �Gecerli Sifre� degilse
		 * �Gecersiz Sifre� yazdirin. Eger ilk harf kucuk harf ise �z� olup olmadigini
		 * kontrol edin. Ilk harf z ise �Gecerli Sifre� degilse �Gecersiz Sifre�
		 * yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("�ifrenizi giriniz...");
		String sifre = scan.next();

		if (sifre.charAt(0) >= 65 && sifre.charAt(0) <= 90) {
			if (sifre.charAt(0)=='A') {
				System.out.println("�ifre Ge�erli");
			}
			else {
				System.out.println("Ge�ersiz �ifre");
			}
		} 
		if (sifre.charAt(0) >= 97 && sifre.charAt(0) <= 122) {
			if (sifre.charAt(0)=='z') {
				System.out.println("�ifre Ge�erli");
			}
			else {
				System.out.println("Ge�ersiz �ifre");
			}
		}
		
	}

}
