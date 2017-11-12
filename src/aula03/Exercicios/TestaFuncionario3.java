package aula03.Exercicios;

public class TestaFuncionario3 {

	/*
	 * 	Crie duas refer�ncias para o mesmo funcion�rio, compare-os com o ==.
		Tire suas conclus�es. Para criar duas refer�ncias pro mesmo funcion�rio:
	 */
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario (); // Criando  funcion�rio

		f1.nome = "Luiz";
		f1.departamento = "Suporte";
	    f1.salario = 1000;
	    f1.dataDeAdmissao = "12/11/2017";
	    f1.numRG = "12345678";	
	    
	    Funcionario f2; // Outra referencia para funcionario
	    
	    f2 = f1;		// Nova referencia recebe mesma referencia do objeto de f1
	    
	    System.out.println(f1 == f2); // Comparando com ==
	    
	    /*
	     *  O resultado d� true pois as refer�ncias s�o id�nticas j� que f2 recebeu o valor de f1
	     *  Ou seja, as duas vari�veis apontam para o mesmo objeto na mem�ria
	     */
	}

}
