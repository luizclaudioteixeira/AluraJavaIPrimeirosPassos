package aula04.exercicios;

import aula03.Exercicios.Funcionario;

/*
 *  Crie uma classe TestaEmpresa com o m�todo main. Dentro dele crie algumas inst�ncias de Funcionario 
 *  e passe para a empresa pelo m�todo adiciona.
 */

public class TestaEmpresa {

	public static void main(String[] args) {
		
		// Criando inst�ncia Empresa
		Empresa empresaA = new Empresa();
		
		// Criando o objeto array de Funcion�rios e colocando arrayDefuncionarios para apontar
		empresaA.refParaarrayDefuncionarios = new Funcionario[5];
		
		// Criando um funcion�rio e Adicionando ao array de funcion�rios
			// Funcionario funcionario1 = new Funcionario();
			// funcionario1.setSalario(1000);
			// empresaA.adicionar(funcionario1);
		
		// Criando 5 Funcionarios, setando sal�rio e adicionando funcion�rio � empresa
		for (int i = 0; i < 5; i++) {
			
			Funcionario f = new Funcionario();
			f.setSalario(1000 + i);
			empresaA.adicionar(f);
		}
		
		empresaA.mostraFuncionariosFE();
	}

}
