package Replit_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Get a sentence from the user. Accept the sentence received from the user as a
		 * parameter, Invert sentence using Array and write a Method that returns the
		 * result as a String to the main method.
		 * 
		 * Note: Upper and lower case letters, spaces and special characters will not be
		 * changed.
		 * 
		 * Input :
		 * 
		 * It is very nice to write code.
		 * 
		 * Output :
		 * 
		 * .edoc etirw ot ecin yrev si tI
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Bir cümle giriniz.");
		String str = scan.nextLine();
		
		String strS[] = str.split("");
		List<String> list1 = new ArrayList<>(Arrays.asList(strS));
		
		Collections.reverse(list1);
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)); 
		}
		
		
		
		
	}

}
