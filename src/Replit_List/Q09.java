package Replit_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan girdi olarak bir String almak için bir Java programı yazın ve o
		 * karakter dizisinde oluşan maksimum karakteri bulun.(Büyük/küçük harf
		 * duyarlılığını göz ardı edin).
		 * 
		 * Girdi: Java öğrenmek kolaydır
		 * 
		 * Çıktı: oluşan maksimum karakter: a
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string değer girin");
		String str = scan.nextLine();
		str = str.replaceAll("[\\s]", "");
		
		List<String> list1 = new ArrayList<>(Arrays.asList(str.split("")));
		
		Collections.sort(list1);
		
		System.out.println("Maksimum karakter"+list1.get(0));
		scan.close();
		
	}

}
