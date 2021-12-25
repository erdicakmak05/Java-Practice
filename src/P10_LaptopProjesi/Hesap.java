package P10_LaptopProjesi;

import java.nio.file.FileSystems;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public class Hesap {

	static int toplamTutar;
	int indirimTutarı;

	public static void toplamHesap() throws InterruptedException {
		Sepet.sepetMap.values();
		for (Entry<String, Integer> entry : Sepet.sepetMap.entrySet()) {
			Integer val = entry.getValue();
			toplamTutar += val;
		}
		Sepet sepet = new Sepet();
		sepet.sepetYazdir();
		System.out.println("Toplam Ödemeniz Gereken Tutar : " + toplamTutar);
		System.out.println("Ne kadar ödeme yapacaksınız...");
		int odeme = Main.scan.nextInt();
		if (odeme > toplamTutar) {
			System.out.println("Güzel günlerde kullanın..");
			System.out.println("Para üstünüz : " + (toplamTutar - odeme));
		} else if (odeme < toplamTutar) {
			System.out.println(
					"Eksik tutar verdiniz. " + (toplamTutar - odeme) + " kadar daha ödeme yaomanız gerekiyor.");
			System.out.println("Ödeme ekranına tekrar yönlendiriliyorsunuz.");
			TimeUnit.SECONDS.sleep(3);
			toplamTutar = 0;
			toplamHesap();
		} else if (odeme == toplamTutar) {
			System.out.println("Bizi tercih ettiğiniz için teşekkürler. ");
		} else {
			System.out.println("Hata");
			toplamHesap();
		}

	}

	public int getToplamTutar() {
		return toplamTutar;
	}

	public int getIndirimTutarı() {
		return indirimTutarı;
	}

	public void setToplamTutar(int toplamTutar) {
		this.toplamTutar = toplamTutar;
	}

	public void setIndirimTutarı(int indirimTutarı) {
		this.indirimTutarı = indirimTutarı;
	}

}
