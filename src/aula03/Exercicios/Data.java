package aula03.Exercicios;

/*
 * Em vez de utilizar uma String para representar a data, crie uma outra classe, chamada Data. 
 * Ela possui 3 campos int, para dia, mês e ano. Faça com que seu funcionário passe a usá-la.
 * 
 * Crie um método chamado getFormatada na classe Data que devolva o valor formatado da data, isto é, 
 * devolva uma String com "dia/mes/ano".
 */

public class Data {
	int dia;
	int mes;
	int ano;
	
	int getDia(){
		return this.dia;
	}
	
	int getMes() {
		return mes;
	}
	
	int getAno() {
		return ano;
	}
	
	String getFormatada(){
		return (this.getDia()+ "/" + this.getMes() + "/" +this.getAno());
	}
}
