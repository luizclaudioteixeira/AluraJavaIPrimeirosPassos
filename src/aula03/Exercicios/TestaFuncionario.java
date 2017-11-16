package aula03.Exercicios;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		 f1.setNome("Luiz");
		 f1.setDepartamento("Suporte");
		 f1.salario = 1000;
		 f1.dataDeAdmissao = "12/11/2017";
		 f1.numRG = "12345678";
		 
		f1.mostra();
		 
		 System.out.println();
		 System.out.println(f1.calculaGanhoAnual());
		 f1.recebeAumento(500);
		 System.out.println(f1.salario);
		 System.out.println(f1.calculaGanhoAnual());
	}

}
