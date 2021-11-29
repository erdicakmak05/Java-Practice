package _02_Scanner;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("3 Harfli bir isim giriniz.");
    	String isim = scan.next();
    	
    	int uzunluk = isim.length();
    	
    	char c1 = isim.charAt(0);
    	char c2 = isim.charAt(1);
    	char c3 = isim.charAt(2);
    	
    	
    	//Ternary
    	System.out.println("*****Ternary******");
    	String sonuc = isim.length()==3 ? (c1!=c2 && c1!=c3 && c2!=c3) ? "Harfler birbiri ile aynı değil":"" : "Girilen isim 3 harfli değil.Hata";
    	
    	System.out.println(sonuc);
    	System.out.println("******İf - Else******");
    	if (isim.length()==3) {
			if (c1!=c2 && c1!=c3 && c2!=c3 ) {
	    		System.out.println("Harfler birbiri ile aynı değil");
			}else {
				System.out.println("Girilen isim 3 harfli ama unique değil");
			}
		}else {
			System.out.println("Girilen isim 3 harfli değil.Hata");
		}
    	scan.close();
    }
}