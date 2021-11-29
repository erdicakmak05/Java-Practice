package Replit_IfElse_Switch;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve
		 * yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan fazla
		 * basamakli olursa, "OverFlow" yazdırın.
		 * 
		 * Ornek:
		 * 
		 * INPUT :
		 * 
		 * 25
		 * 
		 * 46
		 * 
		 * OUTPUT :
		 * 
		 * Numaralarin Toplami:
		 * 
		 * 71
		 */
		
		long sayi1 = 25000000000L;
		long sayi2 = 46;
		long sonuc =0;
		
		if (sayi1>=0 && sayi2>=0) {
			sonuc = sayi1+sayi2;
		}else {
			System.out.println("Sayilar 0'dan büyük veya eşit olmalı.");
		}
		
		String sonucStringDeger = String.valueOf(sonuc);
		
		int sonucUzunluk = sonucStringDeger.length();
		
		
		if(sonucUzunluk>10) {
			System.out.println("OverFlow");
		}else {
			System.out.println(String.valueOf(sonuc));

		}

	}

}
