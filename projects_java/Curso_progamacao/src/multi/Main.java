package multi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um numero que desja saber a tabuada");
		int num_1=sc.nextInt();
		
		for(int i=1;i<11;i++) {
			
			if(num_1>0) {
				int conta=num_1*i;
				System.out.println(num_1+"X"+i+"="+conta);
			}
			sc.close();
		}
		
		
		
		

	}

}
