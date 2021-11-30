package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

    /*
    100 den kucuk asal sayilari yazdiran bir program yaziniz
     */
    public static void main(String[] args) {
    	
    	int sayi = 100;
    	
    	int sayac=0;
    	
        while(sayi > 2) {
            
            sayac = 0;
            for(int i = 2; i < sayi; i++)
            {
                if(sayi % i == 0) {
                    sayac++;
                }
            }
            if(sayac == 0) {
                System.out.print(sayi + " ");
            }
            sayi--;
        }
    }
}