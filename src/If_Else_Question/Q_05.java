package If_Else_Question;

import java.util.Scanner;

public class Q_05 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
		 * isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak
		 * yazdirin, gun ismi gecerli degilse �Gecerli gun ismi giriniz� yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("G�n ismi giriniz...");
		
		String gun = scan.next().toLowerCase();
		
		if (gun.equals("pazartesi") || gun.equals("sal�") ||gun.equals("�ar�amba") ||gun.equals("per�embe") ||
				gun.equals("cuma") ||gun.equals("cumartesi") ||gun.equals("pazar") ) {
			if (gun.equals("pazartesi")) {
				System.out.println(gun.toUpperCase().charAt(0)+""+(gun.charAt(1))+""+(gun.charAt(2)));
			}
			if (gun.equals("sal�")) {
				System.out.println(gun.toUpperCase().charAt(0)+""+(gun.charAt(1))+""+(gun.charAt(2)));
			}
			if (gun.equals("�ar�amba")) {
				System.out.println(gun.toUpperCase().charAt(0)+""+(gun.charAt(1))+""+(gun.charAt(2)));
			}
			if (gun.equals("per�embe")) {
				System.out.println(gun.toUpperCase().charAt(0)+""+(gun.charAt(1))+""+(gun.charAt(2)));
			}
			if (gun.equals("cuma")) {
				System.out.println(gun.toUpperCase().charAt(0)+""+(gun.charAt(1))+""+(gun.charAt(2)));
			}
			if (gun.equals("cumartes")) {
				System.out.println(gun.toUpperCase().charAt(0)+""+(gun.charAt(1))+""+(gun.charAt(2)));
			}
			if (gun.equals("pazar")) {
				System.out.println(gun.toUpperCase().charAt(0)+""+(gun.charAt(1))+""+(gun.charAt(2)));
			}
		} else {
			System.out.println("L�tfen ge�erli bir g�n ismi giriniz...");
		}
	}

}
