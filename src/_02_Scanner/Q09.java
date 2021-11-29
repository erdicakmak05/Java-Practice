package _02_Scanner;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
      	Scanner scan = new Scanner (System.in);
    	System.out.println("Bir string giriniz : ");
    	String str = scan.nextLine();
    	
    	if (str.length()%2==0) {
			System.out.println("Girilen stringin ilk yarısı : " + str.substring(0, str.length()/2));
		}else {
			System.out.println("Girilen string tek uzunlukta");
		}
    	
    	scan.close();
       
    }
}
