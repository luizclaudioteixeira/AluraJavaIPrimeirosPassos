package aula04;

public class PercorrendoArrayTamanhoDesconhecido {

	public static void main(String[] args) {
		
		int[] idades = new int[10];			// Declarando array
		
		// Percorendo um array de tamanho desconhecido:
		
		for (int i = 0; i < idades.length; i++) {	// length retorna o tamanho do array
			idades[i] = i;							// Atribuindo i � posi��o [i]
			System.out.println(idades[i]);			// Imprimindo o valor de cada posi��o [i] do array
		}

	}

}
