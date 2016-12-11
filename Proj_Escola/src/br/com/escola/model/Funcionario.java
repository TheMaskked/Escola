package br.com.escola.model;

/**
 * Funcionário da escola
 */
public abstract class Funcionario {
	
	private InfoContato infoContato;
	private Double salario;

	public InfoContato getInfoContato() {
		return infoContato;
	}
	
	public void setInfoContato(InfoContato contato) {
		this.infoContato = contato;
	}
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		if (salario <= 0) {
			return;
		}
		this.salario = salario;
	}
}