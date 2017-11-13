package aula03.Exercicios;

public class TestaPorta {
	
	public static void main(String[] args) {
		
		Porta p = new Porta();
		
		p.aberta = false;
		p.cor = "amarela";
		p.defineDimensoes(10, 12, 3);
		
		p.pinta("azul");
		p.abre();
		
		p.descrevePorta();
	}
}
