package aula03.Exercicios;

/*
 * O que acontece se chamarmos o m�todo mostra antes de atribuirmos uma data para
 *  este Funcionario?
 */

public class TestaFuncionarioData2 {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		Data df1 = new Data();
		f1.dataDeAdmissao = df1;
		
		f1.mostra(); // A data � mostrada com 0/0/0, que s�o

		/*
		 *  A data � mostrada como 0/0/0 pois os 3 inteiros da classe data s�o inicializados
		 *  com valores default 0, j� que n�o houve essa inicializa��o no c�digo.
		 */
	
	}
	

}
