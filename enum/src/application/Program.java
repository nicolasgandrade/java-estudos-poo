package application;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Order order = new Order(100, new Date(), OrderStatus.PENDING_PAYMENTS);

		System.out.println(order);
		
		//Instanciando normalmente o status DELLIVERED
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		//Transformando a string "DELIVERED" em instância do status (usa-se o valueOf)
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		//Ainda instanciando utilizando value of, mas dessa vez com input de usuário
		String status = sc.nextLine();
		OrderStatus os3 = OrderStatus.valueOf(status);
		
		System.out.println(os1);
		System.out.println(os2);
		
		
	}

}
