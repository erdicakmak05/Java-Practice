package P00_PasswordChecker;

import java.util.Scanner;

public class PasswordChecker {

	static String kartNumaram = "123456";

	static String kartSifrem = "1234";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Java Banka hoşgeldiniz.");

		String kart = "";
		String sifre = "";

		do {
			System.out.println("Kart numaranızı giriniz.");

			kart = scan.nextLine();

			System.out.println("Lütfen şifrenizi giriniz.");

			sifre = scan.next();

			if (!sifre.equals(kartSifrem) || !kart.replaceAll("\s", "").equals(kartNumaram)) {
				System.out.println("Hatalı giriş yaptınız.");
			}

		} while (!sifre.equals(kartSifrem) || !kart.replaceAll("\s", "").equals(kartNumaram));

		ekran();

	}

	private static void ekran() {
		System.out.println("Şifreniz doğru.Giriş yaptınız.");
		
		System.out.println("Lütfen yapmak istediğiniz işlemi giriniz.");
		

		
	}

}
