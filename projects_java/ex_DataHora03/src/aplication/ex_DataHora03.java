package aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ex_DataHora03 {

	public static void main(String[] args) {
		DateTimeFormatter fmt2=DateTimeFormatter.ofPattern("dd/MM/yyy");
		DateTimeFormatter fmt3=DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		DateTimeFormatter fmt4=DateTimeFormatter.ISO_DATE_TIME;
	
		DateTimeFormatter fmt5=DateTimeFormatter.ISO_INSTANT;

		LocalDateTime day_1= LocalDateTime.now();
		LocalDate day_2=LocalDate.parse("25/10/2025",fmt2);	
		Instant day_3=Instant.now();
		//Converti o Instant para um LocalDate, definindo um novo fuso
		LocalDate day_4=LocalDate.ofInstant(day_3, ZoneId.of("Portugal"));
		LocalDateTime day_5=LocalDateTime.ofInstant(day_3, ZoneId.of("Portugal"));
		LocalDateTime day_6=LocalDateTime.ofInstant(day_3, ZoneId.systemDefault());
		System.out.println("day_01="+day_1.format(fmt2));
		System.out.println("day_02"+day_2);
		System.out.println("day_03= "+day_1.format(fmt3));
		System.out.println("day_04= "+day_1.format(fmt4));
		System.out.println("Day_05= "+fmt5.format(day_3));
		System.out.println("Day-06 Data de Portugal"+ day_4);
		System.out.println();
		System.out.println("Day-06 Data e Hora de Portugal=\n"+ day_5.format(fmt3));
		System.out.println();
		System.out.println("Day-07 Data e Hora do Brasil=\n"+day_6.format(fmt3));
		System.out.println("Dia em Portgal:\n"+day_5.getDayOfMonth());
	}
}
 