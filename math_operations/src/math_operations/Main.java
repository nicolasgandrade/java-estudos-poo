package math_operations;

public class Main {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		// Calculando a raiz (sqrt);
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raíz quadrada de " + x + " = " + A);
		System.out.println("Raíz quadrada de " + y + " = " + B);
		System.out.println("Raíz quadrada de 25 = " + C);
		
		// Elevando (pow - de power);
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		// Valor absoluto/módulo (abs);
		A = Math.abs(y);
		B = Math.abs(x);
		System.out.println("Módulo de " + y + " = " + A);
		System.out.println("Módulo de " + x + " = " + B);
		
	}

}
