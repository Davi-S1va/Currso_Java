package Davi;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite seu número:");
		int quantidade=sc.nextInt();
		
		for(int i=0;i<quantidade;i=i+1) {
			if(i%2 !=0) {
				;
				System.out.println(i);
			}
			
			
		}
	    sc.close();	
		
		
	}

}
