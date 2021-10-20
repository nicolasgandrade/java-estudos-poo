package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		
		System.out.println("***METHOD2 START***");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int n = sc.nextInt();
			System.out.println(vect[n]);				
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			//LINHA DA AULA:
			e.printStackTrace();
			// Basicamente, sem o stack trace, o programa termina caso haja alguma exeção,
			//já com o stack trace, ele printa onde está o erro e o programa continua;
		}
		catch (InputMismatchException e) {
			System.out.println("Input Error");
		}
		
		sc.close();
		
		System.out.println("***METHOD2 END***");
	}
	
}
