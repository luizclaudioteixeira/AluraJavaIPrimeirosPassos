package exercicios;

/*
 * No código do exercício anterior, aumente a quantidade de números que terão os 
 * fatoriais impressos, até 20, 30, 40. Em um determinado momento, além desse cálculo 
 * demorar, vai começar a mostrar respostas completamente erradas. Por quê? 
 * 
 * Mude de int para long para ver alguma mudança.
 */

public class Ex7TestandoFatoriaisGrandes {
	public static void main(String[] args) {
		
		long fatorial = 1;
		// int só é capaz de armazenar inteiros até 2.147.483.647
		// como 13! > do que 2.147.483.647 o resultado com a variável int fatorial começa a dar errado
		
		for (int i = 1; i <= 20; i++) {
			//System.out.println(i);
			
			fatorial = fatorial * i;
			System.out.println("O fatoral de " +i+ " é " + fatorial);
			if (fatorial <= 2147483647) {
				System.out.println("Fatorial pode ser armazenado em um int.");
			} else System.out.println("Não pode ser armazenado em um int.");
		}
		
	}
}
