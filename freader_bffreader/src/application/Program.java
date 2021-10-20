package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		String path = "/home/nicolas/Documentos/read_file_java";
		FileReader fr = null;
		BufferedReader br = null;
		
		// Código poluído:
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			//Lê uma linha no arquivo, se estiver no final retorna l=null
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}  catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if ( br != null) {
				br.close();
			}
			if (fr != null) {
				fr.close();
			}
		}
		
	}

}
