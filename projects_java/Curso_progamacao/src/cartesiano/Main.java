package cartesiano;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		System.out.println("Insira:");
		double x,y;
		System.out.println("x=");
		x=sc.nextDouble();
		System.out.println("y=");
		y=sc.nextDouble();
		System.out.printf("X= %.2f \n Y= %.2f",x,y);

		sc.close();
		
		
	
		

	}

}
