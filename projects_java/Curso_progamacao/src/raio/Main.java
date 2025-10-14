package raio;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio");
		
		
		Double raio,conta,pi= 3.14159;
		raio=sc.nextDouble();
		conta=pi*raio*raio;

		
		System.out.printf("A área do raio: %.2f é \n Área= %.4f",raio,conta);
		
		sc.close();

	}

}
