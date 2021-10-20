package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de contribuintes: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Contribuinte #" + i + " data:");
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
				int funcionarios = sc.nextInt();
								
				list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
			
		}
		
		double sum = 0;
		
		System.out.println();
		for (Contribuinte cont : list) {
			double imposto = cont.imposto();
			System.out.println(cont.getNome()
					+ ": $"
					+ imposto);
			
			sum += imposto;
						
		}
		
		System.out.printf("Total de imposto: $" + String.format("%.2f", sum));
		
		sc.close();
		
	}

}
