package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;

public class ListagemPessoas {
	
	public static void adicionaPessoas(List<Pessoa> listaPessoas) {
		listaPessoas.add(new Pessoa("João", 15));
		listaPessoas.add(new Pessoa("Leandro", 21));
		listaPessoas.add(new Pessoa("Paulo", 17));
		listaPessoas.add(new Pessoa("Jessica", 18));
	}

	public static List<Pessoa> retornaLista(List<Pessoa> listaPessoas) {
		return listaPessoas;
	}
	
	public static String retornaPessoaMaisVelha(List<Pessoa> listaPessoas) {
		
		String nomeDoMaisVelho = null;
        int idadeDoMaisVelho = 0;
        
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getIdade() > idadeDoMaisVelho) {
                idadeDoMaisVelho = pessoa.getIdade();
                nomeDoMaisVelho = pessoa.getNome();
            }
        }
        return nomeDoMaisVelho;
	}

	public static List<Pessoa> excluirMenoresDeIdade(List<Pessoa> listaPessoas) {    
		for (int contador = listaPessoas.size() - 1; contador >= 0; contador--) {
			if(listaPessoas.get(contador).getIdade() < 18){
                listaPessoas.remove(listaPessoas.get(contador));
            }
		}
		return listaPessoas;
	}
	
	public static int contaQuantasPessoasTemNaLista(List<Pessoa> listaPessoas) {
		int contarPessoas = 0;
		for (Pessoa pessoa : listaPessoas) {
			contarPessoas++;
		}
		return contarPessoas;
	}

	public static boolean isJessicaNaLista(List<Pessoa> listaPessoas) {
		boolean presente = false;  
		for (Pessoa pessoa : listaPessoas) {
			if(pessoa.getNome() == "Jessica") {
				presente = true;
			}
		}
		return presente;
	}
	
	public static int consultarIdade(List<Pessoa> listaPessoas,String nome) {
		for (Pessoa pessoa : listaPessoas) {
			if(pessoa.getNome() == nome) {
				return pessoa.getIdade();
			}
		}
		return 0;
	}
	
	
}
