package posto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Alcool:(1)\n Gasolina:(2)\nDisel:(3)");
		int gasolina=0;
		int alcool=0;
		int disel=0;
		
		int entrada=sc.nextInt();
		while (entrada !=4) {
			
			if(entrada==2) {
				gasolina=gasolina+1;
			}
			else if(entrada==1) {
				alcool=alcool+1;
			}
			else if(entrada==3) {
				disel=disel+1;
			}
			entrada=sc.nextInt();			
		
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool:"+alcool);
		System.out.println("Gasolina:"+gasolina);
		System.out.println("Disel:"+disel);
		sc.close();

	}

}
