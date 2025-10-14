package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.checknote;

public class nota1000 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc=new Scanner(System.in);
		
		checknote check=new checknote();
		
		System.out.println("Name: ");
		check.name=sc.nextLine();
		
		System.out.println("Enter Note:");
		
		check.noteone=sc.nextDouble();
		check.notetwo=sc.nextDouble();
		check.notethree=sc.nextDouble();
		
		System.out.println(check.toString());
		
		
		
		sc.close();

	}

}
