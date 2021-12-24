package P06_hastaneOtomasyon;

public class HastaneRunner {

	public static void main(String[] args) {

		String hastaDurumu = "Kalp hastaliklari";
		String unvan = doktorUnvan(hastaDurumu);

		Hastane hastane1 = new Hastane();
		
        hastane1.setDoktor(doktorBul(unvan));

        System.out.println("Doktor ismi: "+hastane1.getDoktor().getIsim());
        System.out.println("Doktor soy isim: "+hastane1.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: "+hastane1.getDoktor().getUnvan());
		
		

	}

	public static Hasta hastaBul(String aktuelDurum) {

		Hasta hasta = new Hasta();

		for (int i = 0; i < Hastane.hastaIDleri.length; i++) {
				hasta.setIsim(Hastane.hastaIsimleri[i]);
				hasta.setSoyIsim(Hastane.hastaSoyIsimleri[i]);
				hasta.setHastaID(Hastane.hastaIDleri[i]);
				hasta.setHastaDurumu(hastaDurumuBul(aktuelDurum));
		}
		return hasta;

	}

	public static Durum hastaDurumuBul(String aktuelDurum) {
		Durum hastaDurumu = new Durum();

		switch (aktuelDurum) {
		case "Allerji":
			hastaDurumu.setAciliyet(false);
			break;
		case "Bas agrisi":
			hastaDurumu.setAciliyet(false);
			break;
		case "Diabet":
			hastaDurumu.setAciliyet(false);
			break;
		case "Soguk alginligi":
			hastaDurumu.setAciliyet(false);
			break;
		case "Migren":
			hastaDurumu.setAciliyet(true);
			break;
		case "Kalp hastaliklari":
			hastaDurumu.setAciliyet(true);
			break;

		default:
			System.out.println("Geçerli bir durum değil.");
			break;
		}
		return hastaDurumu;
	}

	public static String doktorUnvan(String aktuelDurum) {
		if (aktuelDurum.equals("Allerji")) {
			return "Allergist";
		} else if (aktuelDurum.equals("Bas agrisi")) {
			return "Norolog";
		} else if (aktuelDurum.equals("Diabet")) {
			return "Genel cerrah";
		} else if (aktuelDurum.equals("Soguk alginligi")) {
			return "Cocuk doktoru";
		} else if (aktuelDurum.equals("Migren")) {
			return "Dahiliye";
		} else if (aktuelDurum.equals("Kalp hastaliklari")) {
			return "Kardiolog";
		} else {
			return "Yanlış unvan";
		}
	}

	public static Doktor doktorBul(String unvan) {
		Doktor doktor = new Doktor();
		for (int i = 0; i < Hastane.unvanlar.length ; i++) {
			if (Hastane.unvanlar[i].equals(unvan)) {
				doktor.setIsim(Hastane.doctorIsimleri[i]);
				doktor.setSoyIsim(Hastane.doctorSoyIsimleri[i]);
				doktor.setUnvan(Hastane.unvanlar[i]);
				return doktor;
			} 
		}
		return doktor;

	}

}
