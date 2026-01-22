package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program_ex06 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2025-08-27T16:30:25Z"));
		
		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); //pq o mes começa no 0, ai tem q add 1 p dar certo
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
		// adicionar 4h no meu calendário
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		//d = cal.getTime();
		//System.out.println(sdf.format(d));
		
	}

}
