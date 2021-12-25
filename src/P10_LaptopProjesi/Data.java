package P10_LaptopProjesi;

import java.lang.reflect.Array;
import java.util.LinkedHashMap;
import java.util.Map;

public class Data {

	/*
	 * String tumUrunlerListesi[] = {"Asus", "Apple", "Lenovo", "Hp", "Casper",
	 * "MSI", "Dell", "Monster", "Huwaei","i3", "i5", "i7","32 GB", "16 GB", "8 GB",
	 * "4 GB","Red", "Orange", "Silver", "Black","Mini", "Midlle", "Max"}; int
	 * tumUrunlerFiyat[] = {4000, 8000, 45000, 4200, 2250, 3000, 3500, 2750,
	 * 3600,200, 300, 500,300, 200, 100, 500,400, 300, 200, 150,100, 200, 300 };
	 */
	static String laptopNames[] = { "Asus", "Apple", "Lenovo", "Hp", "Casper", "MSI", "Dell", "Monster", "Huwaei" };
	static String cpu[] = { "i3", "i5", "i7" };
	static String ram[] = { "32 GB", "16 GB", "8 GB", "4 GB" };
	static String color[] = { "Red", "Orange", "Silver", "Black" };
	static String size[] = { "Mini", "Midlle", "Max" };

	static int laptopPrice[] = { 4000, 8000, 45000, 4200, 2250, 3000, 3500, 2750, 3600 };
	static int cpuPrice[] = { 200, 300, 500 };
	static int ramPrice[] = { 300, 200, 100, 500 };
	static int colorPrice[] = { 400, 300, 200, 150 };
	static int sizePrice[] = { 100, 200, 300 };
	
	

	String kartNo[] = { "1234567890123456", "6543210987654321" };
	String sifre[] = { "8888", "9393" };
	
	public static Map <String,Integer> laptopMap = arrToMap(laptopNames, laptopPrice);
	public static Map <String,Integer> cpuMap = arrToMap(cpu, cpuPrice);
	public static Map <String,Integer> ramMap = arrToMap(ram, ramPrice);
	public static Map <String,Integer> colorMap = arrToMap(color, colorPrice);
	public static Map <String,Integer> sizeMap = arrToMap(size, sizePrice);
	

	

	public static Map<String, Integer> arrToMap(String key1[], int value1[]) {
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < value1.length; i++) {
			map.put(key1[i], value1[i]);
		}
		return map;
	}
	


}
