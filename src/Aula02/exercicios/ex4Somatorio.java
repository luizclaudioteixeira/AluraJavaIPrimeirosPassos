package exercicios;

/*
 * Imprima o resultado do somatório de 1 até 1000 (inclusive).
 */

public class ex4Somatorio {
	
	public static void main(String[] args) {
		
		int i = 1;
		int somatorio = 0;
		
		while ( i <= 1000) {
			somatorio = somatorio + i;
			i++;
		}
		
		System.out.println(somatorio);
	}
}
