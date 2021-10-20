package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		//Uma variável do tipo file pode ser tanto um caminho de arquivo ou de pasta
		File path = new File(strPath);
		
		//Lista todas as pastas que estão após esse caminho
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		sc.close();
	}

}
