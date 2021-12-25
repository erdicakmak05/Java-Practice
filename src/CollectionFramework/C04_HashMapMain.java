package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class C04_HashMapMain {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap= new HashMap<>();
		
		hashMap.put(10, "Java");
		hashMap.put(30, "Python");
		hashMap.put(50, "PHP");
		hashMap.put(20, "PHP");
		
		System.out.println(hashMap);
		
		hashMap.put(50, "JavaScript"); // 50 ye karşılık gelen değeri siler yeni değeri ekler.
		
		/*System.out.println(hashMap);
		
		System.out.println(hashMap.get(50)); // JavaScript
		System.out.println(hashMap.get(10)); // Java
		System.out.println(hashMap.get(100)); // null
		*/
		
		for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			System.out.println("Anahtar : " + entry.getKey()+ " --->Değer : " + entry.getValue());
		}
		

	}

}
