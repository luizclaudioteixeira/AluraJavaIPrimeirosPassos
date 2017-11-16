package aula04;

import aula03.Conta;

public class ArraysDeReferencias {

	public static void main(String[] args) {
		
		Conta[] minhasContas;						// Criando um array para Contas
		minhasContas = new Conta[10];
				
													/*
													 * 	Nenhum objeto conta foi criado aqui, 
													 * 	pois não há nenhum new Conta();
													 * 	Foram criadas 10 posições que podem guardar 
													 * 	referÊncias para objetos Conta.
													 * 	Até aqui eles não apontam para lugar algum. 
													 * 	São referências nulas (null).
													 */
				
				
				
		//System.out.println(minhasContas[0].getSaldo()); 
																	
													/* Tentando acessar o conteúdo de uma 
														posição que não aponta para nada 
														(null) */
																	
				
													/*
													 * 	Ocorre um erro de execução. 
													 * 	Na primeira posição do array não 
													 * 	há referÊncia paralugar algum.
													 *  O array deve ser populado com 
													 *  novas contas antes.
													 */	
																	
			
		Conta novaConta = new Conta();				// Criado um objeto tipo Conta;
		novaConta.setSaldo(1000); 
		
		minhasContas[0] = novaConta;				// Agora a posição [0] aponta para um objeto tipo Conta
	
													/* OBS >> Um array de tipos primitivos guarda VALORES. 
													 * Um array de objetos guarda REFÊNCIAS. */
				
				
		minhasContas[1] = new Conta();				 // Criando o objeto de maneira mais direta:
		minhasContas[1].setSaldo(3200);
		System.out.println(minhasContas[1].getSaldo());
	}

}
