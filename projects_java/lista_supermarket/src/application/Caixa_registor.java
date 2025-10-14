package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_make;

public class Caixa_registor {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter quantity for products");
			int n=sc.nextInt();
			
			Product_make[]vect= new Product_make[n];
			
			for (int i=0;i<vect.length;i++) {
				sc.nextLine();
				String Name=sc.nextLine();		
				double Price=sc.nextDouble();
				vect[i]= new Product_make(Name, Price);	
			
			}
			double count=0.0;
			
			for (int i=0;i<vect.length;i++) {
				count+= vect[i].getPrice();
				
				
			}
			double media= count/vect.length;
			
			
			System.out.printf("A média dos produtos digitados foi:%.2f",media);
	
			
			
			sc.close();

	}

}
