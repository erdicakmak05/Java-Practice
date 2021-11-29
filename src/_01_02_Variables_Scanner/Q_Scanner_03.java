package _01_02_Variables_Scanner;

import java.util.Scanner;

public class Q_Scanner_03 {

	public static void main(String[] args) {

	    /*  Problem Tan�m�
        Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n� hesaplayan kod yaz�n�z.

        �rnek Ekran ��kt�s�
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��genin ilk kenar�n� giriniz");
		int a = scan.nextInt();
		System.out.println("��genin ikinci kenar�n� giriniz");
		int b = scan.nextInt();
		
		double c = (double) Math.sqrt(a*a+b*b);
		System.out.println("���nc�(Hipoten�s) kenar�n uzunlu�u :" +c);

	}

}
