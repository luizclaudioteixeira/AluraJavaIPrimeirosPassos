package aula04.exercicios;

import aula03.Exercicios.Funcionario;

public class TestaContem {

	public static void main(String[] args) {
		
	
		Empresa empresaA = new Empresa();
				
				
		empresaA.refParaarrayDefuncionarios = new Funcionario[5];
				
	
		for (int i = 0; i < 5; i++) {
			
			Funcionario f = new Funcionario();
			f.setSalario(1000 + i);
			empresaA.adicionar(f);
		}
		
		empresaA.mostraFuncionariosFE();
		System.out.println();
		
		Funcionario x = new Funcionario ();
		
		
		System.out.println(empresaA.contem(x));
		System.out.println(empresaA.contem(empresaA.refParaarrayDefuncionarios[0]));
		
	}

}
