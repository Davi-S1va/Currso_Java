package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Interface_bank;

public class nubank_project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);

		double newvalue=0;
		
		System.out.println("Enter account number:");
		int valueinacout=sc.nextInt();
	


		System.out.println("Enter account holder:");
		sc.nextLine();
		String titular=sc.nextLine();
		
		

		
		System.out.println("Is There na initial deposit (y/n)");
		String repost=sc.next();
		
		System.out.println("Accout data:");
		
		Interface_bank bak=new Interface_bank(valueinacout,titular,newvalue);	

		
		if(repost.equals("y")) {
			
			System.out.println("Enter initial deposit value:");
			newvalue=sc.nextDouble();
			bak.addvalue(newvalue);
			System.out.println("Accout data:");
			System.out.println(bak.toString());
		}
		else {
			
			System.out.println("Accout data:");
		    System.out.println(bak.toString());	
			
		}
		
		
		
		
		System.out.println("Enter deposit value:");
		
		bak.addvalue(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(bak.toString());
		
		System.out.println("Enter a widraw value:");
		double removed=sc.nextDouble();
	
		bak.removevalue(removed);
		
		System.out.println("Update account data:");
	    System.out.println(bak.toString());
	
	    bak.settitular(sc.nextLine());
		
		sc.close();

	
	}		
}
