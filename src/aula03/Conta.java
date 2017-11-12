package aula03;

public class Conta {
	
	// Atributos
	int numero;
	Cliente titular = new Cliente();	// Esse atributo guardar· uma refer ncia para um objeto tipo Cliente
	double saldo;
	double limite;
	
	// MÈtodos
	
	// Saca dinheiro de uma conta
	boolean saca (double quantidade) {
		
		if (this.saldo < quantidade) { // testando se vai sacar mais do que a conta possui
			return false; 				
		} else {
			this.saldo =  this.saldo - quantidade;	// realiza o saque
			 return true;
		}
	}
	
	// Deposita dinheiro em uma conta
	void deposita (double quantidade) {
		this.saldo += quantidade;
	}
	
	// Tranfere dinheiro entre contas
   	boolean transfere(Conta destino, double valor) {	// retorna true ou false
        
   		boolean retirou = this.saca(valor);				// saca com o mÈtodo j· criado
   		
   		if (retirou) {									// testa se o saque deu certo
   			
   			destino.deposita(valor);					// deposita com o mÈtodo j· criado
   			return true;								// retorna true
   		} else {										// se o saque n„o deu certo
   			return false;								// retorna false
   		}
    }

    
}

	
