package A_Haluk_Hoca_While_DoWhile;

public class Q05 {

	public static void main(String[] args) {

		/*
		 * sayinin basamak degerlerinin toplamini while loop ile yapin bir method create ediniz.
		 */
		
		int sayi = 5684;
		int yedekSayi= sayi;
		int basamakSayisi= 0;
		int rakam = 0;
		int toplam = 0;
		
		basamakTopla(sayi, yedekSayi, rakam, toplam, basamakSayisi);
	}

	public static void basamakTopla(int sayi, int yedekSayi, int rakam, int toplam, int basamakSayisi) {
		
		while(yedekSayi>0) {
			rakam=yedekSayi%10;
			basamakSayisi++;
			toplam+=rakam;
			System.out.println(toplam);
			yedekSayi =  yedekSayi/10;
		}
		
		System.out.println("Basamak Sayisi = "+basamakSayisi);
		System.out.println("Sayıdaki Rakamlar Toplami = " + toplam);
	}

}
