package _09_Arrays;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		/*  you have a string "GayetBasarılı"
	        * with arrays change it to "CoookBasarılı" and write changing array
			*(String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
			*
			*/
		String str = "GayetBasarılı";
		
		System.out.println(str.indexOf("Basarılı"));
		

		str = "Cook"+str.substring(str.indexOf("Basarılı"));
		
		System.out.println(str);
		
	}

}
