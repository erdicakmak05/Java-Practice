package _07_ForLoop;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir harf girmesini isteyiniz.++ Girilen harf sesli ise Sesli
		 * harf olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın.++ Girdiği değer
		 * harf değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test
		 * girilen harfi büyük yada küçüklüğüne duyarlıdır.)
		 * 
		 * Sesli harfler: a,e,i,o,u
		 * 
		 * Test Data: a
		 * 
		 * Beklenen Çıktı: a harfi sesli harfdir.
		 * 
		 * Test Data: d
		 * 
		 * Beklenen Çıktı: d harfi sesiz harftir.
		 * 
		 * Test Data: we yada %
		 * 
		 * Beklenen Çıktı: Yanlis karakter girdiniz!
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir harf giriniz : ");
		String harf = scan.next().toLowerCase();
		
		
		boolean sesliHarfMi = false ;
		boolean sessizHarfmi = false ;
		String sesliHarf = "aeiou";
		String sessizHarf = "qwrtypsdfghjklzxcvbnm";
		sesliHarfMi = sesliHarfKontrol1(harf,sesliHarf,sessizHarf, sessizHarf,sesliHarfMi);
		sessizHarfmi = sesliHarfKontrol(harf,sesliHarf,sessizHarf, sessizHarf,sessizHarfmi);
		
		
		if(harf.length()>1) {
			System.out.println("Yanlış karakter girdiniz.");
		} else if (sesliHarfMi) {
			System.out.println("Girdiğiniz karakter sesli harftir.");
		} else if (sessizHarfmi) {
			System.out.println("Girdiğiniz karakter sessiz harftir.");
		} else {
			System.out.println("Yanlış karakter girdiniz!");
		}
		
		scan.close();
	
	}

	public static boolean sesliHarfKontrol1(String harf, String sesliHarf , String sezsizHarf, String sessizHarf, boolean sesliHarfMi ) {
		
		for (int i = 0; i < sesliHarf.length(); i++) {
			if (harf.charAt(0)==sesliHarf.charAt(i)) {
				sesliHarfMi=true;
				continue;
			}
	}
		
		return sesliHarfMi;
	
	}
	public static boolean sesliHarfKontrol(String harf, String sesliHarf , String sezsizHarf, String sessizHarf, boolean sessizHarfmi ) {
		

		for (int i1 = 0; i1 < sezsizHarf.length(); i1++) {
			if (harf.charAt(0)==sessizHarf.charAt(i1)) {
				sessizHarfmi=true;
				continue;
			}
		}
		return sessizHarfmi;
	
	}
	
}
