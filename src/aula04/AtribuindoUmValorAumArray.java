package aula04;

public class AtribuindoUmValorAumArray {

	public static void main(String[] args) {
		
		int[] idades;			// Declarando um array de inteiros
		
		
								//	A vari�vel idades � uma refer�ncia para um objeto array de 
								//	inteiros que ainda n�o foi criado.


		idades = new int [10];	// Criando o objeto array de 10 posi��es

								// Agora idades aponta para um objeto array de inteiros de 10 posi��es.	
	
		idades[5] = 10;			// Atribuindo um valor no array criado
		
								//	A sexta posi��o do array recebe o valor 10. 
								//	As posi��es variam de 0 a n-1, onde n � o tamanho do array
		
		
		/* --------------------------------------------------------------------------------------------- 
		 * OBSERVA��O
		 * ---------------------------------------------------------------------------------------------*/
		
		
		idades[10] = 3;			// Tentando acessar uma posi��o acima do comprimento do array
		
		
		 						//	Como dito acima, um array de 10 posi��es varia de array[0] a array [9]. 
								//	A posi��o [10] n�o existe. 
								//	Dessa forma, quanto tentamos acess�-la, ocorre um erro 
								//	"ArrayIndexOutofBounds"
		 						// 	que significa que o �ndice est� tentando acessar uma posi��o 
								//	fora dos limites do array.
		 
		
	}

}
