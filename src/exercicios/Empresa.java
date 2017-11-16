package exercicios;

import aula03.Exercicios.Funcionario;

/*
 *	Crie uma classe Empresa. A Empresa tem um nome, cnpj e uma referência a uma array de Funcionario, 
 *	além de outros atributos que você julgar necessário.
 */

// Classe Empresa
public class Empresa {
	
	String nome;
	String cnpj;
	Funcionario[] arrayDefuncionarios;
	int posiçãoLivre = 0;
	
	/*
	 * A Empresa deve ter um método adicionar, que recebe uma referência a Funcionario como argumento 
	 * e guarda esse funcionário.
	 */
	
	void adicionar(Funcionario f){
		this.arrayDefuncionarios[posiçãoLivre] = f;
		this.posiçãoLivre++;
	}
	
}


	