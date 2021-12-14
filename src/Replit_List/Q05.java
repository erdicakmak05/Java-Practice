package Replit_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * Write a program that accepts an integer as input and prints first 10 prime
		 * numbers greater than input Check numbers if they are even or not in a return
		 * method.
		 * 
		 * Input : 5
		 * 
		 * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen sayı gırınız");
		int sayı = scan.nextInt();
		List<Integer> liste = new ArrayList<>();
		int sayaç = 0;// 10 adet sayı sınırlaması ıcın kullanılır
		int count = 0;// asal oldugunu gosterır.bölen sayısını verır.
		while (sayaç < 10) {
			sayı++;// verılen sayımızın artması ıcın
			count = 0;
			for (int i = 2; i < sayı; i++) {
				if (sayı % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {// 0 olmalı kı asal olsun
				liste.add(sayı);
				sayaç++;
			}

		}
		System.out.println(liste);
	}

}
