package Aula02;

public class EscopoDasVariáveis {
	
	public static void main(String[] args) {
		boolean condicao = true;
				
		int i = 5;
		
		// a partir daqui i existe
		
		System.out.println(i);
		
		while (condicao) {
			
		    // o i ainda vale aqui
		    
			int j = 7;
			System.out.println(j);
		    // o j passa a existir
		}
		
		// aqui o j não existe mais, mas o i continua dentro do escopo
		System.out.println(j);
		
	}
	
}
