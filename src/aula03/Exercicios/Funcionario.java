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
	
	String nome;
	String departamento;
	double salario;
	Data dataDeAdmissao;
	String numRG;
	
	void recebeAumento (double valor){
		this.salario += valor;
	}
	
	double calculaGanhoAnual() {
		return (this.salario * 12);
	}
	
	void mostra() {
		System.out.println("Nome do Funcionário: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário atual: " + this.salario);
		System.out.println("Data de admissão:" + dataDeAdmissao.getFormatada());
		System.out.println("RG: " + this.numRG);
	}
}

