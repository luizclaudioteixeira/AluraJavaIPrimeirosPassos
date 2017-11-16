package aula04;
// Importando a Classe conta da aula 03
import aula03.Conta;

public class arrays {
	
	// Método para imprimir arrays de tamanho desconhecido
	void imprimeArray(int arrayDeInt[]) {	// Recebe um array de int como parâmetro
		for(int i = 0; i < arrayDeInt.length; i++) { 
			System.out.println(arrayDeInt[i]);
		}
	}

	
	public static void main(String[] args) {
		
		// Declarando um array de inteiros
		int idades[];
		
		/*
		 * A variável idades é uma referência para um objeto array de inteiros que ainda não foi criado.
		 */
		
		
		// Criando o objeto array de 10 posições
		idades = new int [10];
		
		/*
		 * 	Agora idades aponta para um objeto arrays de inteiros de 10 posições
		 */
		
		
		// Atribuindo um valor no array criado
		idades[5] = 10;
		
		/*
		 * 	A sexta posição do array recebe o valor 10. AS posições variam de 0 a n-1, onde n é o
		 * 	tamanho do array
		 */
		
		// Tentando acessar uma posição acima do comprimento do array
		//idades[10] = 3;
		
		/*
		 * 	Como dito acima, um array de 10 posições varia de array[0] a array [9]. A posição [10] não
		 * 	existe. Dessa forma, quanto tentamos acessá-la, ocorre um erro "ArrayIndexOutofBounds"
		 * 	que significa que o índice está tentando acessar uma posição fora dos limites do array.
		 */
		
		// Declarando um array de n posições
		
		int n = 15;
		int [] arrayDeNPosições = new int [n];
		
		// Criando um array para Contas
		Conta[] minhasContas;
		minhasContas = new Conta[10];
		
		/*
		 * 	Nenhum objeto conta foi criado aqui, pois não há nenhum new Conta();
		 * 	Foram criadas 10 posições que podem guardar referÊncias para objetos Conta.
		 * 	Até aqui eles não apontam para lugar algum. São referências nulas (null).
		 */
		
		
		// Tentando acessar o conteúdo de uma posição que não aponta para nada (null)
		//System.out.println(minhasContas[0].getSaldo());
		
		
		/*
		 * 	Ocorre um erro de execução. Na primeira posição do array não há referÊncia para
		 * 	lugar algum. O array deve ser populado com novas contas antes.
		 */
		
		// Criando um objeto conta para nosso array de contas
		Conta novaConta = new Conta();	// Criado um objeto tipo Conta;
		novaConta.setSaldo(1000); 
		
		minhasContas[0] = novaConta;	// Agora a posição [0] aponta para um objeto tipo Conta
		
		/* OBS >> Um array de tipos primitivos guarda VALORES. Um array de objetos guarda REFÊNCIAS. */
		
		// Criando o objeto de maneira mais direta:
		minhasContas[1] = new Conta();
		minhasContas[1].setSaldo(3200);
		
		System.out.println(minhasContas[1].getSaldo());
		
		// Pecorrendo um array de tamanho conhecido:
		for (int i = 0; i < 10; i++) {	
			idades[i] = i;					// Atribuindo i à posição [i]
			System.out.println(idades[i]);	// Imprimindo o valor de cada posição [i] do array
		}
		
		// Percorendo um array de tamanho desconhecido:
		for (int i = 0; i < idades.length; i++) {	// length retorna o tamanho do array
			idades[i] = i;					// Atribuindo i à posição [i]
			System.out.println(idades[i]);	// Imprimindo o valor de cada posição [i] do array
		}
		
		System.out.println();
		
		/* 
		 * A partir do Java 5.0  possuímos uma nova forma de percorremos arrays: o enhanced-for 
		 * 
		 * Caso não haja a necessidade de manter guardada a posição que está percorrendo o array
		 * o enchanced-for é uma maneira mais simples de percorrer um vetor:
		 */
		
		// Utilizando o enhanced-for
		
		for (int ef : idades ) { 	// 	Enchanced-For
			
			System.out.println(ef);	//	Imprime o conteúdo das posições relativas a ef
		}
		
		System.out.println();
		
		
	}

}
