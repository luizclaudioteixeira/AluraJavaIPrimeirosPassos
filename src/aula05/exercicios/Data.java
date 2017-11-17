package aula05.exercicios;

/*
 * Em vez de utilizar uma String para representar a data, crie uma outra classe, chamada Data. 
 * Ela possui 3 campos int, para dia, m�s e ano. Fa�a com que seu funcion�rio passe a us�-la.
 * 
 * Crie um m�todo chamado getFormatada na classe Data que devolva o valor formatado da data, isto �, 
 * devolva uma String com "dia/mes/ano".
 */

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public int getDia(){
		return this.dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getFormatada(){
		return (this.getDia() + "/" + this.getMes() + "/" + this.getAno());
	}
}
