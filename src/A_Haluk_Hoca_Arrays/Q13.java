package A_Haluk_Hoca_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
    	// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Kaç eleman girişi yapacaksınız");
		int elemanSayisi = scan.nextInt();
		
		int arr[] = new int [elemanSayisi];
		
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.println( (i+1) +"inci elemanı giriniz.");
			arr[i]= scan.nextInt();
		}
		
		System.out.println("Girdiğiniz elamanlar" + Arrays.toString(arr));
		
		int sayac = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%3 ==0) {
				sayac++;
			}
		}
		
		System.out.println("3 e böünebilen " + sayac + " tane sayınız vardır.");
		
		

	}

}
