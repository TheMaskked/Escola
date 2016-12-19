package br.com.escola.model;

import br.com.escola.util.StringUtils;

/**
 * Funcionário da escola
 */
public class Funcionario {
	/**
	 * Cargos disponíveis
	 */
	public enum Cargo {
		DIRETOR, PEDAGOGO, PSICOLOGO, BIBLIOTECARIO, ASSISTENTE_SOCIAL, COZINHEIRO, FAXINEIRO;
	}

	private String nome;
	private Integer idade;
	private String rg;
	private String cpf;
	private String email;
	private String telefone;
	private String celular;
	private Endereco endereco;
	private Cargo cargo;
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
		if (idade <= 0 || idade > 150) {
			return;
		}
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		if (StringUtils.isEmpty(rg)) {
			return;
		}
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (StringUtils.isEmpty(cpf)) {
			return;
		}
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (StringUtils.isEmpty(email)) {
			return;
		}
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (StringUtils.isEmpty(telefone)) {
			return;
		}
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		if (StringUtils.isEmpty(celular)) {
			return;
		}
		this.celular = celular;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
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
	
	//TODO implementar equals e hashCode (id)

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", rg=" + rg + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone + ", celular=" + celular + ", endereco=" + endereco
				+ ", cargo=" + cargo + ", salario=" + salario + "]";
	}
}