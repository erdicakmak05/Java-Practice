package _02_Scanner;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bir String giriniz.");
    	String str1 = scan.nextLine();
    	
    	if(str1.contains(" ")) {
    		System.out.println("Değerde boşluk var");
    	}else {
    		System.out.println("Değerde boşluk yok");
    	}
    	scan.close();
        
    }
}

