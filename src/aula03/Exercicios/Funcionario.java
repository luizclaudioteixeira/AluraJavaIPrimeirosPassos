package aula03.Exercicios;

/*
 * Modele um funcion�rio. Ele deve ter o 
		�	nome do funcion�rio
		�	departamento onde trabalha 
		�	sal�rio (double)
		�	data de entrada no banco (String)  
		�	seu RG (String)
		
		(opcional) Modifique seu m�todo mostra para que ele imprima 
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
		System.out.println("Nome do Funcion�rio: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Sal�rio atual: " + this.salario);
		System.out.println("Data de admiss�o:" + dataDeAdmissao.getFormatada());
		System.out.println("RG: " + this.numRG);
	}
}

