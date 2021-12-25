package P10_LaptopProjesi;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sepet {

	public static Map<String, Integer> sepetMap = new LinkedHashMap<>();

	public void add(String urunAdi, Integer urunFiyati) {

		sepetMap.put(urunAdi, urunFiyati);
		
	}
	
	public void sepetYazdir() {
		System.out.println("*********Sepetiniz********");
		for (Map.Entry<String, Integer> entry : sepetMap.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key + " -------> " + val);
		}
	}
	
	public void urunCıkar() {
		sepetYazdir();
		System.out.println("Hangi ürünü çıkartmak istiyorsunuz.(İsmini Yazınız.)");
		String tercih = Main.scan.next();
		sepetMap.remove(tercih);
		
		
	}

}
