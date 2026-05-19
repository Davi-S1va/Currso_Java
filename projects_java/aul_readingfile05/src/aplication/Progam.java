package aplication;

import java.io.File;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Entre com o nome da pasta: ");
		String strPasta = sc.nextLine();
		
		File path = new File(strPasta);
		
		System.out.println("O nome da pasta: " + path.getName());
		
		System.out.println("O caminho da pasta " + path.getParent());
	
		System.out.println("O caminho COMPLETO da pasta " + path.getPath());
		
		
		sc.close();
	}

}
