package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entites.enums.OrderStatus;

public class Order {

	//Atributos
	private Date moment;
	private OrderStatus status;
	private Customer customer;
	
	//Lista
	List<OrderItem> list = new ArrayList<>();
	
	//Date
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	//Construtores
	public Order() {		
	}
	
	public Order(Date moment, OrderStatus status, Customer customer) {
		this.moment = moment;
		this.status = status;
		this.customer = customer;
	}

	//Getter and Setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	//Métodos
	public void addItem(OrderItem item) {
		list.add(item);
	}
	
	public void removeItem(OrderItem item) {
		list.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for (OrderItem o : list) {
			sum += o.subTotal();
		}
		return sum;
	}
	
	//To string
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(customer + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : list) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	
	
}
