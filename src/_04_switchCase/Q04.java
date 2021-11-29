package _04_switchCase;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string değer giriniz");
		String str = scan.next();
		
		boolean varMi = false;
		
		varMi = xyzKontrol(str, varMi);
		System.out.println(varMi);
		scan.close();
	}

	private static boolean xyzKontrol(String str, boolean varMi) {

		if (str.contains("xyz")) {
			varMi = true;
		}
		return varMi;
	}

}
