package aplication;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import fatures.ContractService;

public class Progam {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Entre com os dados do contrato:");
		
		System.out.println(" \nNumero:");
		int number = sc.nextInt();
		
//		Para consuumir o ENTER
		sc.nextLine();
		
		System.out.print("Data (dd/MM/yyyy):");
		LocalDate date = LocalDate.parse(sc.nextLine(),fmt);
		
		Date newDate = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
	
		System.out.print("Valor do contrato:");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number,newDate, totalValue);
		
		System.out.println("Entre com o numero de parcelas:");
		int month = sc.nextInt();
		
		System.out.println("Parcelas:");
		
		ContractService cs = new ContractService();
		cs.processContract(contract, month);
		
		
		
		
		sc.close();
		

	}

}
