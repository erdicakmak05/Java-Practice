package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

        /*  Problem Tan�m�
            Kullan�c�dan �� adet say� alarak bu say�lar�n
            bir dik ��genin kenar uzunluklar� olup olmad���n� hesaplatan bir kod yaz�n�z
            (Yard�m: Bir ��genin dik oldu�unu anlamak i�in a2+b2=c2 pisagor
            ba�lant�s�ndan yararlanabilirsiniz)

            �rnek Ekran ��kt�s�
            birinci kenar� giriniz: 2
            ikinci kenar� giriniz 15
            ���nc� kenar� giriniz: 7
            Bu bir dik ��gen de�ildir.

            Bu bir dik ��gendir
         */
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("a kenar�n� giriniz");
    	int a = scan.nextInt();
      	System.out.println("b kenar�n� giriniz");
    	int b = scan.nextInt();
      	System.out.println("c kenar�n� giriniz");
    	int c = scan.nextInt();
    	
    	if (Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)) {
    		System.out.println("Bu bir dik ��gendir.");
    	} else {
    		System.out.println("Dik ��gen de�ildir...");
    	}
    	
       


    }
}
