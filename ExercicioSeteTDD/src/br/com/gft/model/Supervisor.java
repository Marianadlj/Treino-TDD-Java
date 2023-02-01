package br.com.gft.model;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	public static double getBonificacao() {
		double salarioBonificado = getSalario() + 5000.0;
		return salarioBonificado;
	}
	
	public static String imprimirFuncionario() {
		return "Nome: " + getNome() + ", salario, já com bonificação: " + getBonificacao();
	}

}
