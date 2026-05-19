package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Progam {

	public static void main(String[] args) throws ParseException {
		//C:\Users\User\OneDrive\Documentos\MyProjects\html-css\RonaldinhoGaucho//
	
		Scanner sc= new Scanner(System.in);
		
		List <Product> list = new ArrayList<> ();
		
		System.out.println("Entre com o caminho do arquivo: ");
		String archiveSorceStr = sc.nextLine();
		File archiveSouce = new File(archiveSorceStr);
		
		
		String folderSoucerstr = archiveSouce.getParent();
		
		boolean sucess = new File(folderSoucerstr + "\\out").mkdir();
		
		String targetFileStr = folderSoucerstr + "\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(archiveSorceStr))){
			String intemCsv = br.readLine();
			while( intemCsv != null) {
				String[] fields = intemCsv.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				intemCsv = br.readLine();
				
				list.add(new Product(name, price, quantity));
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				
				for(Product item: list) {
					bw.write(item.getNome() + "," + item.total());
					bw.newLine();
				}
			System.out.println(targetFileStr + "CRIADO!");
			}
			
			catch(IOException e){
				System.out.println("Algo deu errado" + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Deu pau, não consegui criar" + e.getMessage());
			
		}
		
		
	
		sc.close();
	}		
}
	