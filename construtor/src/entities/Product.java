package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	//Construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga (construtor semelhante e de mesmo nome, porém com atributos diferentes 
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		//o quantity inicia com 0
	}
	
	public double totalValueInStock() {		
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		//o this acessa o quantity atributo lá de cima; o segundo quantity é parâmetro;
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, total $"
				+ String.format("%.2f", totalValueInStock());
	}
}
