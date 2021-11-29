package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullac�dan ald���n�z koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

       Scanner scan = new Scanner(System.in);
       System.out.println("Koordinat giriniz...");
       double koordinat = scan.nextDouble();
       
       if (koordinat>400 && koordinat<500) {
    	   System.out.println("Marmara B�lgesindesiniz.");
       } else if ( koordinat >500 && koordinat <600) {
    	   System.out.println("Ege b�lgesindesiniz.");
       } else {
    	   System.out.println("Marmara ve Ege b�lgesinde de�ilsinzi.");
       }
    }
}
