package Inheritence;

public class Calisan {
	protected String adSoyad,eposta,telefon;
	
	
	protected String giris() {
		return this.adSoyad + " giriş yaptı";
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public String getEposta() {
		return eposta;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Calisan(String adSoyad, String eposta, String telefon) {
		super();
		this.adSoyad = adSoyad;
		this.eposta = eposta;
		this.telefon=telefon;
	}
	public static void listele(Calisan[] girisYapanlar) {
		for (Calisan c : girisYapanlar) {
			System.out.println(c.giris());
		}
	}

	public void derseGir(int dersSaati) {
		// TODO Auto-generated method stub
		
	}
}
