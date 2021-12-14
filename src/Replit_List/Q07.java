package Replit_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * write a Java program to removes a specific element from an array and put the
		 * remaining elements in a new array and prints the new array
		 * 
		 * Input :{1,2,3,4,5,6}
		 * 
		 * element:6
		 * 
		 * Output : [1,2,3,4,5]
		 */

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 4, 5, 6));

		Scanner scan = new Scanner(System.in);

		System.out.println(list1 + "\nListen çıkartmak istediğiniz sayıyı giriniz.");

		int sayi = scan.nextInt();


		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) == sayi) {
				list1.remove(i);
				i--;
			}
		}
		System.out.println(list1);

	}

}
