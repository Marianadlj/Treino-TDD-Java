package br.com.gft.model;

public class Gerente extends Funcionario{

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}
	
	public static double getBonificacao() {
		double salarioBonificado = getSalario() + 10000.0;
		return salarioBonificado;
	}
	
	public static String imprimirFuncionario() {
		return "Nome: " + getNome() + ", salario, já com bonificação: " + getBonificacao();
	}
	

}
