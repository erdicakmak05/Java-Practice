package Replit_IfElse_Switch;

public class Q08 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından
		 * oluşan yeni bir String yazdırın
		 * 
		 * Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */
		
		String isim = "Erdi";
		
		if(isim.length()>2) {
			for (int i = 0; i < 3; i++) {
				System.out.print(isim.charAt(isim.length()-2)+""+isim.charAt(isim.length()-1));
			}
		}

	}

}
