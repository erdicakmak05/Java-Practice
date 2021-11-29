package Replit_IfElse_Switch;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		/*
		 * Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * 
		 * Input :
		 * 
		 * John White
		 * 
		 * 1234234534561478
		 * 
		 * Output : Name :
		 * 
		 * J* W**
		 * 
		 * CCN : ** ** **** 1478
		 * 
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Adinizi soyadinizi giriniz.");
		String adSoyad = scan.nextLine();
		
		System.out.println("Kredi karti numaranizi giriniz.");
		String kKartiNo = scan.next();
		
		String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
		
		String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1); 
		
		ad = ad.toUpperCase().substring(0,1)+ad.substring(1, ad.length()).replaceAll("\\w", "*");
		
		soyad = soyad.toUpperCase().substring(0,1)+soyad.substring(1, soyad.length()).replaceAll("\\w", "*");
		
		kKartiNo = kKartiNo.replaceAll("[\\d]", "*").substring(0, 12) + kKartiNo.substring(12, 16);
		
		System.out.println("Name : " + ad + " " + soyad);
		
		System.out.println("CCN : " + kKartiNo);
		
		
	}

}
