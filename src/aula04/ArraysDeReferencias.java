package aula04;

import aula03.Conta;

public class ArraysDeReferencias {

	public static void main(String[] args) {
		
		Conta[] minhasContas;						// Criando um array para Contas
		minhasContas = new Conta[10];
				
													/*
													 * 	Nenhum objeto conta foi criado aqui, 
													 * 	pois n�o h� nenhum new Conta();
													 * 	Foram criadas 10 posi��es que podem guardar 
													 * 	refer�ncias para objetos Conta.
													 * 	At� aqui eles n�o apontam para lugar algum. 
													 * 	S�o refer�ncias nulas (null).
													 */
				
				
				
		//System.out.println(minhasContas[0].getSaldo()); 
																	
													/* Tentando acessar o conte�do de uma 
														posi��o que n�o aponta para nada 
														(null) */
																	
				
													/*
													 * 	Ocorre um erro de execu��o. 
													 * 	Na primeira posi��o do array n�o 
													 * 	h� refer�ncia paralugar algum.
													 *  O array deve ser populado com 
													 *  novas contas antes.
													 */	
																	
			
		Conta novaConta = new Conta();				// Criado um objeto tipo Conta;
		novaConta.setSaldo(1000); 
		
		minhasContas[0] = novaConta;				// Agora a posi��o [0] aponta para um objeto tipo Conta
	
													/* OBS >> Um array de tipos primitivos guarda VALORES. 
													 * Um array de objetos guarda REF�NCIAS. */
				
				
		minhasContas[1] = new Conta();				 // Criando o objeto de maneira mais direta:
		minhasContas[1].setSaldo(3200);
		System.out.println(minhasContas[1].getSaldo());
	}

}
