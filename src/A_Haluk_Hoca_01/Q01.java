package A_Haluk_Hoca_01;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yapmak istedi�iniz i�lemi se�iniz...\n1-Toplama\n2-��kartma\n3-�arpma\n4-B�lme");
		int islemTipi = scan.nextInt();
		
		System.out.println("Birinci say�y� giriniz");
		double a = scan.nextDouble();
		System.out.println("�kinci say�y� giriniz");
		double b = scan.nextDouble();
		
		if (islemTipi==1) {
			System.out.println("Toplama i�leminin sonucu : " + (double)(a+b));
		}
		else if (islemTipi==2) {
			System.out.println("��kartma i�leminin sonucu : " + (double)(a-b));
		}
		else if (islemTipi==3) {
			System.out.println("�arpma i�leminin sonucu : " + (double)(a*b));
		}
		else if (islemTipi==4) {
			System.out.println("B�lme i�leminin sonucu : " + (double)(a/b));
		}
		else {
			System.out.println("Ge�ersiz i�lem yapt�n�z.");
		}
		
		
		
		
	}

}
