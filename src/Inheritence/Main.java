package Inheritence;

public class Main {

	public static void main(String[] args) {
		
		//Akademisyen a = new Akademisyen("Ahmet Keleş","a@gmail.com","05423258569","CENK","Hoca","CENG 101");
		
		
		OgretimUyesi o = new OgretimUyesi("Mehmet","m@gmail.com","000","CENG","Hoca","CENG 102", "Yardımcı Doçent");
	
		Calisan c = new Calisan("Salim Ata","a@gmail.com","05423258569");
		
		Memurlar m = new Memurlar("Memur Ata","a@gmail.com","05423258569","Bilgi İşlem","Tam Zamanlı");
		
		
		//Calisan c2 = new Akademisyen("Mehmet Salaş","a@gmail.com","05423258569","CENK","Hoca","CENG 101");
		//Calisan girisListesi[]= {a,o,m};
		//Calisan.listele(girisListesi);
		o.derseGir(6);

	}

}
