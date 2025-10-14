package horas;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua hora");
		int entrada =sc.nextInt();
		
		if (entrada<12) {
			System.out.println("Bom dia!!");
		}
		
		else {
			if(entrada <18 ) {
				System.out.println("Boa tarde");
			}
			else {
				System.out.println("Boa Noite");
			}
		}
		sc.close();
		

	}

}
