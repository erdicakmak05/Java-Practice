package Haluk_Hoca_Odev_Variables_Scanner;

import java.util.Scanner;

public class Q_Scanner_04 {

	public static void main(String[] args) {

		/*
		 * Problem Tanýmý Mesafeyi ve hýzý alýp süreyi hesaplayan bir kod yazýnýz.
		 * Örneðin:Ýstanbul ile Ankara arasý 400km olarak ölçülmektedir. Bu yolu
		 * ortalama 120 km/saat hýzla giden bir araç ne kadar sürede hedefe varýr?
		 * 
		 * Örnek Ekran Çýktýsý Mesafeyi giriniz: 400 Hýzý giriniz: 100 Süre 4 saattir.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Mesafeyi giriniz...");
		int mesafe = scan.nextInt();
		System.out.println("Ortalama hýzýnýzý giriniz...");
		int hiz = scan.nextInt();

		double sure = (double) mesafe / hiz;
		System.out.println("Tahmini varýþ süreniz " + sure + " saattir. \nAcele iþe þeytan karýþýr yavaþ gidin...");

	}

}
