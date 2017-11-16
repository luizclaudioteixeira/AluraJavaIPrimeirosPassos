package exercicios;

import aula03.Exercicios.Funcionario;

/*
 *	Crie uma classe Empresa. A Empresa tem um nome, cnpj e uma referência a uma array de Funcionario, 
 *	além de outros atributos que você julgar necessário.
 */



// Classe Empresa
public class Empresa {
	
	String nome;
	String cnpj;
	Funcionario[] refParaArrayDefuncionarios;
	int posiçãoLivre = 0;
	
	/*
	 * A Empresa deve ter um método adicionar, que recebe uma referência a Funcionario como argumento 
	 * e guarda esse funcionário.
	 */
	
	void adicionar(Funcionario f){
		this.refParaArrayDefuncionarios[posiçãoLivre] = f;
		this.posiçãoLivre++;
	}
	
	/*
	 * Percorra o atributo empregados da sua instância da Empresa e imprima os salários de todos seus 
	 * funcionários. Para fazer isso, você pode criar um método chamado mostraEmpregados dentro da classe 
	 * Empresa
	 */
	
	void mostraFuncionariosFE() {
		int posição = 0;
		
		for (Funcionario i : refParaArrayDefuncionarios) {
						
			System.out.println("Posição do funcionário: " + posição);
			System.out.println("Salário: " + i.getSalario());
			posição++;
		}
	}
	
	
	void mostraFuncionarios() {
		
		for( int i = 0 ; i < refParaArrayDefuncionarios.length; i++ ) {
			System.out.println("Posição do funcionário: " + i);
			//System.out.println("Nome do funcionário: " + arrayDefuncionarios[i].getNome());
			//System.out.println("Departamento: " + arrayDefuncionarios[i].getDepartamento());
			System.out.println("Salário: " + refParaArrayDefuncionarios[i].getSalario());
		}
	}
	
	/*
	 * Crie um método para verificar se um determinado Funcionario se encontra ou não como funcionário 
	 * desta empresa. 
	 * O método deve se chamar contem e devolver um boolean. Ele recebe um funcionário.
	 * 
	 */
	
	boolean contem(Funcionario f) {
		
		for (int i = 0; i < this.posiçãoLivre; i++) {
            if (f == this.refParaArrayDefuncionarios[i]) {
                return true;
            }
        }
        return false;
	}
}


	