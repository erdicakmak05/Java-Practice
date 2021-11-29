package A_Haluk_Hoca_Arrays;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        /*
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
    	String str = "adegdfg 1r4d3gfjf56";
    	
    	String arr[]= str.split("");
    	System.out.println(Arrays.toString(arr));
    	
    	int toplam =0 ;
    	
    	for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i].charAt(0))) {
				toplam+=Integer.valueOf(arr[i]);
			} else 
				continue;
		}
    	
    	System.out.println("String ifadenin sayi değerleri toplami : " + toplam );
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/*str=str.replaceAll("\\D", "");
    	
    	System.out.println(str);
    	
    	int yeniSayi = Integer.valueOf(str);
    	
    	int toplam = 0;
    	
    	for (int i = 0; i < str.length(); i++) {
    		toplam+=yeniSayi%10;
    		
			yeniSayi = yeniSayi/10;
		}
    	
    	System.out.println(toplam);*/


    }


}

