package aula03.Exercicios;

public class Porta {
	
	/*
	 * Programa 2 - Apostila Caelum
	 * 
	 * Crie uma porta, abra e feche a mesma, pinte-a de diversas cores,
	 * altere suas dimens�es e use o m�todo estaAberta para verificar 
	 * se ela est� aberta.
	 * 
	 */
	
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	
	void abre() {
		this.aberta = true;
	}
	
	void fecha() {
		this.aberta = false;
	}
	
	void pinta(String cor) {
		this.cor = cor;	
	}
	
	void defineDimensoes (int x, int y,int z) {
		this.dimensaoX = x;
		this.dimensaoY = y;
		this.dimensaoZ = z;
	}
	
	void descrevePorta() {
		System.out.print("A porta " + this.cor);
		System.out.print(" tem dimens�es " + this.dimensaoX + "," + this.dimensaoY + "," + this.dimensaoZ);
		
		if (this.aberta) System.out.println(" e est� aberta.");
			else System.out.println("e est� fechada.");
	}
}
