package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

    	List<String> list1=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
    	
    	for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).contains("a")) {
				list1.remove(i);
			}
		}
    	
    	System.out.println(list1);

    }


}
