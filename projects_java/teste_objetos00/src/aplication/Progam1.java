package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Progam1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Rectangle x;
		x= new Rectangle();
		
		System.out.println("Enter rectangle width and heigt:");
		x.Width=sc.nextDouble();
		x.Height=sc.nextDouble();
		
		double areaX= x.area();
		double perimeterX= x.perimeter();
		double diagonalx= x.diagonal();
		
		System.out.println("Area="+areaX+"\nPerimeter"+perimeterX+"\nDiagonal="+diagonalx);
		
		
		
		sc.close();
		
		

	}

}
