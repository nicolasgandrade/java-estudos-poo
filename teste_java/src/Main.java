import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 10;
		double x = 0.876736;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); /* O número 2 no parâmetro %.2f%n serve para
		delimitar o número de casas decimais para 2;
		
		Perceba também que ele transformou o separador . em , isso ocorreu pois o 
		printf utiliza com padrão o idioma do computador que está sendo usado para 
		compilar; 
		
		Para mudar esse separador para ponto, vamos chamar o seguinte comando:
		*/
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x); 
		/* Aqui, após a chamada do Locale, ele já converteu
		o separador para . */
		
		
		
		/* CONCATENAÇÃO: */
		System.out.println("Resultado de x: " + x + "km");
		
		//Concatenando com printf:
		System.out.printf("Resultado de x: %.2f km%n", x); // %n = quebra de linha
		
		// Interpolação de dados na string:
		String nome = "Maria"; // %s = string
		int idade = 23; // %d = int
		double renda = 4000.0; // %f = float
		System.out.printf("%s tem %d anos e ganha R$%.2f por mês.", nome, idade, renda);
		
		
	}

}
