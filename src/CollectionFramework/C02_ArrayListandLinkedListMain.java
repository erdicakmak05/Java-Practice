package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_ArrayListandLinkedListMain {

	// ArrayList sona ekleme yapıcaksak hız bakımından avantajlıdır.
	// LinkedList ise listin başına yada ortasına ekleme yapıcaksak, ArrayListten
	// çok çok hızlıdır. Olay budur.

	public static void main(String[] args) {

		LinkedList<Integer> linkedlist = new LinkedList<>();

		ArrayList<Integer> arraylist = new ArrayList<>();

		zamanHesapla("LinkedList", linkedlist);
		zamanHesapla("ArrayList", arraylist);

	}

	private static void zamanHesapla(String string, List<Integer> list) {

		// Listin sonuna değer ekleme

		long baslangic;
		long bitis;

		baslangic = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(0, i);
		}
		bitis = System.currentTimeMillis();

		System.out.println(string + " ekleme süresi " + (bitis - baslangic) + "ms");

	}

}
