package calculo_salarial;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new Scanner(System.in);
		
		
		int nf,horas;
		Double valor,total;
		System.out.println("Nº do funcionario:");
		nf= sc.nextInt();
		System.out.println("Valor atribuido por horas: R$");
		valor= sc.nextDouble();	
		System.out.println("Horas trabalhada:");
		horas= sc.nextInt();
		total=valor*horas;
		
		
		System.out.printf("Cod.Funcionario=%d \n Total a receber:R$%.2f",nf,total);
		
		sc.close();
		

	}

}
