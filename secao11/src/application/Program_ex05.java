package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program_ex05 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		// Datas com horário de agora
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		// Armazena a data a partir do dia 01/01/1970 (Br é -3)
		Date x3 = new Date(0L);
		// 5h da manhã de 01/01/1970 (Br é mls * minuto * hora * 5 = n-3h)
		Date x4 = new Date(1000L * 60 * 60 * 5);
		
		Date y1 = sdf1.parse("27/08/2025"); 
		Date y2 = sdf2.parse("27/08/2025 16:08:04");
		
		// Data - 3 pq data definida no formato gmt
		Date y3 = Date.from(Instant.parse("2025-08-27T16:20:46Z"));
		
		// Sem formatação
		System.out.println("----------------------");
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);

		// Formato UTC - BR
		System.out.println("----------------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		
		// Formato GMT - Padrão
		System.out.println("----------------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
	}
} 