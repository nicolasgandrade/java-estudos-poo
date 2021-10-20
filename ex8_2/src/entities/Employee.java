package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double salary() {
		return grossSalary - tax;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", salary());
	}
	
	public void increase(double percentage) {
		grossSalary += grossSalary * percentage / 100; 
	}
}
