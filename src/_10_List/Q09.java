package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {

		/*
		 * Write a Java program to get a String from user as input and find the
		 * maximumCounts occurring character in that string. (Ignore case sensitivity)
		 * 
		 * Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri
		 * yazdiriniz input : Learning java is easy output: maximumCounts occurring
		 * character is : a
		 */

		String str = "Learning jaaaaaaaaaaaaaava is eassssssssy";
		int enBuyukSayi = 0;
		String enCokKullanilanKarakter = "";

		String arr[] = str.split("");

		List<String> list1 = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
		}

		for (int j = 0; j < list1.size(); j++) {
			if (Collections.frequency(list1, list1.get(j)) > enBuyukSayi) {
				enCokKullanilanKarakter = list1.get(j);
				enBuyukSayi = j;
			}
		}
		System.out.println(
				"En Çok kullanılan karakter --> " + enCokKullanilanKarakter + "\n" + enBuyukSayi + " kere kullanılmış.");

	}
}
