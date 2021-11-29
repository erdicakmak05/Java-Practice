package A_Haluk_Hoca_02;

public class Q11 {
    public static void main(String[] args) {
	/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
    	
    	String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	
    	char A = pickName.charAt(pickName.indexOf("A"));
    	char B = pickName.charAt(pickName.indexOf("L"));
    	char C = pickName.charAt(pickName.indexOf("I"));

    	System.out.println(""+A+B+C);
       
    }

}
