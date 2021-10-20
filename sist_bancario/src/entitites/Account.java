package entitites;

public class Account {
	
	//Atributos
	private int accountNumber;
	private String accountHolder;
	private double amount;
	private double tax = 5.00;
	
	//Construtor
	public Account(int accountNumber, String accountHolder, double amount) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.amount = amount;
	}
	
	//Sobrecarga
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	
	//Getters and Setters	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		if (accountNumber == 0) {
			this.accountNumber = accountNumber;
		}
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double increase(double increase) {
		return amount += increase;
	}
	
	public double withdraw(double withdraw) {
		return amount = amount - withdraw - tax;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ accountHolder
				+ ", Balance: "
				+ amount;
	}
	
	
	
}
