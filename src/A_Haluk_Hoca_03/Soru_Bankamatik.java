package A_Haluk_Hoca_03;

import java.util.Scanner;

public class Soru_Bankamatik {

	public static void main(String[] args) {

		System.out.println("****** ATM'ye Hoşgeldiniz. ******");
		Scanner scan = new Scanner(System.in);
		System.out.println("Yapmak istediğiniz işlemi seçiniz :");

		String islem = "1. İşlem : BAKIYE \n2. İşlem : PARA YATIRMA\n3. İşlem : PARA ÇEKME \n4. İşlem : CIKIS";
		System.out.println(islem);
		System.out.println("Yapmak istediğiniz işlemi seçiniz.");

		int bakiye = 5000;

		String secilenIslem = scan.nextLine();

		switch (secilenIslem) {
		case "1":
			System.out.println("Bakiyeniz : "+bakiye);
			break;
		case "2":
			System.out.println("Çekmek istediğiniz miktarı giriniz.");
			int cekilecekMiktar = scan.nextInt();
			if (cekilecekMiktar<=bakiye) {
				bakiye-=cekilecekMiktar;
				System.out.println("Yeni hesap bakiyeniz : "+bakiye);
			} else {
				System.out.println("Çekim için bakiyeniz yetersiz.");
			}
			break;
		case "3":
			System.out.println("Yatırmak istediğiniz miktarı giriniz.");
			int yatirilacakMiktar = scan.nextInt();
			if (yatirilacakMiktar<=bakiye) {
				bakiye+=yatirilacakMiktar;
				System.out.println("Yeni hesap bakiyeniz : "+bakiye);
			} 
			break;
		case "4":
			System.out.println("Çıkış işleminiz başarı ile yapıldı.");
			break;

		default:
			break;
		}
		scan.close();
	}

}
