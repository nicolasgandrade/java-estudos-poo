package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.enums.OrderStatus;
import entities.Customer;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

		//Customer data
		System.out.println("Enter customer's data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date: ");
		String birthDate = sc.next();
		sc.nextLine();
		Date bd = sdf2.parse(birthDate);

		//Customer
		Customer customer = new Customer(name, email, bd);
		System.out.println(customer);

		//Order data
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		OrderStatus os = OrderStatus.valueOf(status);
		System.out.print("How many products to this order? ");
		int items = sc.nextInt();
		sc.nextLine();

		Order newOrder = new Order(new Date(), os, customer);

		for (int i=0; i<items; i++) {
			System.out.println("Enter #" + (i+1) +" item data:");
			System.out.print("Product Name: ");
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			Double pPrice = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantity: ");
			Integer pQuantity = sc.nextInt();
			sc.nextLine();

			//Create new OrderItem
			Product item = new Product(pName, pPrice);

			OrderItem oi = new OrderItem(pQuantity, pPrice, item);
			
			newOrder.addItem(oi);
		}
		
		System.out.println();
		System.out.println(newOrder);
		
		sc.close();
		
		
	}

}


 /*
  * Infos adicionais:
 * 90% do programa foi feito sem consultar a resolução do exercício, acabei tendo que olhar apenas na hora
 * de construir o toString() com sb da classe Order. 
 * Exercício legal pra treinar, feliz com o resultado :)
 */




