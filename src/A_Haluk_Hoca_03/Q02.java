package A_Haluk_Hoca_03;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
			name1 ve name2 degiskenlerini olusturun.
			name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
			name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
		Scanner scan = new Scanner (System.in);
		System.out.println("Name1 giriniz : ");
		String name1 = scan.next();
		System.out.println("Name2 yi giriniz");
		String name2 = scan.next();
		
		ortasinaEkle(name1, name2);
		
	}

	private static void ortasinaEkle(String n1, String n2) {
		
		if (n1.length()%2==0) {
			System.out.println(n1.substring(0, n1.length()/2)+n2+n1.substring(n1.length()/2));
		}else {
			System.out.println("Name 1 çift sayili olmadığı için yerleştiremedik");
		}
		
	}

}
