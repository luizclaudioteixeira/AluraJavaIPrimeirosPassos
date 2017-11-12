package exercicios;

/*
 * Utilizando o laço do tipo while, tente imprimir todos os números de 150 
 * (inclusivo) até 300 (exclusivo). Faça o laço enquanto esse valor não alcance 300. 
 * Dentro do laço não esqueça de imprimir o número e alterá-lo! 
 * Para isso comece declarando a variável inteira que utilizará, 
 * e configure o valor inicial dela.
 */


public class ex3LacoWhile {

	public static void main(String[] args) {
		
		int x = 150;
		
		while ( x < 300 ) {
			System.out.println(x);
			x++;
		}

	}

}
