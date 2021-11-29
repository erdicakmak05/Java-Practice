package _02_Scanner;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("E-mail adresinizi giriniz.");
    	String email = scan.next();
    	
    	int flag = 0;
    	
    	if (!email.contains("@")) {
    		System.out.println("Geçerli bir email giriniz.(@ içermiyor)");
    	}
    	if (email.endsWith("gmail.com")) {
    		System.out.println("Email adresiniz onaylandı.");
    	}else {
    		System.out.println("Lütfen gmail hesabınızı giriniz.(gmail.com ile bitmiyor)");
    	}
    }

}
