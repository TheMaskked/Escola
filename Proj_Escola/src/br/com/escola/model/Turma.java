package br.com.escola.model;

import java.util.List;

import br.com.escola.utils.StringUtils;

/**
 * Turma
 */
public class Turma {

	private String serie;
	private List<Aluno> alunos;

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		if (StringUtils.isEmpty(serie)) {
			return;
		}
		this.serie = serie;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Turma [serie=" + serie + ", alunos=" + alunos + "]";
	}	
}
