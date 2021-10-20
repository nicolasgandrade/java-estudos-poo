package model.entities;

import models.exceptions.DomainException;

public class Account {
	
	//Atributes
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	//Construtors
	public Account() {		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	//Getters and setters
	public Integer getNumber() {
		return number;
	}
	
	public Integer setNumber(Integer number) {
		return this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	//Methods
	public Double deposit(Double amount) {
		return balance += amount;
	}
	
	public Double withdraw(Double amount) throws DomainException {
		
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		else if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		else {
			return balance -= amount;
		}
		
	}
	
}
