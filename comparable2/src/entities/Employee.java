package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	//Esse método padrão do COmparable serve para comparar um objeto com outro.
	//Nesse caro está comparando um salário com outro para poder ordenar com o método sort no programa
	@Override
	public int compareTo(Employee other) {
		return salary.compareTo(other.getSalary());
	}
	
	//OBS: Para inverter, colocando do menor salário para o maior bata colocar um menos na frente de salary:
//	@Override
//	public int compareTo(Employee other) {
//		return salary.compareTo(other.getSalary());
//	}
	
	
}
