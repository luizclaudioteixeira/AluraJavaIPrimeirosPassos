package aula03.Exercicios;

public class TestaFibonacci {

	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		
		for (int i = 1; i <= 10; i++) {
		  int resultado = fibonacci.calculaFibonacciv2(i);
		  System.out.println(resultado);
		}

	}

}

