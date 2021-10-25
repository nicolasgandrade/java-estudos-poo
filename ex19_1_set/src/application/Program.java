package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();
		
		// Course A
		System.out.print("How many students for course A? ");
		int students = sc.nextInt();
		
		for (int i=1; i<=students; i++) {
			System.out.println("Student's " + i + " code:");
			Integer id = sc.nextInt();
			
			set.add(id);
		}
		
		// Course B
		System.out.print("How many students for course A? ");
		students = sc.nextInt();
		
		for (int i=1; i<=students; i++) {
			System.out.println("Student's " + i + " code:");
			Integer id = sc.nextInt();
			
			set2.add(id);
		}
		
		// Course C
		System.out.print("How many students for course A? ");
		students = sc.nextInt();
		
		for (int i=1; i<=students; i++) {
			System.out.println("Student's " + i + " code:");
			Integer id = sc.nextInt();
			
			set3.add(id);
		}
		
		// Set total
		Set<Integer> setTotal = new HashSet<>();
		setTotal.addAll(set);
		setTotal.addAll(set2);
		setTotal.addAll(set3);
		
		System.out.println("Total students: " + setTotal.size());
		
		sc.close();
		
	}

}
