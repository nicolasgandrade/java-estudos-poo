package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		String path = "/home/nicolas/Documentos/in";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//Lê o arquivo inteiro e guarda cada linha dentro da lista
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			
			//Ordena a lista em ordem alfabética
			Collections.sort(list);
			
			//Percorre a lista e printa cada nome em uma linha
			for (String s : list) {
				System.out.println(s);
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
				
	}

}
