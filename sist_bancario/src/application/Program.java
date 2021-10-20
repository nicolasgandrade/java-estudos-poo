package application;

import java.util.Scanner;

import entitites.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Account ac;
		
		System.out.println("Enter account number: " );
		int accountNumber = sc.nextInt();
		
		System.out.println();
		System.out.println("Enter account holder: " );
		sc.nextLine();
		String accountHolder = sc.nextLine();
		
		System.out.println();
		System.out.println("Is there an initial deposit? (y/n): " );
		char boolDeposit = sc.nextLine().charAt(0);
		
		if (boolDeposit == 'y' || boolDeposit == 'y') {
			System.out.println("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			ac = new Account(accountNumber, accountHolder, initialDeposit);
		}
		else {
			System.out.println("Your initial amount is $00.00");
			
			ac = new Account(accountNumber, accountHolder);
		}
		
		System.out.println("Account data:");
		System.out.println(ac);

		System.out.println();
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		ac.increase(deposit);
		
		System.out.println("Acount data updated:");
		System.out.println(ac);
		
		System.out.println();
		System.out.println("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		ac.withdraw(withdraw);
		
		System.out.println("Acount data updated:");
		System.out.println(ac);
		
		sc.close();
		
	}

}
