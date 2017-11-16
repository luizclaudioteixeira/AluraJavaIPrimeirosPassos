package aula04;

public class EnchancedFor {

	public static void main(String[] args) {
			
		/* 
		 * A partir do Java 5.0  possu�mos uma nova forma de percorremos arrays: o enhanced-for 
		 * 
		 * Caso n�o haja a necessidade de manter guardada a posi��o que est� percorrendo o array
		 * o enchanced-for � uma maneira mais simples de percorrer um vetor:
		 */
		
		int[] idades = new int[10];	
		
		// Utilizando o enhanced-for
		
		for (int i : idades ) { 	// 	Enchanced-For
			System.out.println(i);	//	Imprime o conte�do das posi��es relativas a i
		}
		
		System.out.println();

	}

}
