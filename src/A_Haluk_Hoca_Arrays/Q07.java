package A_Haluk_Hoca_Arrays;

public class Q07 {

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        /*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,3},{4,5},{6,7,8}}
         * Output : 8
         */
    	
    	int arr[][] = {{1,2,3},{4,5},{6,7,8}};
    	
    	
    	int yeniArr[]= new int [arr.length];
    	
    	int enBuyukDeger = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]>enBuyukDeger) {
					enBuyukDeger=arr[i][j];
				}
			}
		}
    	
    	System.out.println(enBuyukDeger);


    }
}
