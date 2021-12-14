package Replit_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Write a program that deletes the letters 'a' from the names in the list given
		 * as input.
		 * 
		 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
		 * 
		 * OUTPUT :
		 * 
		 * [Veli,Omer]
		 */
		List <String> list1 = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
		Scanner scan = new Scanner(System.in);
		System.out.println("Char değer giriniz");
		String harf = scan.next().toUpperCase();
		
		for (int i = 0; i < list1.size(); i++) {
			if(list1.get(i).contains(harf) || list1.get(i).contains(harf.toLowerCase())) {
				list1.remove(i);
				i--;
			}
		}
		
		System.out.println(list1);

	}

}
