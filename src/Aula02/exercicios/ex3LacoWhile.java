package exercicios;

/*
 * Utilizando o la�o do tipo while, tente imprimir todos os n�meros de 150 
 * (inclusivo) at� 300 (exclusivo). Fa�a o la�o enquanto esse valor n�o alcance 300. 
 * Dentro do la�o n�o esque�a de imprimir o n�mero e alter�-lo! 
 * Para isso comece declarando a vari�vel inteira que utilizar�, 
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
