package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {

		/*
		 * Problem Tan�m� Kullan�c�dan bir tarihi g�n, ay ve y�l �eklinde al�p bu tarihi
		 * ay, g�n, y�l ve y�l, ay, g�n s�ralar�na �evirerek yazan bir kod yaz�n�z.
		 * TRICK: her else komutundan sonra return; komutu kullan�n�z...
		 * 
		 * �rnek Ekran ��kt�s� L�tfen g�n� giriniz: 10 L�tfen ay� giriniz: 02 L�tfen
		 * y�l� giriniz: 2009 G�n ay y�l: 10.02.2009 Ay g�n y�l: 02.10.2009 Y�l ay g�n:
		 * 2009.02.10
		 */
		// Mantigi anlamadim 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen G�n� giriniz.");
		int gun = scan.nextInt();
		System.out.println("Ay� giriniz.");
		int ay = scan.nextInt();
		System.out.println("Y�l� giriniz");
		int yil = scan.nextInt();
		
		String tarih = ""+gun+"."+ay+"."+yil;
		
		System.out.println(tarih);
		
		
		

	}
}
