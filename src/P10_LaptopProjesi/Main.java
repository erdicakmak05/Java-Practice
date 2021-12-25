package P10_LaptopProjesi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	static Scanner scan = new Scanner(System.in);

	static Data data = new Data();

	static Sepet sepet = new Sepet();

	public static void main(String[] args) {

		menuGoster();

	}

	private static void menuGoster() {

		System.out.println("=======Hoşgeldiniz======");
		System.out.println("Yapmak istediğiniz işlemi seçiniz.");
		System.out.println("1-) Laptopları incelemek istiyorum.");
		System.out.println("2-) CPU'lari incelemek istiyorum.");
		System.out.println("3-) Ram'leri incelemek istiyorum.");
		System.out.println("4-) Renk Seçeneklerini incelemek istiyorum.");
		System.out.println("5-) Boyut Seçeneklerini incelemek istiyorum.");
		System.out.println("6-) Sepetimden ürün çıkartmak istiyorum");
		System.out.println("7-) Hesabı Ödeme İstiyorum.");
		System.out.println("8-) Çıkış yap.");

		int tercih = scan.nextInt();

		switch (tercih) {
		case 1:
			menuGetir(Data.laptopMap);
			// getLaptop();
			sepet.sepetYazdir();
			menuGoster();
			break;
		case 2:
			menuGetir(Data.cpuMap);
			// getCpu();
			menuGoster();
			break;
		case 3:
			menuGetir(Data.ramMap);
			// getRam();
			menuGoster();
			break;
		case 4:
			menuGetir(Data.colorMap);
			// getColor();
			menuGoster();
			break;
		case 5:
			menuGetir(Data.sizeMap);
			// getSize();
			menuGoster();
			break;
		case 6:
			sepet.urunCıkar();
			menuGoster();
			break;
		case 7:
			try {
				Hesap.toplamHesap();
			} catch (InterruptedException e) {
				
				menuGoster();
			}
			break;
		case 8:

			if (Hesap.toplamTutar > 0) {
				System.out.println("Sepenizde ürünler var, Bunları sepetinizden çıkartmalısınız.");
				menuGoster();
			} else if (Hesap.toplamTutar == 0) {
				System.out.println("Yine bekleriz.");
				System.exit(0);
			}
			break;

		default:
			System.out.println("Yanlış tercih yaptınız");
			System.out.println("Menüye yönlendiriliyorsunuz.");
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			menuGoster();
			break;
		}

	}

	private static void mapGoster(Map<String, Integer> laptopMap) {
		for (Map.Entry<String, Integer> entry : laptopMap.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + "\t------> " + val + " TL");
		}

	}

	public static void menuGetir(Map<String, Integer> test) {

		mapGoster(test);
		System.out.println("Sepetinize eklemek istediğiniz ürünü seçiniz.");
		System.out.println("Menüye dönmek için 0'a basınız.");
		int tercih = Main.scan.nextInt();
		if (tercih == 0) {
			Main.menuGoster();
		} else if (tercih > 0 && tercih < test.size() + 1) {
			int sayac = 0;
			for (Map.Entry<String, Integer> entry : test.entrySet()) {
				String key = entry.getKey();
				Integer val = entry.getValue();
				sayac++;
				if (sayac == tercih) {
					sepet.add(key, val);
				}
			}
		}
	}

}
