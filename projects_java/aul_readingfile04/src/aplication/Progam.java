package aplication;

import java.io.File;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho da pasta");
		
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("PASTAS:");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		System.out.println("Arquivos:");
		
		File[] files = path.listFiles(File::isFile);
		for(File file : files) {
			System.out.println(file);
		}
		 
		System.out.println("Entre com o nome da pasta que deseja criar:");
		String pastname = sc.next();
		boolean sucesso = new File (strPath + "\\%s".formatted(pastname)).mkdir();
		
		System.out.println("Pasta: %s foi criada com sucesso".formatted(pastname)+sucesso);
		
		
		
		sc.close();
	}

}
