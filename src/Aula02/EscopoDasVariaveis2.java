package Aula02;

public class EscopoDasVariaveis2 {

	public static void main(String[] args) {
		
		boolean algumBooleano = true;
		
			if (algumBooleano) {
			    int i = 5;
			} 
			else {
			    int i = 10;
			}
		
		System.out.println(i); // a variável i não existe aqui
		
	}
	
}
