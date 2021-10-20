package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		//Instanciando uma nova lista:
		List<String> list = new ArrayList<>();
		
		//Inserindo elementos em ordem padão
		list.add("Nicolas");
		list.add("Maria");
		list.add("Pedro");
		list.add("Bob");
		list.add("João");
		
		//Adicionando dado em posição específica
		list.add(1, "Guilherme");
		
		//Remoção de dado
		list.remove("Bob");
		
		//Remoção por predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		
		//Mostrando o tamanho da lista (qtd. de elementos)
		System.out.println(list.size());
		
		//Laço for each	
		for (String nome : list) {
			System.out.println(nome);
		}
		
		//Posição de dado
		System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
		System.out.println("Index of Marco (inexistente): " + list.indexOf("Marco"));
		//Perceba que nesse caso retorna -1;
		
		System.out.println();
		
		//Filtrando a lista:
		//Primeiro converte-se para stream¹, depois faz-se a operação lambda desejada², e então volta-se de stream para lista³ 
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
			
		}

		System.out.println();
		
		//Encontrando o primeiro elemento que atenda ao predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'N').findFirst().orElse(null);
		
		System.out.println(name);
	}

}
