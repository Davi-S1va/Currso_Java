package diferenca;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		;
		int a,b,c,d,diferenca;
		System.out.println("Digite o Primeiro número:");
		a= sc.nextInt();
		System.out.println("Digite o Segundo número:");
		b= sc.nextInt();
		System.out.println("Digite o Terceiro número:");
		c= sc.nextInt();
		System.out.println("Digite o Quarto número:");
		d= sc.nextInt();
		
		diferenca=a * b - c * d;
		System.out.printf("A diferença entre %d,%d,%d,%d é de %d",a,b,c,d,diferenca);
		
		sc.close();
		

	}

}
