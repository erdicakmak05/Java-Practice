package A_Haluk_Hoca_02;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bir email hesabı giriniz.");
    	String email = scan.next();
    	
    	if (email.contains("hotmail")) {
    		System.out.println(email.replace("hotmail.com", "gmail.com"));
    		email = email.replace("hotmail.com", "gmail.com");
    		System.out.println("Yeni mail adresininiz -> " + email);
    	} else {
    		System.out.println("Sorun yok ");
    	}
    	scan.close();
       
    }
}
