package qntd_divisivel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o Número:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			
			if(num%i==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
