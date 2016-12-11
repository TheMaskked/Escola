package br.com.escola.model;

//TODO to implementando ainda...
public class Professor extends Funcionario {
	
	private String subject;
	private Integer workload;
	private String sector;
	private String formation;
	
	public Professor(String nome, Integer idade, Cargo cargo, Endereco endereco, InfoContato contato, Double salario) {
		setNome(nome);
		setIdade(idade);
		setCargo(cargo);
		setEndereco(endereco);
		setContato(contato);
		setSalario(salario);
	}
	
	public String getSubject(){
		return subject;
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
}
