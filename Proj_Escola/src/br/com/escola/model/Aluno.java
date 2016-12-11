package br.com.escola.model;

import br.com.escola.utils.StringUtils;

/**
 * Aluno
 */
public class Aluno {

	private InfoContato infoContato;
	private Turma turma;
	private String nomePai;
	private String nomeMae;

	
	
	public InfoContato getContato() {
		return infoContato;
	}

	public void setContato(InfoContato infoContato) {
		this.infoContato = infoContato;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		if (StringUtils.isEmpty(nomePai)) {
			return;
		}
		this.nomePai = nomePai;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		if (StringUtils.isEmpty(nomeMae)) {
			return;
		}
		this.nomeMae = nomeMae;
	}

	@Override
	public String toString() {
		return "Aluno [infoContato=" + infoContato + ", turma=" + turma + ", nomePai=" + nomePai + ", nomeMae="
				+ nomeMae + "]";
	}
}
