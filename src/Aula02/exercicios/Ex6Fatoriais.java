package exercicios;

/*
 * Imprima os fatoriais de 1 a 10.
 */

public class Ex6Fatoriais {

	public static void main(String[] args) {
			
		int fatorial = 1;
		
		for (int i = 1; i <= 10; i++) {
			//System.out.println(i);
			
			fatorial = fatorial * i;
			System.out.println("O fatoral de " +i+ " é " + fatorial);
		}
		
	}
}
