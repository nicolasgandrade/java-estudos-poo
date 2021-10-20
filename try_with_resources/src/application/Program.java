package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		//Código mais limpo
		String path = "/home/nicolas/Documentos/read_file_java";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//Lê uma linha no arquivo, se estiver no final retorna null
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}  catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}

}
