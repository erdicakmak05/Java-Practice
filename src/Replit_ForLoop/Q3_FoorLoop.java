package Replit_ForLoop;

public class Q3_FoorLoop {

	public static void main(String[] args) {

		/*
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazıniz.(mülakat Sorusu)
		 * 
		 * Input :
		 * 
		 * String str=“Javaisalsoeasy”
		 * 
		 * Output: a s
		 */
//Javaisalsoeasy
		String str = "Karakarakaşlarıvar";
		
		str = str.toLowerCase();
		
		String bosKutu = "";
		String bomBosKutu = "";

		
		
		for (int i = 0; i < str.length()-1; i++) {

			if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
				bosKutu = bosKutu.replace(str.charAt(i),'*' );
				bosKutu = bosKutu + str.charAt(i);
			} 
		}
		
		bosKutu= bosKutu.replaceAll("\\W", "");
		
		bosKutu = bosKutu.replaceAll("", " ");
		
		System.out.println(bosKutu.trim());
		
	
		
	}

}
