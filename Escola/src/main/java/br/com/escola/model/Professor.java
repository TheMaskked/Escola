package br.com.escola.model;

import java.util.List;

import br.com.escola.util.StringUtils;

/**
 * Professor
 */
public class Professor {
	/**
	 * Disciplinas disponíves
	 */
	public enum Disciplina {
		PORTUGUES, MATEMATICA, HISTORIA, BIOLOGIA, QUIMICA, FISICA, INGLES, ESPANHOL, GEOGRAFIA, EDUCACAO_FISICA, INFORMATICA, FILOSOFIA, SOCIOLOGIA;
	}

	private String nome;
	private Integer idade;
	private String rg;
	private String cpf;
	private String email;
	private String telefone;
	private String celular;
	private Endereco endereco;
	private Double salario;
	private Disciplina disciplina;
	private List<Turma> turmas;

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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		if (salario <= 0) {
			return;
		}
		this.salario = salario;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	// TODO implementar equals e hashCode (id)
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", idade=" + idade + ", rg=" + rg + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone + ", celular=" + celular + ", endereco=" + endereco
				+ ", salario=" + salario + ", disciplina=" + disciplina + ", turmas=" + turmas + "]";
	}	
}
