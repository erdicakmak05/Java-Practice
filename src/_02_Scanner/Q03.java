package _02_Scanner;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("3 Kelimeli İsim giriniz");
    	String adSoyad = scan.nextLine();
    	String yazi = "51616156";
    	
		char a = adSoyad.toUpperCase().charAt(0);
		char b = adSoyad.charAt(adSoyad.indexOf(" "+1));
		char c = adSoyad.charAt(adSoyad.lastIndexOf(" "+1));
    	
    	System.out.println(a+"."+b+"."+c);
    	
    	System.out.println(yazi.substring(1) + yazi.charAt(0));
    	
    	
    	scan.close();
    }       
}
