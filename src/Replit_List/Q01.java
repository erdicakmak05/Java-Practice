package Replit_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

		input :

		Learning java is easy

		output:

		maximum occurring character is : a*/
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string değer girin");
		String str = scan.nextLine();
		str = str.replaceAll("[\\s]", "");
		
		List<String> list1 = new ArrayList<>(Arrays.asList(str.split("")));
		
		int enBuyukSayi=0;
		String enbuyukDeger="";
		
		for (int i = 0; i < list1.size(); i++) {
			
			if(Collections.frequency(list1, list1.get(i))>enBuyukSayi) {
				enBuyukSayi=Collections.frequency(list1, list1.get(i));
				enbuyukDeger=list1.get(i);
			}
		}
		System.out.println("en çok kullanılan harf : " + enbuyukDeger);
		System.out.println("kullanılmak sayisi : " + enBuyukSayi);

	}

}
