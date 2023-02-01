package br.com.gft.model;

public class Funcionario {
	private static String Nome;
	private int Idade;
	private static double Salario;
	
	public Funcionario(String nome, int idade, double salario) {
		Funcionario.Nome = nome;
		this.Idade = idade;
		Funcionario.Salario = salario;
	}

	public static String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public static double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public static double getBonificacao() {
		return Salario;
	}
	
}
