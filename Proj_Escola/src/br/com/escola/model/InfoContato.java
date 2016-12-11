package br.com.escola.model;

import br.com.escola.utils.StringUtils;

/**
 * Informações de contato
 */
public class InfoContato {

	private String email;
	private String telefone;
	private String celular;
	
	public InfoContato(String email, String telefone, String celular) {
		setEmail(email);
		setTelefone(telefone);
		setCelular(celular);
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

	@Override
	public String toString() {
		return "InfoContato [email=" + email + ", telefone=" + telefone + ", celular=" + celular + "]";
	}
}
