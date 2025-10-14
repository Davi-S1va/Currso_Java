package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Employeedata {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter Employee date:");
		
		Employee employee=new Employee();
		
		System.out.println("Name:");
		employee.name=sc.nextLine();
		
		System.out.println("Gross salary:");
		
		employee.grossSalary=sc.nextDouble();
		
		System.out.println("Tax:");
		employee.tax=sc.nextDouble();

		
		System.out.println("\n \nEmployee:"+employee.toString()+"\n\n\n");
		
		System.out.println("Wich percentage to incrase salary?");
		
		double percentage=sc.nextDouble();
		employee.InreaseSalary(percentage);
		
		System.out.println("Updade"+employee.toString());
		
		
		
		
		
		
		
		sc.close();
		

	}

}
