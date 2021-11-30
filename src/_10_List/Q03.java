package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulunuz. Sonucu ekrana yazdırınız.
    */
    	
    	List<Integer> arrlist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    	
    	int toplam = 0;
    	
    	for (int i = 0; i < arrlist.size(); i++) {
    		toplam+=Math.pow(arrlist.get(i), 2);
		}
    	
    	System.out.println("Listeki elemanın karelerini toplami = " + toplam );
    }
}
