package list_supermarket;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_make;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter quantity for products");
		
		int n=sc.nextInt();
		
		Product_make[]= vect=new Product[n];
		
		for (int i=0;i<n;i++) {
			sc.nextLine();
			String names=sc.nextLine();
			double price=sc.nextDouble();
			vect[i]= new Product_make(name,price);
			
			
	}

}
