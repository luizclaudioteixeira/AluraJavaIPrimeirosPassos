package aula03;

public class TestaAlgusMetodos {

	public static void main(String[] args) {
		
		// criando uma conta
		Conta novaConta = new Conta();
		
		// alterando os valores da nova conta:
		novaConta.dono = "João";
		novaConta.saldo = 1000;

		// sacando 200 reais:
		novaConta.saca(200);
		
		// depositando 500 reais:
		novaConta.deposita(500);
		
		// imprimindo o saldo atual
		System.out.println(novaConta.saldo);
		
		int numero;
		numero = 10;
		numero = numero - 1;
		
	}
}
