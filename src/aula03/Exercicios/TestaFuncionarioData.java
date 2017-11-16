package aula03.Exercicios;

public class TestaFuncionarioData {
	public static void main(String[] args) {
			
			Funcionario f1 = new Funcionario();
			
			 f1.setNome("Luiz");
			 f1.setDepartamento("Suporte");
			 f1.salario = 1000;
			 f1.numRG = "12345678";
			 
			 Data d = new Data();
			 f1.dataDeAdmissao = d;
			 f1.dataDeAdmissao.dia = 12;
			 f1.dataDeAdmissao.mes = 3;
			 f1.dataDeAdmissao.ano = 2017;
			 
			 
			 f1.mostra();
			 
			 
		}
}
