package Scanner_Question;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {

		/*
		 * Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının
		 * toplamını bulmasını isteyin.
		 * 
		 * Örnek Çıktı:
		 * 
		 * Verilen tamsayının rakamları toplamı 10'dur.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("3 basamaklı bir sayı giriniz.");
		int sayi1 =  scan.nextInt();
		String sayi = sayi1+"";
		
		if (sayi.length()==3) {
			int a = sayi1%10;
			int b = (sayi1/10)%10;
			int c = (sayi1/100);
			int sonuc = a+b+c;
			System.out.println("Verilen tamsayının rakamları toplamı "+sonuc+"'dur.");
		}else {
			System.out.println("Hatalı işlem");
		}
		scan.close();
	}

}
