package exercicios;

	public class ex2BalancoTrimestral {
		public static void main(String[] args){
			
			int gastosJaneiro = 15000;
			int gastosFevereiro = 23000;
			int gastosMarco = 17000;
			
			
			int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
			int mediaMensal = gastosTrimestre / 3;
			System.out.println("Valor da média mensal = " + mediaMensal);
			// o valor foi arrendondado pois o cálculo está sendo efetuado com inteiros
			// para aparecer as casas decimais, pelo menos um dos valores deve ser double
		}
}
