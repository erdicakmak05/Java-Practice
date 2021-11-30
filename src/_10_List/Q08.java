package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q08 {

	public static void main(String[] args) {
		/*
		 * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile 8. elemaninin
		 * yerlerini degistirin.
		 *
		 * ORNEK:
		 *
		 * INPUT : String[]
		 * isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan",
		 * "Ahmet","Ali"}; OUTPUT : String[]
		 * isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal",
		 * "Ahmet","Ali"};
		 */

		String[] isimler = { "Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali" };
		// 2 ve 7 index degisecek

		List<String> list1 = new ArrayList<>();

		for (int i = 0; i < isimler.length-2; i++) {
			list1.add(isimler[i]);
			if (i == 2) {
				list1.remove(i);
				list1.add(isimler[7]);
				
			}
			if (i == 7) {
				list1.remove(i);
				list1.add(isimler[2]);
				
			}
		}

		System.out.println(list1);
	}

}
