package ex_matriz03;


import java.util.Scanner;

public class aplication {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("insira a quantidade do linha");
	 int qtd_linha=sc.nextInt();
	 System.err.println("Insira a quantidade de coluna");
	 int qtd_coluna=sc.nextInt();
	 
	 int[][] mat=new int[qtd_linha][qtd_coluna];
	 
	 for(int i=0; i<qtd_linha;i++) {
		 for(int j=0; j< qtd_coluna; j++) {
			 mat[i][j]=sc.nextInt();
		 }
	 }
	 
	//Posição da linha
	 int posicao=sc.nextInt();
	 int [] [] onepc_linha= new int[0] [0];
	 int [] [] twopc_linha= new int[0] [0];


	 for(int i=0; i<qtd_linha; i++){
	          //IndexOf 1° aparição 
		  	 mat.indexOf(posicao);

	         // IndexOf 2° aparição 


	 sc.close();
	}

}
