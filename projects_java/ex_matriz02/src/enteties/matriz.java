package enteties;

import java.util.Scanner;

public class matriz {
	Scanner sc=new Scanner(System.in);
	public int qtdlinha;
	public int qtdcoluna;
	public int linha;
	public int coluna;
	private int[][] mat; 
	
	public void cria_matriz() {
		mat = new int[qtdlinha][qtdcoluna];
		System.out.println("Digite os valores da matriz:");
		for(int i=0;i<qtdlinha;i++) {
			for(int j=0;j<qtdcoluna;j++) {
				
				mat[i][j]=sc.nextInt();
			}
		}
	}
	
	public int posicao() {
		if(linha>=0 && linha<qtdlinha && coluna>=0 &&coluna<qtdcoluna) {
			return mat[linha][coluna];
			
		}
		else {
			System.out.println("Cordenadas invalidas");
			return -1;
		}
		
	}
	
	public int emcima() {
				if(linha>0) {
					return mat[linha-1][coluna];
				}
				else {
					return-1;
				}
			}

	public int embaixo() {
				if(linha<qtdlinha-1) {
					return mat[linha+1][coluna];
				}
				else {
					return-1;
				}
			}
	public int esquerda() {
				if(coluna>0) {
					return mat[linha][coluna-1];
				}
				else {
					return-1;
				}
			}
	public int direita() {
				if(coluna<qtdcoluna-1) {
					return mat[linha][coluna+1];
				}
				else {
					return-1;
				}
			}

	
}
	
	
	
	
