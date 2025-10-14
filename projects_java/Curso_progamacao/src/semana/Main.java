package semana;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.printf("Digite o dia da semana:");
		
		int entrada= sc.nextInt();
		String dia;
		
		if(entrada==1) {
			dia="Domingo";
		}
		else if(entrada==2) {
			dia="Segunda";
			
		}
		else if(entrada==3){
			dia="Terça";
		}
		else if(entrada==4) {
			dia="Quarta";
		}
		else if(entrada==5) {
			dia="Quinta";
		}
		else if(entrada==6) {
			dia="Sexta";
		}
		else if(entrada==7){
			dia="Sabado";
		}
		else {
			dia="valor Invalido";
		}
			
		System.out.printf("Dia da semana:"+dia);
		sc.close();
	}

}
