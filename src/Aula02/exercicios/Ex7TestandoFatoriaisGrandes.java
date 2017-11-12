package exercicios;

/*
 * No c�digo do exerc�cio anterior, aumente a quantidade de n�meros que ter�o os 
 * fatoriais impressos, at� 20, 30, 40. Em um determinado momento, al�m desse c�lculo 
 * demorar, vai come�ar a mostrar respostas completamente erradas. Por qu�? 
 * 
 * Mude de int para long para ver alguma mudan�a.
 */

public class Ex7TestandoFatoriaisGrandes {
	public static void main(String[] args) {
		
		long fatorial = 1;
		// int s� � capaz de armazenar inteiros at� 2.147.483.647
		// como 13! > do que 2.147.483.647 o resultado com a vari�vel int fatorial come�a a dar errado
		
		for (int i = 1; i <= 20; i++) {
			//System.out.println(i);
			
			fatorial = fatorial * i;
			System.out.println("O fatoral de " +i+ " � " + fatorial);
			if (fatorial <= 2147483647) {
				System.out.println("Fatorial pode ser armazenado em um int.");
			} else System.out.println("N�o pode ser armazenado em um int.");
		}
		
	}
}
