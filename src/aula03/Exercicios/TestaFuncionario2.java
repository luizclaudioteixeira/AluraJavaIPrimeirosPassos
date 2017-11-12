package aula03.Exercicios;

public class TestaFuncionario2 {
	
	/*
	 * 	Construa dois funcionários com valores diferentes usando o new duas vezes.
		Compare-os com o ==. E se eles tiverem os mesmos atributos? 
	 */
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario (); // Criando primeiro funcionário
		Funcionario f2 = new Funcionario (); // Criando segundo funcionário
		
		 f1.nome = "Luiz";
		 f1.departamento = "Suporte";
		 f1.salario = 1000;
		 f1.dataDeAdmissao = "12/11/2017";
		 f1.numRG = "12345678";
		 
		 f2.nome = "Claudio";
		 f2.departamento = "Vendas";
		 f2.salario = 3000;
		 f2.dataDeAdmissao = "12/11/2015";
		 f2.numRG = "6666666";
		 
		 // Comparando com ==
		 System.out.println(f1 == f2);
		 
		 // Colocando os dois funcionário com atributos iguais:
		 
		 f2.nome = "Luiz";
		 f2.departamento = "Suporte";
		 f2.salario = 1000;
		 f2.dataDeAdmissao = "12/11/2017";
		 f2.numRG = "12345678";
		 
		 // Comparando novamente com ==
		 System.out.println(f1 == f2);
		 
		 // As duas formas deram falso pois os variáveis f1 e f2 são refencias distintas 
		 //	para objetos diferentes
		 
	}
}
