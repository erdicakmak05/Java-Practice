package P02_okulYonetimi;

public class Main {
    public static void main(String[] args) {
    	Ogretmen ogretmen = new Ogretmen();

    	Ogrenci ogrenci = new Ogrenci();
		ogrenci.ekleme();
		
    	ogretmen.ekleme();
    	
    	System.out.println(Islemler.ogrenciList.toString());
    	System.out.println(Islemler.ogretmenList.toString());
    	
    }
}
