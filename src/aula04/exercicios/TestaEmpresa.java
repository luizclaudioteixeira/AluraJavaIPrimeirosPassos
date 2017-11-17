package aula04.exercicios;

import aula03.Exercicios.Funcionario;

/*
 *  Crie uma classe TestaEmpresa com o método main. Dentro dele crie algumas instâncias de Funcionario 
 *  e passe para a empresa pelo método adiciona.
 */

public class TestaEmpresa {

	public static void main(String[] args) {
		
		// Criando instância Empresa
		Empresa empresaA = new Empresa();
		
		// Criando o objeto array de Funcionários e colocando arrayDefuncionarios para apontar
		empresaA.refParaarrayDefuncionarios = new Funcionario[5];
		
		// Criando um funcionário e Adicionando ao array de funcionários
			// Funcionario funcionario1 = new Funcionario();
			// funcionario1.setSalario(1000);
			// empresaA.adicionar(funcionario1);
		
		// Criando 5 Funcionarios, setando salário e adicionando funcionário à empresa
		for (int i = 0; i < 5; i++) {
			
			Funcionario f = new Funcionario();
			f.setSalario(1000 + i);
			empresaA.adicionar(f);
		}
		
		empresaA.mostraFuncionariosFE();
	}

}
