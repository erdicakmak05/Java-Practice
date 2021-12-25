package CollectionFramework;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C07_TreeMap_Ornek {

	public static void main(String[] args) {
		// TreeMap kullanarak bir stringin içindeki harflerin frekansını bulma
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cümleyi giriniz...");
		String cumle = scan.nextLine();
		
		Map<Character,Integer> frekans = new TreeMap<>();
		
		for (int i = 0; i < cumle.length(); i++) {
			char c = cumle.charAt(i);
			
			if (frekans.containsKey(c)) {
				frekans.replace(c, frekans.get(c)+1);
			}else {
				frekans.put(c, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println("Karakter : " + key + " " + val + " kadar geçiyor....");
			
		}

	}

}
