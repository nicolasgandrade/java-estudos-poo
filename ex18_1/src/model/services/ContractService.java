package model.services;

import model.entities.Contract;

public class ContractService {

	private PaymentService paymentService;
	
	public ContractService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
	}
	
}
