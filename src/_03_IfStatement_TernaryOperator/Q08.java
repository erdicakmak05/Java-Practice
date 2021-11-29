package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {
		
	       Scanner scan = new Scanner(System.in);
	       System.out.println("Ald���n�z �r�n�n fiyat�n� giriniz.");
	       double fiyat = scan.nextDouble();
	       System.out.println("�r�nden ka� adet ald�n�z ?");
	       int adet = scan.nextInt();
	       System.out.println("M��teri kart�n�z var m�?\nEvet\nHay�r");
	       char kartVarmi = scan.next().toLowerCase().charAt(0);
	       
	       double toplam = adet*fiyat;
	       
	       if (kartVarmi=='e' && adet>10) {
	    	   System.out.println("Y�zde 20 �ndirim ile Toplam �deminz : " + (toplam-(toplam*20/100)));
	       } else if (kartVarmi=='e' && adet<10) {
	    	   System.out.println("Y�zde 15 �ndirim ile Toplam �deminz : " + (toplam-(toplam*15/100)));
	       } else if (kartVarmi=='h' && adet>10) {
	    	   System.out.println("Y�zde 15 �ndirim ile Toplam �deminz : " + (toplam-(toplam*15/100)));
	       } else if (kartVarmi=='h' && adet<10) {
	    	   System.out.println("Y�zde 10 �ndirim ile Toplam �deminz : " + (toplam-(toplam*10/100)));
	       } else {
	    	   System.out.println("Ge�ersiz ��lem.");
	       }
	       
	       /*
	        * Scanner scan = new Scanner(System.in);
		System.out.println("�r�n adedini giriniz");
		int urun = scan.hashCode();
		
		System.out.println("Liste fiyat�n� giriniz");
		double fiyat =scan.nextDouble();
		
		System.out.println("M��teri kart� varsa E Yoksa H girin");
		char kart = scan.next().toUpperCase().charAt(0);
		
		if (kart=='E' && urun>=10) {
			System.out.println("Borcunuz..:" + (fiyat*(20/100)) );
		}else if (kart=='H' && urun>=10) {
			System.out.println("Borcunuz..:" + (fiyat*(15/100)) );
		}else if(kart=='H' && urun<10){
			System.out.println("Borcunuz..:" + (fiyat*(10/100)) );
		}
		
		scan.close();
	        * 
	        */
	       
		
	}

}
