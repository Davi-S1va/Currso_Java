package senha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a senha:");
		int senha= sc.nextInt();
		while (senha!= 2200) {
			
			System.out.println("Senha invalida");
			senha=sc.nextInt();
			
		}
		System.out.println("Acesso permitido");
		sc.close();
		
	}

}
