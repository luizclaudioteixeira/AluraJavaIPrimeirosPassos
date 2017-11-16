package exercicios;

import aula03.Exercicios.Funcionario;

/*
 *	Crie uma classe Empresa. A Empresa tem um nome, cnpj e uma refer�ncia a uma array de Funcionario, 
 *	al�m de outros atributos que voc� julgar necess�rio.
 */



// Classe Empresa
public class Empresa {
	
	String nome;
	String cnpj;
	Funcionario[] refParaArrayDefuncionarios;
	int posi��oLivre = 0;
	
	/*
	 * A Empresa deve ter um m�todo adicionar, que recebe uma refer�ncia a Funcionario como argumento 
	 * e guarda esse funcion�rio.
	 */
	
	void adicionar(Funcionario f){
		this.refParaArrayDefuncionarios[posi��oLivre] = f;
		this.posi��oLivre++;
	}
	
	/*
	 * Percorra o atributo empregados da sua inst�ncia da Empresa e imprima os sal�rios de todos seus 
	 * funcion�rios. Para fazer isso, voc� pode criar um m�todo chamado mostraEmpregados dentro da classe 
	 * Empresa
	 */
	
	void mostraFuncionariosFE() {
		int posi��o = 0;
		
		for (Funcionario i : refParaArrayDefuncionarios) {
						
			System.out.println("Posi��o do funcion�rio: " + posi��o);
			System.out.println("Sal�rio: " + i.getSalario());
			posi��o++;
		}
	}
	
	
	void mostraFuncionarios() {
		
		for( int i = 0 ; i < refParaArrayDefuncionarios.length; i++ ) {
			System.out.println("Posi��o do funcion�rio: " + i);
			//System.out.println("Nome do funcion�rio: " + arrayDefuncionarios[i].getNome());
			//System.out.println("Departamento: " + arrayDefuncionarios[i].getDepartamento());
			System.out.println("Sal�rio: " + refParaArrayDefuncionarios[i].getSalario());
		}
	}
	
	/*
	 * Crie um m�todo para verificar se um determinado Funcionario se encontra ou n�o como funcion�rio 
	 * desta empresa. 
	 * O m�todo deve se chamar contem e devolver um boolean. Ele recebe um funcion�rio.
	 * 
	 */
	
	boolean contem(Funcionario f) {
		
		for (int i = 0; i < this.posi��oLivre; i++) {
            if (f == this.refParaArrayDefuncionarios[i]) {
                return true;
            }
        }
        return false;
	}
}


	