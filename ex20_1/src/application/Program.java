package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			List<Employee> list = new ArrayList<>();
			
			while (line != null) {
				
				String[] vect = line.split(",");
				list.add(new Employee(vect[0], vect[1], Double.parseDouble(vect[2])));
				line = br.readLine();
				
			}
			
			/**Transforma a lista de employees em stream;
			 * Filtra os dados pela regra aplicada;
			 * Utiliza o map para pegar o email a partir do getEmail de todos os elementos;
			 * Ordena em ordem alfabética;
			 * utiliza o collect para transformar o stream novamente em lista;*/
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + " :");
			emails.forEach(System.out::println);
			
			//Calcula a soma do salário de quem começa com a letra M
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
