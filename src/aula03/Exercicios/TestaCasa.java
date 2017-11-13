package aula03.Exercicios;

public class TestaCasa {

	public static void main(String[] args) {
		
		Casa c = new Casa();
		
		c.pinta("Verde");
		
		c.porta1 = new Porta();
		c.porta2 = new Porta();
		c.porta3 = new Porta();
		
		c.porta1.abre();
		c.porta2.fecha();
		c.porta3.abre();
		
		System.out.println(c.quantasPortasEstaoAbertas());
	}

}
