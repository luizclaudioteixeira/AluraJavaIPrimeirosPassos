package aula05.exercicios;

/*
 * Adicione o modificador de visibilidade (private ou public, se necessário) para cada atributo e 
 * método da classe Funcionario. 
 * 
 * Tente criar um Funcionario no main e modificar ou ler um de seus atributos privados. 
 * O que acontece?

 */

public class Funcionario {
	
	// Aributos de Classe
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeAdmissao;
	private String numRG;
	
	// Getters and Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setDataDeAdmissao(Data dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	public Data getDatadeAdmissao() {
		return this.dataDeAdmissao;
	}
	
	public void setNumRG(String numRG) {
		this.numRG = numRG;
	}
	
	public String getNumRG() {
		return this.numRG;
	}
	
	public double getGanhoAnual() {
		return (this.salario * 12);
	}
	
	
	// Outros métodos da classe
	public void recebeAumento (double valor){
		this.salario += valor;
	}
	
	public void mostra() {
		System.out.println("Nome do Funcionário: " + this.getNome());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Salário atual: " + this.salario);
		System.out.println("Data de admissão:" + dataDeAdmissao.getFormatada());
		System.out.println("RG: " + this.numRG);
	}
	
}

