package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * ayna check sorusu: input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 }; output :
		 * verilen array simetriktir
		 */

		int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };

		int sayac = 0;

		for (int i = 0; i < arr1.length / 2; i++) {
			for (int j = arr1.length / 2; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					sayac++;
				}
			}
		}
		if (sayac == arr1.length / 2) {
			System.out.println("Verilen array simetriktir.");
			System.out.println("kontrol ->" + sayac);
		} else {
			System.out.println("Array simetrik değildir.");
		}

	}

}
