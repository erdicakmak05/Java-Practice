package _04_switchCase;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// Girilen bir ay numarasına görei ayın kaç gün olduğunu sayi ile yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaçıncı ayın gün sayisini öğrenmek istiyorsunuz.");
		int ayNo = scan.nextInt();
		
		switch (ayNo) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Girdiğiniz ay 31 gündür.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Girdiğiniz ay 30 gündür.");
		break;
		case 2:
			System.out.println("Yılı giriniz.");
			int yil = scan.nextInt();
				if(yil%4==0) {
					System.out.println("Girdiğiniz ay 29 gündür.");
				}else {
					System.out.println("Girdiğiniz ay 28 gündür.");
				}
		default:
			break;
		}
		scan.close();
	}

}
