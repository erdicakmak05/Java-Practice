package A_Haluk_Hoca_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*   $ ve  £  isareti olanlarin toplamlarini ayri ayri bulun

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
    	
    	String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
    	
    	String arr[] = str.split(" ");
    	
    	System.out.println(Arrays.toString(arr));
    	
    	int tDolar = 0;
    	
    	int tEuro = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("$")) {
				tDolar+=Integer.valueOf(arr[i].replaceAll("[\\D]", ""));
			}
			
			if (arr[i].contains("£")) {
				tEuro+=Integer.valueOf(arr[i].replaceAll("[\\D]", ""));
			}
			
			
		}
    	
    	System.out.println("Toplam dolar : " + tDolar);
    	System.out.println("Toplam sterlin : " + tEuro);


    }
}


