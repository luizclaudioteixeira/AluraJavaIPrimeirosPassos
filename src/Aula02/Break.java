package Aula02;

public class Break {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 100;
		
		for (int i = x; i < y; i++) {
		    if (i % 19 == 0) {
		        System.out.println("Achei um número divisível por 19 entre x e y: "+i);
		        break;
		    }
		}
		
	}
}
