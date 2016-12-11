package br.com.escola.model;

import java.util.List;

/**
 * Professor
 */
public class Professor extends Funcionario {
	/**
	 * Enum das disciplinas disponíves
	 */
	public enum Disciplina {
		PORTUGUES, MATEMATICA, HISTORIA, BIOLOGIA, 
		QUIMICA, FISICA, INGLES, ESPANHOL, GEOGRAFIA, 
		EDUCACAO_FISICA, INFORMATICA, FILOSOFIA, SOCIOLOGIA;
	}

	private Disciplina disciplina;
	private List<Turma> turmas;

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

	@Override
	public String toString() {
		return "Professor [disciplina=" + disciplina + ", turmas=" + turmas + ", nome=" + getNome()
				+ ", idade=" + getIdade() + ", identidade()=" + getIdentidade() + ", CPF=" + getCpf()
				+ ", e-mail()=" + getEmail() + ", telefone()=" + getTelefone() + ", celular()=" + getCelular()
				+ ", endereco()=" + getEndereco() + ", salario()=" + getSalario() + "]";
	}
}
