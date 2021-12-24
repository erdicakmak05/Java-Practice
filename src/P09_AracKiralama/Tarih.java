package P09_AracKiralama;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Tarih {

	static int gun;

	public static int tarihFarkiBul(String alinacakGun, String teslimGunu) {

		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd / MM / YYYY  HH : mm");
		Date date1 = null;
		try {
			date1 = (Date) new SimpleDateFormat("dd-MM-yyyy").parse(alinacakGun);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Date date2 = null;
		try {
			date2 = (Date) new SimpleDateFormat("dd-MM-yyyy").parse(teslimGunu);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		gun = (int) (date1.getTime()-date2.getTime());
		
		

		return gun;
	}

}
