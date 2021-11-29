package A_Haluk_Hoca_Arrays;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		/*
		 * Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu
		 * alin.
		 * input : Congratulations
		 * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

		 */
		
		String str = "Congratulations";
		
		String arr[] = str.split("");
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("o") || arr[i].contains("a") ||arr[i].contains("u")) {
				arr[i]="i";
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
