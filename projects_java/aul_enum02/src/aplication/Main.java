package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);

		SimpleDateFormat bd=new SimpleDateFormat("dd/MM/yyyy");
//Coleta de dados dos clientes
		System.out.println("Entre com os datos do cliente:");
		
		System.out.println("Nome:\n");
		System.out.println();
		String ClientName=sc.nextLine();
		
		System.out.println("Email:\n");
		String ClientEmail=sc.next();
		
		System.out.println("Data de aniversario\n");
		
		System.out.print("Formato da Data: (DD/MM/YYYY):\n");
		Date ClientBirth= bd.parse(sc.next());
		
		Client client= new Client(ClientName,ClientEmail,ClientBirth);
//		importa o modulo responsavel por guardar os dados do clinte

//coleta dados relacionado ao produto utilizando o modulo "Product" para armazenar
		System.out.println("Status do pedido");
		 OrderStatus status = OrderStatus.valueOf(sc.next());
		
		
		Order order = new Order(new Date(), status, client);

		
		
		System.out.println("Quantos itens serão adicionados?");
		int n =sc.nextInt();//Quantidade de produtos que serão cadastrados
		for (int i=1; i<=n; i++) {
			
			 System.out.println();
	            System.out.println("Dados do item #" + i + ":");
			
			System.out.println("Nome do produto:");
			String ProductName= sc.next();
			
			System.out.println("Preço do Produto: R$");
			Double ProductPrice=sc.nextDouble();
			
			System.out.println("Quantidade do Produto");
			int ProductQtd=sc.nextInt();
			
			
			Product product =new Product(ProductName,ProductPrice);
			OrderItem item=new OrderItem(ProductQtd, ProductPrice);
			
			order.addItem(item);
			
		}

	      System.out.println();
	        System.out.println(order);
		
		sc.close();
	}

}
