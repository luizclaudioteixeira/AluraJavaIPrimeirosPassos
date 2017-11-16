package aula04;

public class EnchancedFor {

	public static void main(String[] args) {
			
		/* 
		 * A partir do Java 5.0  possuímos uma nova forma de percorremos arrays: o enhanced-for 
		 * 
		 * Caso não haja a necessidade de manter guardada a posição que está percorrendo o array
		 * o enchanced-for é uma maneira mais simples de percorrer um vetor:
		 */
		
		int[] idades = new int[10];	
		
		// Utilizando o enhanced-for
		
		for (int i : idades ) { 	// 	Enchanced-For
			System.out.println(i);	//	Imprime o conteúdo das posições relativas a i
		}
		
		System.out.println();

	}

}
