package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Progam {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		SimpleDateFormat sfd=new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Entre com o nome do departamamento:");
		String departmentName = sc.nextLine();
		
		System.out.println("Entre com os datos do trabalhador:");
		
		System.out.println("Nome:\n");
		String WorkerName = sc.nextLine();
		
		System.out.print("Nível:\n");
		String workerLevel = sc.nextLine();
		
		System.out.print("Salário base:\n");
		double baseSalary = sc.nextDouble();
		
		Worker worker= new Worker(WorkerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("Quantos contratos esse tabalhador possuí??\n");
		int n =sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Entre com o contrato número #"+i+"\n Data:");
			
			System.out.print("Formato da Data: (DD/MM/YYYY):\n");
			Date contractDate = sfd.parse(sc.next());
			
		    System.out.print("Valor por hora:\n"); 
		    double valuePerHour= sc.nextDouble();
		    
		    System.out.print("Duração (Horas): \n");
		    int hours= sc.nextInt();
		    
		    HourContract contrct = new HourContract (contractDate,valuePerHour, hours);
		    worker.addContract(contrct);
		}
		
		System.out.println();
		System.out.println("Entre com mês e ano para calcular a RENDA (MM/YYYY): \n");
		String monthAndYear = sc.next();
		int month= Integer.parseInt(monthAndYear.substring(0,2));
		int year= Integer.parseInt(monthAndYear.substring(3));
		
		
		System.out.println("Departmento:"+worker.getDepartment().getName());
		System.out.println("A renda para esse mês foi"+ monthAndYear+": "+ String.format("%.2f", worker.income(year, month)));
		
	 sc.close();
	}

}
