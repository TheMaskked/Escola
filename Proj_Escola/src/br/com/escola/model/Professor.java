package br.com.escola.model;

public class Professor extends Funcionario {
	private String subject;
	private Integer workload;
	private String sector;
	private String formation;
	private String email;
	
	public String getSubject(){
		return subject;
	}
	public void setSubject(String opt){
		switch (opt) {
		case "POR": this.subject="Portugu�s";
		case "MAT": this.subject="Matem�tica";
		case "HIS": this.subject="Hist�ria";
		case "BIO": this.subject="Biologia";
		case "QUI": this.subject="Qu�mica";
		case "ING": this.subject="Ingl�s";
		case "GEO": this.subject="Geografia";
		case "EDF": this.subject="Educa��o F�sica";
		case "INF": this.subject="Inform�tica";
		case "FIL": this.subject="Filosofia";
		case "SOC": this.subject="Biologia";
		default: 	this.subject="Outro";
		}
	}
	public Integer getWorkload() {
		return this.workload;
	}
	public void setWorkload(Integer workld){
		this.workload=workld;
	}
	public String getSector() {
		return this.sector;
	}
	public void setSector(String sec){
		this.sector=sec;
	}
	public String getFormation() {
		return this.formation;
	}
	public void setFormation(String form){
		this.formation=form;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String em){
		this.email=em;
	}
	
}
