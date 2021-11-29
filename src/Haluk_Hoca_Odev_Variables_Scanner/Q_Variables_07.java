package Haluk_Hoca_Odev_Variables_Scanner;

import java.util.Scanner;

public class Q_Variables_07 {

	public static void main(String[] args) {

		/*
		 * Problem Tanýmý Bir iþçinin iþi bitirme süresini ve toplam iþçi sayýsýný
		 * alarak, iþin bitme süresini hesaplayan kodu yazýnýz. Örneðin, Bir iþçi bir
		 * iþi 10 günde yapabilmektedir. Buna göre 2 iþçi ayný iþi kaç günde yapar?
		 * 
		 * Örnek Ekran Çýktýsý Bir iþçi iþi kaç günde bitirmektedir? 10 Toplam kaç iþçi
		 * çalýþacak? 2 Ýþin bitme süresi 5 gündür.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir iþçinin iþi bitirme süresi kaç gündür.");
		int isBitirmeSuresi = scan.nextInt();
		System.out.println("Toplam iþçi sayýsýný giriniz...");
		int isciSayisi = scan.nextInt();
		
		int isBitmeSuresi = isBitirmeSuresi/isciSayisi;
		
		System.out.println("Ýþ bitirme süresi : " + isBitmeSuresi);
	}

}
