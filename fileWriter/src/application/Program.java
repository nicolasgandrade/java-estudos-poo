package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] { "Bom dia", "Boa tarde"};
		
		String path = "/home/nicolas/Documentos/read_file_java";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); //quebra de linha
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
