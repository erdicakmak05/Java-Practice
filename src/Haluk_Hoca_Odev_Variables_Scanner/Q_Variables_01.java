package Haluk_Hoca_Odev_Variables_Scanner;

public class Q_Variables_01 {

	public static void main(String[] args) {

		/*
		 * Primitive data type boolean, char, byte, short, integer,long, double, float
		 * 
		 */

		// byte, short, integer,long, double, float veri tiplerinin max ve min
		// degerlerini yazdiriniz.

		byte sayi1 = 10;
		System.out.println("Byte Mininmum De�eri : " + Byte.MIN_VALUE + " Maximum De�eri : " + Byte.MAX_VALUE);
		System.out.println("Short Mininmum De�eri : " + Short.MIN_VALUE + " Maximum De�eri : " + Short.MAX_VALUE);
		System.out
				.println("Interger Mininmum De�eri : " + Integer.MIN_VALUE + " Maximum De�eri : " + Integer.MAX_VALUE);
		System.out.println("Long Mininmum De�eri : " + Long.MIN_VALUE + " Maximum De�eri : " + Long.MAX_VALUE);
		System.out.println("Double Mininmum De�eri : " + Double.MIN_VALUE + " Maximum De�eri : " + Double.MAX_VALUE);
		System.out.println("Float Mininmum De�eri : " + Float.MIN_VALUE + " Maximum De�eri : " + Float.MAX_VALUE);

		System.out.println(
				"-------------------------------------------Soru-2----------------------------------------------------");

		// verilen 12345 say�s�n�n rakamlar�n� yukar�dan a�a��ya do�ru yazd�r�n�z
		// ex: input:
//			    output: 1
//			            2
//			            3
//			            4
//			            5

		int sayi = 12345;
		int birlerBasamagi = sayi % 10;
		System.out.println(birlerBasamagi);

		int onlar = (sayi / 10) % 10;
		System.out.println(onlar);

		int yuzler = (sayi / 100) % 10;
		System.out.println(yuzler);
		
		int binler = (sayi / 1000) % 10;
		System.out.println(binler);

		int onbinler = (sayi / 10000) % 10;
		System.out.println(onbinler);

	}

}
