package entities;

public class BusinessAccount extends Account{
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		//Chama a super classe (classe Account)
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.00;			
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount); //Realiza a ação como na classe pai;
		balance -= 2.0; //Ação que só ocorre para a BusinessAccount;
	}
	
}
