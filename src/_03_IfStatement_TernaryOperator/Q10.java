package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {

		/*
		 * Problem tanimi : Kulan�c�dan arac�n�n h�z�n� al�n�z Trafik cezas�n�n de�erini
		 * hesaplay�n. 45 h�z s�n�r�d�r. 
		 * 
		 * E�er h�z�n�z 55-74 aras�nda ise: Ceza 100 $'d�r.
		 * 
		 * E�er h�z�n�z 75 - 84 aras�nda ise: Ceza 150 $'d�r.
		 * 
		 * E�er h�z�n�z 85 -94 aras�nda ise: Ceza 320 $'d�r.
		 * 
		 * E�er h�z�n�z 94'den daha fazla ise: Ceza 500 $'d�r.
		 * 
		 * ve ayr�ca, E�er s�r�c�n�n ehliyeti yoksa cezaya 200 $ eklenir.
		 * 
		 * �rn: H�z�n�z 77 iken cezan�z 150$'d�r ama ehliyetiniz yoksa ceza 350 $ olur.
		 * 
		 * -----------------------------------------
		 * 
		 * �rn;
		 * 
		 * currentSpeed(H�z�n�z) 87 ve isDriverLicenceAvailable(Ehliyeti var m�?) =
		 * true;
		 * 
		 * sonu� 320 olmal�d�r.
		 * 
		 * currentSpeed(H�z�n�z) 65 ve isDriverLicenceAvailable(Ehliyeti var m�?) =
		 * false;
		 * 
		 * sonu� 300 olmal�d�r.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("H�z�n�z� giriniz...");
		int hiz = scan.nextInt();
		System.out.println("Ehliyetiniz var m� ?\n1-)var\n2-)yok");
		char ehliyet = scan.next().toLowerCase().charAt(0);
		
		
		if (ehliyet=='v') {
			if (hiz<45) {
				System.out.println("H�z s�n�r�n� a�mad�n�z.");
			} else if (hiz>=45 && hiz<=74) {
				System.out.println("Ceza 100 $'d�r.");
			} else if (hiz>=75 && hiz<=84) {
				System.out.println("Ceza 150 $'d�r.");
			}else if (hiz>=85 && hiz<=94) {
				System.out.println("Ceza 320 $'d�r.");
			} else if (hiz>=95) {
				System.out.println("Ceza 500 $'d�r.");
			}
		} else if (ehliyet=='y') {
			if (hiz<45) {
				System.out.println("Ehiyetiniz yok, Cezan�z 200 $");
			} else if (hiz>=45 && hiz<=74) {
				System.out.println("Ceza 300 $'d�r.");
			} else if (hiz>=75 && hiz<=84) {
				System.out.println("Ceza 350 $'d�r.");
			}else if (hiz>=85 && hiz<=94) {
				System.out.println("Ceza 520 $'d�r.");
			} else if (hiz>=95) {
				System.out.println("Ceza 700 $'d�r.");
			}
		}
		
	}
}
