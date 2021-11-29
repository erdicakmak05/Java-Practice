package A_Haluk_Hoca_Arrays;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
	
	/*    write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyükk ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	*/
    	
    int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
    
    Arrays.sort(arr);
    
    System.out.println("Dizide ki En Büyük Eleman : " + arr[arr.length-1]);
    System.out.println("Dizideki En Küçük Eleman : " + arr[0]);
    System.out.println("Dizideki En büyük ikinci sayi : " +arr[arr.length-2]);



    }

}
