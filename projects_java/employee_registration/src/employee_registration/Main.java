package employee_registration;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Quantos funcionarios vc deseja inserir??");
		int qtd=sc.nextInt();
		
		
		List<String> names= new ArrayList<>();
		
		List<Integer> numcode=new ArrayList<>();	
		
		List<Double> salary=new ArrayList<>();
		
		
		for (int i=0;i<qtd;i++) {
	System.out.println("Funcionario #"+i+1);
		sc.nextLine();
		System.out.println("Nome:");
		names.add(sc.nextLine());
		System.out.println("Id:");
		numcode.add(sc.nextInt());
		System.out.println("Salário:");
		salary.add(sc.nextDouble());
		
		}
		System.out.println("Digite o ID do funcionario que vc deseja alterar:");
		
		int id=sc.nextInt();
		
		if(numcode.contains(id)) {

			System.out.println("Id encontrado");
			int posicao = numcode.indexOf(id);
			System.out.println("o Fúncinariio coresponde a esse ID é: \n "+names.get(posicao)+","+numcode.get(posicao));
			System.out.println("\n Quantos % deseja aumentar do salario?? ");
			double porcem= sc.nextDouble();
			double posicsal=salary.get(posicao);
			double cont= posicsal+porcem;
			salary.add(posicao, cont);
			for(int i=0;i<names.size();i++) {
				names.get(i);
				numcode.get(i);
				salary.get(i);
				System.out.println("Lista dos funcionarios:\n");
				System.out.printf(" Nome:%s\n ID: %d\n  Salário:%.2fR$%n",names.get(i),numcode.get(i),salary.get(i));
				
			}
			
			
		}
		else {

			System.out.println("Id não existe");
		}
		
		
		sc.close();

	}

}