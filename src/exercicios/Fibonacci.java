package exercicios;

public class Fibonacci {

	/*	
	 * 	Sequência de Fibonnaci (Método Recursivo)
	 *  f(0) = 1;
	 *  F(1) = 1;
	 *  F(N) = f(N-1) + F(N-2)
	 */
	//int[] passosFibonacci;
	
	int termo;
	int[] arrayTermos;
	int[] sequenciaFib;

	Fibonacci(int n){
		this.termo = n;
		this.arrayTermos = new int[termo+1];
		this.sequenciaFib = new int[termo+1];
		
		for (int i = 0; i < this.arrayTermos.length; i++) {
			this.arrayTermos[i] = i; 
		}
		
		for (int i = 0; i < sequenciaFib.length; i++ ) {
			this.sequenciaFib[i] = 0;
		}
		
		System.out.println(calculaFibonacci(this.termo));
	}
	
	int getTermo(){
		return this.termo;
	}
	
	void mostraArrayTermos(){
		for (int i = 0; i < this.arrayTermos.length; i++) {
			System.out.println(this.arrayTermos[i]);
		}
	}
	
	int calculaFibonacci(int n){
		if (n == 0) {
			sequenciaFib[0] = 1;
			return sequenciaFib[0];
		} else if (n == 1){
			sequenciaFib[1] = 1;
			return sequenciaFib[1];
		} else {
			if (sequenciaFib[n] == 0) {
				sequenciaFib[n] = calculaFibonacci(n-1) + calculaFibonacci(n-2);
			}
		}
		return sequenciaFib[n];
	}
	
}

