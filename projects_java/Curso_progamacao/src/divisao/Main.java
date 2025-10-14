package divisao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite a qntd:");
		int qntd=sc.nextInt();
		
		for (int i=0;i<qntd;i++){
			
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			if(y==0) {
				System.out.println("Divisão impossivel");
	
			}
			
			else {
				double conta =(double) x/y;
				System.out.printf("%.1f%n",conta);	
			}
		
			
		}
		
	   sc.close();

	}

}
