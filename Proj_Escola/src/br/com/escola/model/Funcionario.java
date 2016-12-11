package br.com.escola.model;

import br.com.escola.utils.StringUtils;

/**
 * Funcionário genérico
 */
public abstract class Funcionario {

	private String nome;
	private Integer idade;
	private Cargo cargo;
	private Endereco endereco;
	private InfoContato contato;
	private Double salario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (StringUtils.isEmpty(nome)) {
			return;
		}
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		if (idade < 0 || idade > 150) {
			return;
		}
		this.idade = idade;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public InfoContato getContato() {
		return contato;
	}

	public void setContato(InfoContato contato) {
		this.contato = contato;
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
