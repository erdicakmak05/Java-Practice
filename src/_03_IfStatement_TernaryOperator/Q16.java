package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q16 {
	/*
	 * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
	 * olanlarini konsola yazdiriniz int num1 int num2 int num3
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("a  giriniz");
		int a = scan.nextInt();
		System.out.println("b  giriniz");
		int b = scan.nextInt();
		System.out.println("c  giriniz");
		int c = scan.nextInt();

		
		if ( a>b && a>c) {
			if (b>c) {
				System.out.println("B�y�k Say� A, K���k Say� C");
			} else {
				System.out.println("B�y�k Say� A, K���k Say� B");
			}
		} else if (b>a && b>c) {
			if (a>c) {
				System.out.println("B�y�k Say� B, K���k Say� C");
			} else {
				System.out.println("B�y�k Say� B, K���k Say� A");
			}
		} else if (c>a && c>b) {
			if (a>b) {
				System.out.println("B�y�k Say� C, K���k Say� B");
			} else {
				System.out.println("B�y�k Say� C, K���k Say� A");
			}
		}

	}
}
