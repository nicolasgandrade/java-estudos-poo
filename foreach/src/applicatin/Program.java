package applicatin;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] {"Nicolas", "João", "Maria"}; /*Isso instancia
		o array com 3 valores */
		
		//FOR EACH (para cada objeto "nome" contido no vetor "vect", faça:) - utiliza-se ":";
		for (String nome : vect) {
			System.out.println(nome);
		}
		
	}

}
