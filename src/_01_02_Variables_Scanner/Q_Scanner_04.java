package _01_02_Variables_Scanner;

import java.util.Scanner;

public class Q_Scanner_04 {

	public static void main(String[] args) {

		/*
		 * Problem Tan�m� Mesafeyi ve h�z� al�p s�reyi hesaplayan bir kod yaz�n�z.
		 * �rne�in:�stanbul ile Ankara aras� 400km olarak �l��lmektedir. Bu yolu
		 * ortalama 120 km/saat h�zla giden bir ara� ne kadar s�rede hedefe var�r?
		 * 
		 * �rnek Ekran ��kt�s� Mesafeyi giriniz: 400 H�z� giriniz: 100 S�re 4 saattir.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Mesafeyi giriniz...");
		int mesafe = scan.nextInt();
		System.out.println("Ortalama h�z�n�z� giriniz...");
		int hiz = scan.nextInt();

		double sure = (double) mesafe / hiz;
		System.out.println("Tahmini var�� s�reniz " + sure + " saattir. \nAcele i�e �eytan kar���r yava� gidin...");

	}

}
