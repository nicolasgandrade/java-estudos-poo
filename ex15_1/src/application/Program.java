package application;

import java.util.Scanner;

import model.entities.Account;
import models.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Inicial balance: ");
		double balance = sc.nextDouble();
		sc.nextLine();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		sc.nextLine();
		
		Account ac = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter the amount for withdraw: ");
		double withdraw = sc.nextDouble();
		
		try {	
			
			ac.withdraw(withdraw);
			System.out.print("New balance: $");
			System.out.println(String.format("%.2f", ac.getBalance()));		
			
		}
		catch (DomainException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		finally {
			System.out.println("End of program");
		}
		
		
		sc.close();
		
	}

}
