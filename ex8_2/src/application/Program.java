package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter the employeer's name: ");
		employee.name = sc.nextLine();
		System.out.println("Enter the employeer's gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Enter the amount of taxes: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Name: " + employee.name);
		System.out.println("Gross Salary: " + employee.grossSalary);
		System.out.println("Tax: " + employee.tax);
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.println("Wich percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increase(percentage);
		
		System.out.println("Updated data: " + employee);
		
	}

}
