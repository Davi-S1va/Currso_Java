package geometria;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		java.util.Scanner sc = new Scanner(System.in);
				
		
	
		
		
		System.out.println("Insira o Primeiro valor (Base):");
		

		Double a = sc.nextDouble();
		System.out.println("Insira o Segundo valor:");
		Double b = sc.nextDouble();
		
		System.out.println("Insira o Terceiro valor(Altura):");
		Double c = sc.nextDouble();
		
		System.out.printf("os valores são: %.2f, %.2f, %.2f %n",a,b,c);
		
		
		Double triangulo= a*c/2;
		System.out.printf("Triangulo:%.4f \n",triangulo); //triangulo
		
		Double circulo=c*c*3.14159;
		System.out.printf("Circolo:%.4f \n",circulo);//Circolo
		
		Double trapezio1= (a+b)*c;
		Double trapezio2=trapezio1/2;
		System.out.printf("Trapezio:%.4f \n",trapezio2);//trapezio
		
		Double quadrado=b*b;
		System.out.printf("Quadrado: %.2f \n",quadrado);//quadrado
		
		Double retangulo= a*b;
		System.out.printf("Retangulo %.4f \n",retangulo);//retangulo
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
