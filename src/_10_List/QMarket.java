package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class QMarket {
	/*
	 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
	 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
	 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
	 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
	 *
	 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
	 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
	 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
	 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
	 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	 * 			 ortalama kazançtan yüksekse o günleri return yap.
	 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	 * 			 ortalama kazançtan aşağıysa o günleri return yap.
	 * */
	static int toplamKazanc=0;
	
	static ArrayList<String> gunler = new ArrayList<String>(
			Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
	static ArrayList<Double> gunlukKazanclar = new ArrayList<Double>();
	static ArrayList<String> ortalamaUstuKazancGunleri = new ArrayList<>();
	static ArrayList<String> ortalamaAltiKazancGunleri = new ArrayList<>();


	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i =0;
		while(i<gunler.size()) {
			System.out.println(gunler.get(i)+" gününün kazancını giriniz...");
			double kazanc = scan.nextDouble();
			toplamKazanc+=kazanc;
			gunlukKazanclar.add((double) kazanc);
			i++;
			System.out.println(toplamKazanc);
		}
		System.out.println(gunlukKazanclar);
		
		
		for (int j = 0; j < 500; j++) {
			menuGoster();
			System.out.println("Seçiminizi yapınız");
			int secim = scan.nextInt();
			
			switch (secim) {
			case 1:
				System.out.println("7 günlük ortalama kazancınız --> " + getOrtalamaKazanc());
				break;
			case 2:
				System.out.println("Ortalamanın üstünde kazanc sağladığınız günler -->" + getOrtalamaninUstundeKazancGünleri());
				break;
			case 3:
				System.out.println("Ortalamanın altında kazanc sağladığınız günler -->" + getOrtalamaninAltindaKazancGünleri());
				break;

			default:
				System.out.println("Geçersiz işlem yaptınız.");
				break;
			}
		}
				
		scan.close();

	}

	private static void menuGoster() {

		System.out.println("***Şen Kardeşler Markete Hoşgeldiniz.***");
		System.out.println("1 - Ortalama Kazancı Göster");
		System.out.println("2 - Ortalama üstü kazanç olan günleri göster");
		System.out.println("3 - Ortalama altı kazanç olan günleri göster");
		
	}

	private static ArrayList<String> getOrtalamaninAltindaKazancGünleri() {
		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			System.out.println(gunlukKazanclar.get(i));
			System.out.println(getOrtalamaKazanc());  
			if(gunlukKazanclar.get(i)<getOrtalamaKazanc()) {
				ortalamaUstuKazancGunleri.add(gunler.get(i));
				System.out.println(getOrtalamaKazanc());
				System.out.println(gunlukKazanclar.get(i));
			}
		}
		return ortalamaUstuKazancGunleri;
	}

	private static ArrayList<String> getOrtalamaninUstundeKazancGünleri() {
		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			if(gunlukKazanclar.get(i)>getOrtalamaKazanc()) {
				ortalamaAltiKazancGunleri.add(gunler.get(i));
			}
		}
		return ortalamaAltiKazancGunleri;
		
	}

	private static int getOrtalamaKazanc() {
	int ortalama = toplamKazanc/7;
		
	return ortalama;
	}
}