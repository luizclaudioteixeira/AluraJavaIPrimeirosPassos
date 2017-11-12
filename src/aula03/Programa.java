package aula03;

public class Programa {

	public static void main(String[] args) {
		
		Conta minhaConta;
		
		minhaConta = new Conta();
		
		minhaConta.dono = "Luiz";
		
		
		System.out.println("Saldo atual: " + minhaConta.saldo);
	
		minhaConta.saldo = 1000.0;
		
		boolean sucessoNoSaque = minhaConta.saca(3000);
		
		if (sucessoNoSaque) {
			System.out.println("Saque efetuado com sucesso.");
		} else {
			System.out.println("Valor ultrapassa saldo em conta.");
		}
		
		
	}
	

}

