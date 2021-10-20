package entities;

public class PessoaJuridica extends Contribuinte {	
	
	private Integer funcionarios;
	
	public PessoaJuridica() {		
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public Double imposto() {
		if (funcionarios <= 10) {
			return getRendaAnual() * 0.16;
		}
		else {
			return getRendaAnual() * 0.14;
		}
	}

	
}
