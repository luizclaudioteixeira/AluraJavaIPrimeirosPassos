package Aula02;

/*
 * Além dos operadores de incremento, existem os de decremento, como --i e i--. 
 * Além desses, você pode usar instruções do tipo i += x e i -= x, o que essas 
 * instruções fazem? Teste.
 */


public class OperadoresDeIncremento {
	
	public static void main(String[] args) {
		
		int i = 0;
		int x = 1;
		
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		i += x;		// Equivale a i = i + x;
		System.out.println(i);
		
		i -= x;
		System.out.println(i); // Equivale a i = i - x;
	}
}
