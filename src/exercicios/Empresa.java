package exercicios;

import aula03.Exercicios.Funcionario;

/*
 *	Crie uma classe Empresa. A Empresa tem um nome, cnpj e uma refer�ncia a uma array de Funcionario, 
 *	al�m de outros atributos que voc� julgar necess�rio.
 */

// Classe Empresa
public class Empresa {
	
	String nome;
	String cnpj;
	Funcionario[] arrayDefuncionarios;
	int posi��oLivre = 0;
	
	/*
	 * A Empresa deve ter um m�todo adicionar, que recebe uma refer�ncia a Funcionario como argumento 
	 * e guarda esse funcion�rio.
	 */
	
	void adicionar(Funcionario f){
		this.arrayDefuncionarios[posi��oLivre] = f;
		this.posi��oLivre++;
	}
	
}


	