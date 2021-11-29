package A_Haluk_Hoca_02;

public class Q05 {
	public static void main(String[] args) {
		/*
		 * String seklinde verilen asagidaki fiyatlarin toplamini bulunuz. String str 1=
		 * %13.99 String str 2= %10.55 ipucu: Double.parseDouble() methodunu
		 * kullanabilirsiniz.
		 * 
		 */

		String str1 = "%13.99";
		String str2 = "%10.55";
		
		str1 = str1.replaceAll("[^ 0-9]", "");
		str2 = str2.replaceAll("[^ 0-9]", "");
		
		double sayi1= Double.valueOf(str1)/100;
		
		double sayi2 = Double.valueOf(str2)/100;
		
		System.out.println("Toplam : " + (sayi1+sayi2));
	}
}
