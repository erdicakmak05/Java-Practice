package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
     //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
     //listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
    	
    	String arr[][]= {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
    	List<String> arrlist1 = new ArrayList<>();
    	
    	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arrlist1.add(arr[i][j]);
			}
		}
    	
    	System.out.println(arrlist1);

    }

}
