package aula03.Exercicios;

	/*
	 * Programa 3 - Apostila Caelum
		
		Classe: Casa
		Atributos: cor, porta1, porta2, porta3
		Método: 
		void pinta(String s) 
      	int quantasPortasEstaoAbertas()
		
			Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; 
			abra e feche as mesmas como desejar. 
			Utilize o método quantasPortasEstaoAbertas 
			para imprimir o número de portas abertas.
	 */


public class Casa {
	
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	void pinta (String s) {
		this.cor = s;
	}
	
	int quantasPortasEstaoAbertas() {
		int contPortasAbertas = 0;
		
		if (porta1.aberta) contPortasAbertas++;
		if (porta2.aberta) contPortasAbertas++;
		if (porta3.aberta) contPortasAbertas++;
		
		return  contPortasAbertas;
	}
}
