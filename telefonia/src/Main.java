import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* Exercício:
		 * Uma empresa de telefonia cobra R$50,00 a cada 100 minutos de ligação telefônica.
		 * A cada minuto ultrapassado do plano, há um acréscimo de 2 reais no valor
		 * final passado ao cliente.
		 * Calcule quando um cliente pagará se utilizar o valor digitado no console
		 * de minutos.
		 * 
		 * Exercício básico para treinar sintaxe */
		
		Scanner sc = new Scanner(System.in);
		
		int minutes = sc.nextInt();
		
		double bill = 50.0;
		
		if (minutes > 100) {
			bill += (minutes - 100) * 2;
		}else {
			bill = 50;
		}
		
		System.out.printf("O valor a pagar é de: R$%.2f", bill);
		
		
		sc.close();
		
	}

}
