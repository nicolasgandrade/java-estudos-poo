package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter the width of your rectangle: ");
		rectangle.width = sc.nextDouble();
		System.out.println("Enter the height of your rectangle: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println("Area: " + rectangle.area());
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.printf("Diagonal: %.2f", rectangle.diagonal());

		
	}

}
