package Haluk_Hoca_Odev_Variables_Scanner;

import java.util.Scanner;

public class Q_Scanner_03 {

	public static void main(String[] args) {

	    /*  Problem Tanýmý
        Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü hesaplayan kod yazýnýz.

        Örnek Ekran Çýktýsý
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Üçgenin ilk kenarýný giriniz");
		int a = scan.nextInt();
		System.out.println("Üçgenin ikinci kenarýný giriniz");
		int b = scan.nextInt();
		
		double c = (double) Math.sqrt(a*a+b*b);
		System.out.println("Üçüncü(Hipotenüs) kenarýn uzunluðu :" +c);

	}

}
