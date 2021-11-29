package A_Haluk_Hoca_For_Loop;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {

		// Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kelime giriniz.");
		String kelime = scan.next();
		
		String terstenKelime="";
		
		for (int i = kelime.length()-1; i >=0 ; i--) {
			terstenKelime+=kelime.charAt(i);
			
		}
		if(kelime.contains(terstenKelime)) {
			System.out.println("Kelime polindromdur.");
		} else {
			System.out.println("Kelime polindrom değildir.");
		}
		scan.close();
	}

}
