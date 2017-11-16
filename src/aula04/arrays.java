package aula04;
// Importando a Classe conta da aula 03
import aula03.Conta;

public class arrays {
	
	// M�todo para imprimir arrays de tamanho desconhecido
	void imprimeArray(int arrayDeInt[]) {	// Recebe um array de int como par�metro
		for(int i = 0; i < arrayDeInt.length; i++) { 
			System.out.println(arrayDeInt[i]);
		}
	}

	
	public static void main(String[] args) {
		
		// Declarando um array de inteiros
		int idades[];
		
		/*
		 * A vari�vel idades � uma refer�ncia para um objeto array de inteiros que ainda n�o foi criado.
		 */
		
		
		// Criando o objeto array de 10 posi��es
		idades = new int [10];
		
		/*
		 * 	Agora idades aponta para um objeto arrays de inteiros de 10 posi��es
		 */
		
		
		// Atribuindo um valor no array criado
		idades[5] = 10;
		
		/*
		 * 	A sexta posi��o do array recebe o valor 10. AS posi��es variam de 0 a n-1, onde n � o
		 * 	tamanho do array
		 */
		
		// Tentando acessar uma posi��o acima do comprimento do array
		//idades[10] = 3;
		
		/*
		 * 	Como dito acima, um array de 10 posi��es varia de array[0] a array [9]. A posi��o [10] n�o
		 * 	existe. Dessa forma, quanto tentamos acess�-la, ocorre um erro "ArrayIndexOutofBounds"
		 * 	que significa que o �ndice est� tentando acessar uma posi��o fora dos limites do array.
		 */
		
		// Declarando um array de n posi��es
		
		int n = 15;
		int [] arrayDeNPosi��es = new int [n];
		
		// Criando um array para Contas
		Conta[] minhasContas;
		minhasContas = new Conta[10];
		
		/*
		 * 	Nenhum objeto conta foi criado aqui, pois n�o h� nenhum new Conta();
		 * 	Foram criadas 10 posi��es que podem guardar refer�ncias para objetos Conta.
		 * 	At� aqui eles n�o apontam para lugar algum. S�o refer�ncias nulas (null).
		 */
		
		
		// Tentando acessar o conte�do de uma posi��o que n�o aponta para nada (null)
		//System.out.println(minhasContas[0].getSaldo());
		
		
		/*
		 * 	Ocorre um erro de execu��o. Na primeira posi��o do array n�o h� refer�ncia para
		 * 	lugar algum. O array deve ser populado com novas contas antes.
		 */
		
		// Criando um objeto conta para nosso array de contas
		Conta novaConta = new Conta();	// Criado um objeto tipo Conta;
		novaConta.setSaldo(1000); 
		
		minhasContas[0] = novaConta;	// Agora a posi��o [0] aponta para um objeto tipo Conta
		
		/* OBS >> Um array de tipos primitivos guarda VALORES. Um array de objetos guarda REF�NCIAS. */
		
		// Criando o objeto de maneira mais direta:
		minhasContas[1] = new Conta();
		minhasContas[1].setSaldo(3200);
		
		System.out.println(minhasContas[1].getSaldo());
		
		// Pecorrendo um array de tamanho conhecido:
		for (int i = 0; i < 10; i++) {	
			idades[i] = i;					// Atribuindo i � posi��o [i]
			System.out.println(idades[i]);	// Imprimindo o valor de cada posi��o [i] do array
		}
		
		// Percorendo um array de tamanho desconhecido:
		for (int i = 0; i < idades.length; i++) {	// length retorna o tamanho do array
			idades[i] = i;					// Atribuindo i � posi��o [i]
			System.out.println(idades[i]);	// Imprimindo o valor de cada posi��o [i] do array
		}
		
		System.out.println();
		
		/* 
		 * A partir do Java 5.0  possu�mos uma nova forma de percorremos arrays: o enhanced-for 
		 * 
		 * Caso n�o haja a necessidade de manter guardada a posi��o que est� percorrendo o array
		 * o enchanced-for � uma maneira mais simples de percorrer um vetor:
		 */
		
		// Utilizando o enhanced-for
		
		for (int ef : idades ) { 	// 	Enchanced-For
			
			System.out.println(ef);	//	Imprime o conte�do das posi��es relativas a ef
		}
		
		System.out.println();
		
		
	}

}
