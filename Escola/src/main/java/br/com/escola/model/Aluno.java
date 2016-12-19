package br.com.escola.model;

import br.com.escola.util.StringUtils;

/**
 * Aluno
 */
public class Aluno {

	private String nome;
	private Integer idade;
	private String identidade;
	private String cpf;
	private String email;
	private String telefone;
	private String celular;
	private Endereco endereco;
	private Turma turma;

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

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		if (StringUtils.isEmpty(identidade)) {
			return;
		}
		this.identidade = identidade;
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

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	// TODO implementar equals e hashCode (id)

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", identidade=" + identidade + ", cpf=" + cpf + ", email="
				+ email + ", telefone=" + telefone + ", celular=" + celular + ", endereco=" + endereco + ", turma="
				+ turma + "]";
	}	
}
