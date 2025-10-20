package ex_DataHora01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ex_01 {

	public static void main(String[] args) {
		LocalDate daynow= LocalDate.now();
		LocalDateTime h= LocalDateTime.now();
		Instant inst=Instant.now();
		
		System.out.println(daynow);
		System.out.println(h);
		System.out.println(inst);

	}

}
