package _04_switchCase;

public class Q05 {

	public static void main(String[] args) {

	       /*
        	Problem tanımı :
        	Bir String içinde kaç kelime olduğunu yazdıran bir method yazınız.
       		Test Data:
       		Input the string: The quick brown fox jumps over the lazy dog.
 	   		Expected Output: Number of words in the string: 9
         */
		
		String str = "The quick brown fox jumps over the lazy dog.";
		
		str = str.trim();
		
		str = str.replaceAll("[^ ]", "");
		
		int kacKelimeVar = kelimeSayisiBul(str);
		
		System.out.println(str);
		
		System.out.println(kacKelimeVar);

	}

	private static int kelimeSayisiBul(String str) {
	
			str.length();
			
		
		return str.length()+1;
	}

}
