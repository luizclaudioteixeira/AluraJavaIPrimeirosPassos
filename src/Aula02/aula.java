package Aula02;

public class aula {
	
	public static void main(String[] args) {
		
		// Declarando Inteiros
		
		int idade;
		
		//System.out.println(idade);
		// O Java n�o deixa utilizar uma vari�vel n�o inicializada
		
		idade = 15;
		System.out.println(idade);
		
		
		// Declarando Decimais
		
		double pi = 3.14;
		
		// Declarando Booleanos
		
		boolean verdade = true;
		
		int idade2 = 30;
		boolean menorDeIdade = idade2 < 18;
		
		System.out.println(menorDeIdade);
		
		// Declarando Caracteres
		// Os caracteres precisam estar entre aspas simples
		
		char letra = 'a';
		System.out.println(letra);
		
		// O java n�o deixa armazenar '' mas armazena ' '
		char outraLetra = ' ';
		System.out.println(outraLetra);
		
		/* =============== Casting =============================== */
		
		//double d = 3.1415;
		//int i = d; // N�o Compila
		
		//double d = 5; // ok, o double pode conter um n�mero inteiro
		//int i = d; // n�o compila
		
		
		int i = 5;
		double d2 = i; // Compila sem poblemas
		
		
		
		double d3 = 3.14;
		int j = (int) d3; 
		System.out.println("Imprimindo a vari�vel inicial: "+d3);
		System.out.println("Imprimindo a vari�vel com casting para inteiro: "+j);
		
		
		//long x = 10000;
		//int k = x; // n�o compila, pois pode estar perdendo informa��o
		
		long x = 10000;
		int k = (int) x;
		
		//float a = 1.0; // n�o compila, o java entende que numero decimal � sempre double
		//System.out.println(a);
		
		float a = (float)0.0;
		
		
		
		
		
		
	}
}
