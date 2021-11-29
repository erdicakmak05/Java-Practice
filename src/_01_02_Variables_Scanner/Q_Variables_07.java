package _01_02_Variables_Scanner;

import java.util.Scanner;

public class Q_Variables_07 {

	public static void main(String[] args) {

		/*
		 * Problem Tan�m� Bir i��inin i�i bitirme s�resini ve toplam i��i say�s�n�
		 * alarak, i�in bitme s�resini hesaplayan kodu yaz�n�z. �rne�in, Bir i��i bir
		 * i�i 10 g�nde yapabilmektedir. Buna g�re 2 i��i ayn� i�i ka� g�nde yapar?
		 * 
		 * �rnek Ekran ��kt�s� Bir i��i i�i ka� g�nde bitirmektedir? 10 Toplam ka� i��i
		 * �al��acak? 2 ��in bitme s�resi 5 g�nd�r.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir i��inin i�i bitirme s�resi ka� g�nd�r.");
		int isBitirmeSuresi = scan.nextInt();
		System.out.println("Toplam i��i say�s�n� giriniz...");
		int isciSayisi = scan.nextInt();
		
		int isBitmeSuresi = isBitirmeSuresi/isciSayisi;
		
		System.out.println("�� bitirme s�resi : " + isBitmeSuresi);
	}

}
