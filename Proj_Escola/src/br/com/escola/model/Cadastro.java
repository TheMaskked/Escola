package br.com.escola.model;

class Cadastro {
	private String name;
	private int age;
	private String gender;
	private String adress;
	private String number;
	 
	public String getName(){
		return this.name;
	}
	public void setName(String nam){
		this.name=nam;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int ag){
		if (ag>0&&ag<80) {
			this.age=ag;
		}
	}
	public String getGender(){
		return this.gender;
	}
	public void setGender(int gen){

		switch (gen) {
		case 1:
			this.gender="Masculino";
			break;
		case 2:
			this.gender="Feminino";
			break;
		default:
			this.gender="Outro";
		}
	}
	public String getAdress() {
		return this.adress;
	}
	public void setAdress(String adrs){
		this.adress=adrs;
	}
	public int getNumber() {
		return Integer.parseInt(this.number);
	}
	public void setNumber(String num){
		if (num.length()>=8) {
			this.number=num;
		}
	}

}

