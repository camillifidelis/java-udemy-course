package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program_ex01 {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-08-23");
		LocalDateTime d05 = LocalDateTime.parse("2025-08-23T09:35:35");
		Instant d06 = Instant.parse("2025-08-23T09:37:33Z");
		Instant d07 = Instant.parse("2025-08-23T09:39:53-03:00");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("23/08/2025", fmt1);
		
		DateTimeFormatter fmt2= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("23/08/2025 09:46", fmt2);
		
		LocalDate d10 = LocalDate.of(2025,  8, 23);
		LocalDateTime d11 = LocalDateTime.of(2025,  8, 23, 9, 51);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		// usou GMT
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());

	}

}
