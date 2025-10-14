package cardapio;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escolha o intem do cardapio:");
		System.out.println("Primeiro prato:");
		int entrada1=sc.nextInt();
		
		System.out.println("Digite a quantidade");
		double entrada2=sc.nextInt();
		
		

		
		
		double conta;
		if(entrada1==1) {
			
			conta=  4.0*entrada2;
			
			
			
			
		}
		else if(entrada1==2) {
			
			conta= 4.5*entrada2;
			
			
		
		}
		else if(entrada1==3) {
			
			conta= 5.0*entrada2;
			
			
		
		}
		else if(entrada1==4) {
			
			conta= 2.0*entrada2;
			
			
		
		}
		else  {
			
			conta= 1.5*entrada2;
			
			
		
		}
		System.out.printf("Total: R$ %.2f%n",conta);
		
		
		
		sc.close();
		
	}

}
