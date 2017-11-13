package aula03.Exercicios;

public class Fibonacci {

	
	/*	
	 * 	Sequência de Fibonnaci (Método Recursivo)
	 *  f(0) = 1;
	 *  F(1) = 1;
	 *  F(N) = f(N-1) + F(N-2)
	 */
	
	int numSequencia = 0;
	
	int calculaFibonacci(int i){
		
		if(i == 0) {			 // F(0)
			numSequencia = 0;	// 	F(0) = 0;	
		} else if (i == 1) {	// 	F(1)
			numSequencia = 1;	// 	F(1) = 1
		} else {
			numSequencia = calculaFibonacci( i-1) + calculaFibonacci (i -2); // F(N) = f(N-1) + F(N-2)
			// aqui o método vai chamar a si mesmo (recursivo)
		}
		
		return numSequencia; // Retorna o número da sequência após sair dos testes
	}
	
	
	int calculaFibonacciv2 (int i) { // Método mais enxuto
		
		if (i < 2) return i;	// Testa F(0) e F(1)
		else	return 	calculaFibonacciv2 (i - 1) + calculaFibonacciv2 (i - 2); // calcula F(N)
	}
	
	int calculaFibonacciT (int i) { // Método utilizando o operador ternário
		
		return (i < 2) ? i : calculaFibonacciT(i - 1) + calculaFibonacciT(i - 2);
	}	
}

