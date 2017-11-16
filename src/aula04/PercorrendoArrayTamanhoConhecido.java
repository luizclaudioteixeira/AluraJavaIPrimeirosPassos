package aula04;

public class PercorrendoArrayTamanhoConhecido {

	public static void main(String[] args) {
		
		
		int[] idades = new int[10];			// Declarando array
		
											// Pecorrendo um array de tamanho conhecido:
		
		for (int i = 0; i < 10; i++) {		// Array possui 10 posições (0...9)
			idades[i] = i;					// Atribuindo i à posição [i]
			System.out.println(idades[i]);	// Imprimindo o valor de cada posição [i] do array
		}
	}

}
