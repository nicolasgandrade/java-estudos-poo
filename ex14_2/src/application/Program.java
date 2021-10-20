package application;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			if (ch == 'c') {
				list.add(new Product(name, price));
			}
			else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}
			else if (ch == 'i') {
				System.out.print("Customs free: ");
				Double customsFree = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFree));
			}
			
		}
		
		System.out.println();
		System.out.println("Price Tags:");
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
		
	}

}
