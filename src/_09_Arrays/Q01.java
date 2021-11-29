package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	// java programi yazin
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç elemanlı bir arry tutacaksınız ?");
		int elemanSayisi = scan.nextInt();
		
		int arr[] = new int[elemanSayisi];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemani ekleyin");
			arr[i]= scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int fark = arr[elemanSayisi-1]-arr[0];
		
		System.out.println("En büyük değer ile en küçük değer arasındaki fark = " + fark);
		
		scan.close();

	}

}
