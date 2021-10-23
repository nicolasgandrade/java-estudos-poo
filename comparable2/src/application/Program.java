package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

//Vai ler um arquivo csv (separado por vírgulas)

public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		String path = "/home/nicolas/Documentos/in2";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//Lê o arquivo inteiro e guarda cada linha dentro da lista
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				
				//Cria um vetor de elementos com base no separador vírgula no arquivo 
				String[] fields = employeeCsv.split(",");
				
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			
			//Ordena a lista em ordem alfabética
			Collections.sort(list);
			
			//Percorre a lista e printa cada nome em uma linha
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
				
	}

}
