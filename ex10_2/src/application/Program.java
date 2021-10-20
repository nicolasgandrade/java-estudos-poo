package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Id:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Salary:");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			Employee emp = new Employee(name, id, salary);
			
			list.add(emp);
		}
		
		System.out.println("Enter the employee id that will have the salary increased:");
		int idInc = sc.nextInt();
		sc.nextLine();
		
		Integer pos = position(list, idInc);
		
		if (pos == null) {
			System.out.println("This id does not exist");
		}
		else {
			System.out.println("Enter the percentage to increase in it's salary:");
			double incPercentage = sc.nextDouble();
			sc.nextLine();
			
			list.get(pos).increaseSalary(incPercentage);
		}
		
		System.out.println();
		System.out.println("Employees list:");
		
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
		
	}
	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			
			//O .get(i) seleciona o elemento na posição i;
			/*Ele encontrou o método getId() porque a classe Employee foi importada lá 
			 * em cima e ele está pegando os métodos de Employee pois essa classe foi
			 * adicionada como tipo de parâmetro nesse método que estamos;*/
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
