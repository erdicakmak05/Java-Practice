package _10_List;
import java.util.Scanner;
public class QTasKagitMakas {
    public static void main(String[] args) {
        // tas >makas
        // makas >kagit
        //kagit >tas
        int kullanıcıKazandı = 0 , bilgisayarKazandı=0;
        Scanner Scan=new Scanner(System.in);
    
       System.out.println("tercihinizi Taş kağıt makas yazmalısınız");
        System.out.println("taş - kağıt - makas");
   
       // for(int i=0 ;i<3;i++){
        
          int num = (int)(Math.random() * 3);
          System.out.println(num);
          
        System.out.println("Sıra sende: ");
        
        int tahmin = -1;
          String  tahminString=Scan.next().toLowerCase();
          if(tahminString.equals("taş")) {
        	 tahmin=0;
          }else if(tahminString.equals("kağıt")) {
        	  tahmin=1;
          }else if(tahminString.equals("makas")) {
        	  tahmin=2;
          }else {
        	  System.out.println("taş, kağıt makas yazmalısınız.");
          }
          
    if(tahmin==0 && num == 2 || tahmin==1 && num==0 || tahmin==2 && num==1){
      kullanıcıKazandı++;
    }
    if(num==0 && tahmin == 2 || num==1 && tahmin==0 || num==2 && tahmin==1){
      bilgisayarKazandı++;
    }
    //}
    
      if(kullanıcıKazandı > bilgisayarKazandı){System.out.println("bilgisayar: "+bilgisayarKazandı+" oyuncu: "+kullanıcıKazandı+"Tebrikler Kazandınız!");}
      if(kullanıcıKazandı < bilgisayarKazandı){System.out.println("bilgisayar: "+bilgisayarKazandı+" oyuncu: "+kullanıcıKazandı+"Kaybettiniz!");}
      if(kullanıcıKazandı == bilgisayarKazandı){System.out.println("bilgisayar: "+bilgisayarKazandı+" oyuncu: "+kullanıcıKazandı+"Berabere!");}
    }
}
