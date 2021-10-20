package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		/* POLIMORFISMO */
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		/*RESUMO:
		 * Realiza-se a mesma operação com variáveis de mesmo tipo, entretanto, intancia-se
		 * classes diferentes, ou seja, com operações diferentes.
		 * Se uma variável de tipo Account instancia a classe SavingsAccount que possui um 
		 * método diferente da classe Account, esta variável é capaz de realizar coisas que 
		 * a segunda classe (SavingsAccount) realiza sem mudar o seu tipo.
		 * Isso é Polimorfismo.*/
		
	}

}
