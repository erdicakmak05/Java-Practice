package Scanner_Question;

public class Q_01 {

	public static void main(String[] args) {

		// verilen 12345 say�s�n�n rakamlar�n� yukar�dan a�a��ya do�ru yazd�r�n�z
		// ex: input: 12345
//				  output: 1
//				      2
//				      3
//				      4
//				      5
		
		/*
	      \n (or \r): starts from a new line : metni bir alt sat�rdan itibaren yazd�r�r.
	              \t:  horizontal tab : metni yatayda 1 tab miktar� kayd�r�r.
	              \\: prints a back slash :\ (ters slash) yazd�r�r
	              \': prints single quote :' tek t�rnak yazd�r�r.
	              \": prints double quote :"" �ift t�rnak yazd�r�r.
	     */
	     

		int sayi = 12345;

		int birler = sayi % 10;
		int onlar = sayi / 10 % 10;
		int yuzler = sayi / 100 % 10;
		int binler = sayi / 1000 % 10;
		int onbinler = sayi / 10000 % 10;

		/*System.out.println(onbinler);
		System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);*/

		System.out.println(onbinler + "\n" + binler + "\n" + yuzler + "\n" + onlar + "\n" + birler);

	}

}
