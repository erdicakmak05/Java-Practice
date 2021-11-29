package _04_switchCase;

public class Q07 {

	public static void main(String[] args) {
	    /*
        reverseString isminde bir method oluşturun.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten yazsın.
        Terste yazılmış halini yazdırınız.

        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */
		String str = "Java'yı Seviyorum.";
		
		//System.out.print(str.substring(17,18));
		//System.out.print(str.substring(16,17));
		//System.out.print(str.substring(15,16));



		reverseString(str);
		
	}

	private static void reverseString(String str) {
		
		for (int i = 1; i <= str.length(); i++) {
			
			System.out.print(str.charAt(str.length()-i)); 
			
			//System.out.print(str.substring(((str.length()-1)-i),str.length()-i));
			
		}
		
	}

}
