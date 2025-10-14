package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.	in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		
		int n=sc.nextInt();
		
		double[] numero= new double[n];
		
		
		for(int i=0;i<n;i++) {
	
			System.out.println("Digite um numero:");
			
			numero[i]=sc.nextDouble();
			
		}
		
		double numbers=numero[0];
		int posicao=0;
		
		for (int i=1;i<n;i++) {
			if(numero[i]>numbers) {
				numbers=numero[i];
				posicao=i;
			    
			}
			
			
		}
	    System.out.printf("MAIOR VALOR = %.1f\n", numbers);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);

		
		
		sc.close();

	}

}
