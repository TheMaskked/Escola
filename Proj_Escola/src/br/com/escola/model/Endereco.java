package br.com.escola.model;

import br.com.escola.utils.StringUtils;

/**
 * Endereço
 */
public class Endereco {

	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private Integer numero;
	private String cep;

	public Endereco(String estado, String cidade, String bairro, String rua, Integer numero, String cep) {
		setEstado(estado);
		setCidade(cidade);
		setBairro(bairro);
		setRua(rua);
		setNumero(numero);
		setCep(cep);
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (StringUtils.isEmpty(estado)) {
			return;
		}
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (StringUtils.isEmpty(cidade)) {
			return;
		}
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if (StringUtils.isEmpty(bairro)) {
			return;
		}
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		if (StringUtils.isEmpty(rua)) {
			return;
		}
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		if (numero < 0) {
			return;
		}
		this.numero = numero;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		if (StringUtils.isEmpty(cep)) {
			return;
		}
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero="
				+ numero + ", cep=" + cep + "]";
	}
}
