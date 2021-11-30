package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Kaç adet not gireceksiniz.");
    	int girilecekNotSayisi = scan.nextInt();
    	int toplam = 0;
    	
    	
    	List <Integer> ogrenciNotlari = new ArrayList<>();
    	
    	for (int i = 0; i < girilecekNotSayisi; i++) {
			System.out.println("Sıradaki notu giriniz.");
			int not = scan.nextInt();
			ogrenciNotlari.add(not);
			toplam+=not;
		}
    	
    	int ortalama = toplam/girilecekNotSayisi;
    	int sayac = 0;
    	
    	for (int i = 0; i < ogrenciNotlari.size(); i++) {
			if (ogrenciNotlari.get(i)>ortalama) {
				sayac++;
			}
		}
    	
    	
    	System.out.println("Öğrencilerin notlari --> "+ogrenciNotlari);
    	System.out.println("Not ortalamasi -->" + ortalama);
    	System.out.println("Ortalamayı geçen öğrenci sayisi -->" + sayac);



    }
}
