package A_Haluk_Hoca_02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
    	
    	Scanner scan = new Scanner ( System.in);
    	System.out.println("4 Harfli bir kelime giriniz.");
    	String kelime = scan.next();
    	
    	if (kelime.length()==4) {
    		String sonuc = kelime.substring(3)+kelime.substring(2, 3)+ kelime.substring(1, 2)+ kelime.substring(0, 1);
    		System.out.println(sonuc);
    		
    		
    	}else {
    		System.out.println("Hata 4 harfli girin");
    	}

       
    }
}
