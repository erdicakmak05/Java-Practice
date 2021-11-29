package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Değer Girin, Çıkmak için 'x' e basın. ");
		String str = scan.next();
		
		while(!str.equals("x")) {
			System.out.println("Program Çalışıyor");
			str = scan.next();
			
			if (str.equals("x")) {
				break;
			}
			
		}
	}

}
