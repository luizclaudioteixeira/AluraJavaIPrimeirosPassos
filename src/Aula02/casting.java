package Aula02;

public class casting {
	
	/* ================   TESTES DE CASTING   ============================= */
	
	public static void main(String[] args) {
		
		short	numeroShort	=		3;
		char	cChar		=	 'a';
		int		numeroInt	=	 0;
		long 	numeroLong	=	456;
//		float	numeroFloat =	3.14;		// Java não deixa declarar assim, O java entende que vocÊ está tentando transforma um Double em um Float sem usar Casting
//		float	numeroFloat =	(float)3.14;// Assim funciona ou na forma abaixo
		float	numeroFloatf = 3.2f;		// É preciso colocar o f no final do Número
		double	numeroDouble	=	3.14;
		
		
		/* Tentando fazer casting de Short = Char */
		System.out.println(cChar);
		cChar = (char) numeroShort; // Java NÃO transforma o número em caracter
		System.out.println(cChar);
		/* ----------------------------------------------------------------- */
		
		/* Tentando fazer casting de Short = Int */
		
		numeroInt = numeroShort;
		System.out.println(numeroInt); // Casting automático Short = Int
		/* ----------------------------------------------------------------- */
		
		/* Tentando fazer casting de Float = Long */
		numeroFloatf = numeroLong;		// Casting automático Float = Short
		System.out.println(numeroFloatf);
		/* ----------------------------------------------------------------- */
		/* Tentando fazer casting de Double = Float */
		numeroDouble = numeroFloatf;	// Casting Automático - Dependendo da casa decimal, acrescenta dígitos
		System.out.println(numeroFloatf);
		System.out.println(numeroDouble);
//		numeroFloatf = numeroDouble;  Java não converte Double para Float
		/* ----------------------------------------------------------------- */
		
		
	}
}
