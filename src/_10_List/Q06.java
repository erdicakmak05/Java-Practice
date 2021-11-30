package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

    	int arr[] = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};

    	
    	List<Integer> tekrarsiz =  new ArrayList<>();
    	int arr2[] = new int[tekrarsiz.size()];
    	
    	
    	for (int i = 0; i < arr.length; i++) {
    		if(!tekrarsiz.contains(arr[i])) {
    			tekrarsiz.add(arr[i]);
    		}
		}
    	System.out.println(tekrarsiz);
    	
    	for (int i = 0; i < arr2.length; i++) {
			arr2[i]=tekrarsiz.get(i);
		}
    	
    	
    	
    	System.out.println(Arrays.toString(arr2));
    
    	
    



    }

}
