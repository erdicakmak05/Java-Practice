package Replit_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Create a 10-element list. Swap the 8th element with the 3rd element.
		 * 
		 * INPUT : String[]
		 * names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan",
		 * "Ahmet","Ali"};
		 * 
		 * Output:
		 * 
		 * [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,
		 */
		
		List<String> list1 = new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
		
		list1.add(2, list1.get(7));
		list1.remove(8);
		
		System.out.println(list1);
	}

}
