package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class C05_MapMain {
	
	public static void mapYazdir(Map<Integer,String> map) {
		map.put(10, "C++");
		map.put(5, "Java");
		map.put(1, "Python");
		map.put(2, "PHP");
		map.put(100, "C");
		
		/*for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey()+ " Value : " + entry.getValue());
		}*/

		System.out.println(map.keySet());
		
		for (Integer key : map.keySet()) {
			System.out.println("Key : " + key + " Value : " + map.get(key));
		}
		
		map.values();
	}

	public static void main(String[] args) {
		
		Map<Integer,String> hashmap = new HashMap<>();
		Map<Integer,String> linkedhashmap = new LinkedHashMap<>();
		Map<Integer,String> treemap = new TreeMap<>();
		
		
		mapYazdir(hashmap); 	// sırasız
		System.out.println("***********LinkedHashMap**************");
		mapYazdir(linkedhashmap); // ekleme sırasıan göre sıralı
		System.out.println("**************TreeMap**************");
		mapYazdir(treemap); 	// key e göre alfabetik sıralı
	}

}
