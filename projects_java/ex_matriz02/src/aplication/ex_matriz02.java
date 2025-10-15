package aplication;

import java.util.Scanner;

import enteties.matriz;

public class ex_matriz02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		matriz m=new matriz();
		System.out.println("Digite a quantidade de linha:");
		m.qtdlinha=sc.nextInt();
		System.out.println("Digite a quantidade de colunas:");
		m.qtdcoluna=sc.nextInt();
		
		m.cria_matriz();
		System.out.println();
		System.out.print("Digite a linha e a coluna que deseja acessar:");
		m.linha=sc.nextInt();
		m.coluna=sc.nextInt();
	
		int valor=m.posicao();
		if(valor!= -1) {

			System.out.println("Posição:"+m.posicao());
			System.out.println("Posição em cima:"+m.emcima());
			System.out.println("Posição em baixo:"+m.embaixo());
			System.out.println("Posição esquerda:"+m.esquerda());
			System.out.println("Posição direita:"+m.direita());	
		}
		else {
			System.out.println();
		}
				sc.close();
		
		
		
	}

}
