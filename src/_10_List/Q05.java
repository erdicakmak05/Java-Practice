package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.
    	
    	List<Integer> list1 = new ArrayList<>();
    	List<Integer> list2 = new ArrayList<>();

    	
    	Scanner scan = new Scanner(System.in);
    	for (int i = 0; i < list1.size(); i++) {
			System.out.println("Liste eklemek istediğiniz sayıyı giriniz.");
			int sayi = scan.nextInt();
			list1.add(sayi);
		}
    	
    	tekSayilariAyir(list1, list2);
    	scan.close();


    }

	private static void tekSayilariAyir(List<Integer> list1,List<Integer> list2) {
		
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i)%2==1) {
				list2.add(i);
			}
		}
		System.out.println("Tek sayıların ayrıldığı list -->" + list2);
	}


}
