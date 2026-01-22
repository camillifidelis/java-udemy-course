package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program_ex04 {

	public static void main(String[] args) {
		
		// Operações com Data
		 
		LocalDate d04 = LocalDate.parse("2025-08-23");
		LocalDateTime d05 = LocalDateTime.parse("2025-08-23T09:35:35");
		Instant d06 = Instant.parse("2025-08-23T09:37:33Z");

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("t1 dias = " + t1.toDays());
		
		// Tem  que inserir o horario p calcular -> datalocaltime
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("t2 dias = " + t2.toDays());

		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("t3 dias = " + t3.toDays());

		Duration t4 = Duration.between(d06, pastWeekInstant);
		System.out.println("t4 dias = " + t4.toDays());

	}

}
