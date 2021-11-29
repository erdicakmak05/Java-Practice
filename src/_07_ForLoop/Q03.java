package _07_ForLoop;

public class Q03 {

	public static void main(String[] args) {

		/*
		 * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
		 * döngüden çıkılsın Bugün hava oldukca güzel.-> 2 str.CharAt(0)
		 */

		String str = "Bugün hava oldukca güzel.";
		int sayac = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == 'a') {
				sayac++;
			} else if (str.toLowerCase().charAt(i) == 'c') {
				break;
			}
		}

		System.out.println(sayac + " kadar a harfi mevcut");

	}

}
