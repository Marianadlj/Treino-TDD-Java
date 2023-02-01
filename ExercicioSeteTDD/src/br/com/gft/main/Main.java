package br.com.gft.main;

import br.com.gft.model.Funcionario;
import br.com.gft.model.Gerente;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Marcia lima", 41, 6000);
		System.out.println(Gerente.imprimirFuncionario());
       
		Supervisor supervisor = new Supervisor("Jean Mercur", 30, 3000);
        System.out.println(Supervisor.imprimirFuncionario());
       
        Vendedor vendedor = new Vendedor("Lidya Guerra", 21, 1500);  
        System.out.println(Vendedor.imprimirFuncionario());
        
	}

}
