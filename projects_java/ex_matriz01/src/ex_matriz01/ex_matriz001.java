package ex_matriz01;

import java.util.Scanner;

public class ex_matriz001 {

	public static void main(String[] args) {
		
		System.out.println("Quantos números de linhas e colunas desja digitar?");
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int[][]mat= new int[n][n];
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Os Valores da diagonal são:");
		
		for(int i=0;i<n;i++) {
			System.out.print(mat[i][i]+" ");
		}
	
		int count=0;
		
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]<0) {
					count++;
				}
					
			}
		}
		int posicao=sc.nextInt();
		System.out.println("Total de números neativos na matriz:"+count);
		for (int i=0;i<n;i++) {
			System.out.print(mat[posicao][posicao]+" ");
		}
			
		 
		sc.close();

	}

}
