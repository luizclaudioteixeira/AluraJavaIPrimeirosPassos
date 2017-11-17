package aula05.exercicios;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		//Funcionario f = new Funcionario();
		
		// f.salario = 1000; 
							// Modificador private no atributo salario não permite o acesso direto.
							// somente através de método set.
		
		Funcionario f1 = new Funcionario();
		
		 f1.setNome("Luiz");
		 f1.setDepartamento("Suporte");
		 f1.setSalario(1000);
		 
		 Data d1 = new Data();
		 
		 d1.setDia(03);
		 d1.setMes(04);
		 d1.setAno(2017);
		 
		 f1.setDataDeAdmissao(d1);
		
		 f1.setNumRG("12345678");
		 
		f1.mostra();
		 
		 System.out.println();
		 System.out.println(f1.getGanhoAnual());
		 f1.recebeAumento(500);
		 System.out.println(f1.getSalario());
		 System.out.println(f1.getGanhoAnual());

	}

}
