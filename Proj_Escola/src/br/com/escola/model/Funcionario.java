package br.com.escola.model;

// Classe funcionario
abstract class Funcionario {

	private String name;
	private int age;
	private float salary;
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String nam) {
		this.name=nam;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int ag){
		if (ag>0&&ag<120) {
			this.age=ag;
		}
	}
	
	public float getSalary(){
		return this.salary;
	}
	
	public void setAge(float sal) {
		this.salary=sal;
	}
	
}
