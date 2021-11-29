package _02_Scanner;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
       
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Adınızı ve soyadınızı giriniz.");
    	String adSoyad = scan.nextLine();
    	System.out.println("Kredi kartı numaranızı boşuk bırakmadan giriniz.");
    	String kKartiNo = scan.next();
    	
    	String ad = adSoyad.substring(0,adSoyad.indexOf(" "));
    	ad = ad.toUpperCase().charAt(0)+ad.substring(1).replaceAll("[a-zA-Z]", "*");
    	
    	String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1);
    	
    	soyad = soyad.toUpperCase().charAt(0)+soyad.substring(1).replaceAll("[a-zA-Z]", "*");
    	
    	kKartiNo = kKartiNo.substring(0,12).replaceAll("[0-9]", "*")+kKartiNo.substring(12,16);
    	
    	
    	if (kKartiNo.length()==16) {
    		System.out.println("Ad : "+ ad + " Soyad : " + soyad + " Kart No : " + kKartiNo);
    	} else {
    		System.out.println("Geçersiz kredi kartı numarası");
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

    }
}
