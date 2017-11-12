package Aula02;

public class casting {
	
	/* ================   TESTES DE CASTING   ============================= */
	
	public static void main(String[] args) {
		
		short	numeroShort	=		3;
		char	cChar		=	 'a';
		int		numeroInt	=	 0;
		long 	numeroLong	=	456;
//		float	numeroFloat =	3.14;		// Java n�o deixa declarar assim, O java entende que voc� est� tentando transforma um Double em um Float sem usar Casting
//		float	numeroFloat =	(float)3.14;// Assim funciona ou na forma abaixo
		float	numeroFloatf = 3.2f;		// � preciso colocar o f no final do N�mero
		double	numeroDouble	=	3.14;
		
		
		/* Tentando fazer casting de Short = Char */
		System.out.println(cChar);
		cChar = (char) numeroShort; // Java N�O transforma o n�mero em caracter
		System.out.println(cChar);
		/* ----------------------------------------------------------------- */
		
		/* Tentando fazer casting de Short = Int */
		
		numeroInt = numeroShort;
		System.out.println(numeroInt); // Casting autom�tico Short = Int
		/* ----------------------------------------------------------------- */
		
		/* Tentando fazer casting de Float = Long */
		numeroFloatf = numeroLong;		// Casting autom�tico Float = Short
		System.out.println(numeroFloatf);
		/* ----------------------------------------------------------------- */
		/* Tentando fazer casting de Double = Float */
		numeroDouble = numeroFloatf;	// Casting Autom�tico - Dependendo da casa decimal, acrescenta d�gitos
		System.out.println(numeroFloatf);
		System.out.println(numeroDouble);
//		numeroFloatf = numeroDouble;  Java n�o converte Double para Float
		/* ----------------------------------------------------------------- */
		
		
	}
}
