import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*Exercício de sintaxe switch case*/
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		
		System.out.println("Hoje é " + dia);
		
		sc.close();
		
	}

}
