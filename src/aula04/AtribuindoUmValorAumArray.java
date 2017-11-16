package aula04;

public class AtribuindoUmValorAumArray {

	public static void main(String[] args) {
		
		int[] idades;			// Declarando um array de inteiros
		
		
								//	A variável idades é uma referência para um objeto array de 
								//	inteiros que ainda não foi criado.


		idades = new int [10];	// Criando o objeto array de 10 posições

								// Agora idades aponta para um objeto array de inteiros de 10 posições.	
	
		idades[5] = 10;			// Atribuindo um valor no array criado
		
								//	A sexta posição do array recebe o valor 10. 
								//	As posições variam de 0 a n-1, onde n é o tamanho do array
		
		
		/* --------------------------------------------------------------------------------------------- 
		 * OBSERVAÇÃO
		 * ---------------------------------------------------------------------------------------------*/
		
		
		idades[10] = 3;			// Tentando acessar uma posição acima do comprimento do array
		
		
		 						//	Como dito acima, um array de 10 posições varia de array[0] a array [9]. 
								//	A posição [10] não existe. 
								//	Dessa forma, quanto tentamos acessá-la, ocorre um erro 
								//	"ArrayIndexOutofBounds"
		 						// 	que significa que o índice está tentando acessar uma posição 
								//	fora dos limites do array.
		 
		
	}

}
