package cara;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("Digite o primeiro valor:");
	int n1,n2,resultado;
	n1 = sc.nextInt();
	System.out.println("Digite a proximo número");
	n2 = sc.nextInt();
	resultado= n1+n2;
	
	System.out.printf("Resultado de %d + %d= %d",n1,n2,resultado );

	sc.close();

	}

}
