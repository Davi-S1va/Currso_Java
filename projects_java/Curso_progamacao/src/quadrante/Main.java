package quadrante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("x=");
		int x=sc.nextInt();
		System.out.println("y=");
		int y=sc.nextInt();
		
		while(x!=0 && y!=0) {
			
			
			if(x>0 && y>0) {
				System.out.println("1º Quadrante");
			}
			else if(x<0 && y>0) {
				System.out.println("2º Quadrante");
	
			}
			else if(x<0 && y<0) {
				System.out.println("3º Quadrante");
			}
			else  {
				System.out.println("º4 Quadrante");
			}
			System.out.println("x=");
			x=sc.nextInt();
			System.out.println("y=");
			y=sc.nextInt();
			
		}
		
		sc.close();
		
		

	}

}
