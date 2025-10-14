package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Mathdolls;

public class Convert_dolls {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		Mathdolls.Valuedolls=sc.nextDouble();
		
		System.out.println("How many dollar will be bougth");
		Mathdolls.Uservalue=sc.nextDouble();
		
		System.out.printf("Amout to be paid in reais= %.2fR$", Mathdolls.Calculatevalue());
		
		sc.close();
		
		
		

	}

}
