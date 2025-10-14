package compara;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int qntd=sc.nextInt();
		
		int out=0;
		
		int in=0;
		
		for(int i=0;i<qntd;i++) {
			int numeros=sc.nextInt();
			if(numeros>=10 && numeros<=20) {
				in+=1;
				
				
			}
			else {
				out+=1;
			}
			
		System.out.println("out"+out);
		System.out.println("in"+in);
			
			
		}
		
		sc.close();

	}

}
