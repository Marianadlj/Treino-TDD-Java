package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Pessoa;
import br.com.gft.model.ListagemPessoas;

public class Main {

	public static void main(String[] args) {
		
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		ListagemPessoas.adicionaPessoas(listaPessoas);
		
		System.out.println((ListagemPessoas.retornaLista(listaPessoas)).toString());
		
		System.out.println("Nome da pessoa mais velha da lista é: " + ListagemPessoas.retornaPessoaMaisVelha(listaPessoas));
		
		System.out.println("Na lista existem: " + ListagemPessoas.contaQuantasPessoasTemNaLista(listaPessoas) + " pessoas no total."); 
		
		ListagemPessoas.excluirMenoresDeIdade(listaPessoas);
		
		System.out.println("Agora, depois de excluir os menores de idade, a lista têm: " + ListagemPessoas.contaQuantasPessoasTemNaLista(listaPessoas) + " pessoas no total.");
				
		if(ListagemPessoas.isJessicaNaLista(listaPessoas)) {
			System.out.println("A idade de Jessica é: " + ListagemPessoas.consultarIdade(listaPessoas, "Jessica"));
		}
	
	}

}
