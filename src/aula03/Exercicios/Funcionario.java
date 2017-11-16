package aula03.Exercicios;

/*
 * Modele um funcionário. Ele deve ter o 
		•	nome do funcionário
		•	departamento onde trabalha 
		•	salário (double)
		•	data de entrada no banco (String)  
		•	seu RG (String)
		
		(opcional) Modifique seu método mostra para que ele imprima 
		o valor da dataDeEntrada daquele Funcionario

 */

public class Funcionario {
	
	private String nome;
	private String departamento;
	double salario;
	Data dataDeAdmissao;
	String numRG;
	
	void recebeAumento (double valor){
		this.salario += valor;
	}
	
	double calculaGanhoAnual() {
		return (this.salario * 12);
	}
	
	public void mostra() {
		System.out.println("Nome do Funcionário: " + this.getNome());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Salário atual: " + this.salario);
		System.out.println("Data de admissão:" + dataDeAdmissao.getFormatada());
		System.out.println("RG: " + this.numRG);
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}

