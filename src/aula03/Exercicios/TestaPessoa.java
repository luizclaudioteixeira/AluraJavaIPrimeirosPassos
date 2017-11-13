package aula03.Exercicios;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Pessoa jose = new Pessoa();
		
		jose.nome = "José da Silva";
		jose.idade = 45;
		
		jose.fazAniversario();
		jose.fazAniversario();
		jose.fazAniversario();
		
		System.out.println("O nome da pessoa criada é " + jose.nome + " e ele tem " + jose.idade + " anos");
		
		
	}

}
