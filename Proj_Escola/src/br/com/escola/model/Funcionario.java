package br.com.escola.model;
				
abstract class Funcionario {
	private int id;
	private float salary;
	private Cadastro cadastro;
		
	/* ---------------------------------\
	 * Pra gerar o ID do funcionario
	 * mas as ID's devem ser únicas
	 * então há um problema aqui a ser
	 * resolvido.
	\-----------------------------------*/
	
	Funcionario() {	
		this.id=(int)(Math.random())*1000;
	}
	public int getId(){
		return this.id;
	}
	public float getSalary(){
		return this.salary;
	}
	public void setAge(float sal) {
		this.salary=sal;
	}
}
