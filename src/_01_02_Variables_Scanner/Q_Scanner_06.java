package _01_02_Variables_Scanner;

import java.util.Scanner;

public class Q_Scanner_06 {

	public static void main(String[] args) {

		/*
		 * Problem Tan�m� Kullan�c�dan a,b ve c say�lar�n� okuyarak a�a��daki i�lemi
		 * yapan kodu yaz�n�z a'n�n karesinden b'nin karesini cikarip c nin 3 katina
		 * bolunuz nin karesi
		 * 
		 * �rnek Ekran ��kt�s� a say�s�n� giriniz: 5 b say�s�n� giriniz: 3 c say�s�n�
		 * giriniz: 1 sonu� : 5.333333333333333
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("ilk say�y� giriniz...");
		int a = scan.nextInt();
		System.out.println("ikinci say�y� giriniz...");
		int b = scan.nextInt();
		System.out.println("���nc� say�y� giriniz...");
		int c = scan.nextInt();

		double sonuc = (double) (Math.pow(a,2) - Math.pow(b,2)) / (c * 3);
		System.out.println("Sonu� : " + sonuc);
	}

}
