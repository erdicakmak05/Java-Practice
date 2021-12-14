package Replit_List;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		/*Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.

		Input :

		I love Java.

		Output:

		Reversed sentence : avaJ evol I. It is not a palindrome"*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("String değer giriniz.");
		String cumle = scan.nextLine();
		
		StringBuilder c = new StringBuilder(cumle);
		c.reverse();
		
		if(cumle.equals(c.toString())) {
			System.out.println("Polindrom");
		}else {
			System.out.println("Polindrom değil");
		}
	}

}
