package br.com.gft.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.gft.model.Gerente;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;

public class FuncionariosTest {
	
	private Gerente gerente;
	private Supervisor supervisor;
	private Vendedor vendedor;
    
	
	@Test
	public void deveRetornarOSalarioComBonificacaoDoGerente() throws Exception {
		gerente = new Gerente("Sheila", 46, 15000);
		
		assertEquals(25000.0, Gerente.getBonificacao(), 0.01);
	}
	
	@Test
	public void deveRetornarOSalarioComBonificacaoDoSupervisor() throws Exception {
		supervisor = new Supervisor("Claudio", 27, 6000);
		
		assertEquals(11000.0, Supervisor.getBonificacao(), 0.01);
	}

	@Test
	public void deveRetornarOSalarioComBonificacaoDoVendedor() throws Exception {
		vendedor = new Vendedor("Marcio", 22, 2500);
		
		assertEquals(5500.0, Vendedor.getBonificacao(), 0.01);
	}
	
	@Test
	public void deveConferirASaidaNoConsoleDoGerente() throws Exception {
		Gerente gerente = new Gerente("Marcia lima", 41, 6000);
		
		String esperado = "Nome: Marcia lima, salario, já com bonificação: 16000.0";
		assertEquals(esperado, Gerente.imprimirFuncionario());
	}
	
	@Test
	public void deveConferirASaidaNoConsoleDoSupervisor() throws Exception {
		Supervisor supervisor = new Supervisor("Jean Mercur", 30, 3000);
		
		String esperado = "Nome: Jean Mercur, salario, já com bonificação: 8000.0";
		assertEquals(esperado, Supervisor.imprimirFuncionario());
	}
	
	@Test
	public void deveConferirASaidaNoConsoleDoVendedor() throws Exception {
		Vendedor vendedor = new Vendedor("Lidya Guerra", 21, 1500); 
		
		String esperado = "Nome: Lidya Guerra, salario, já com bonificação: 4500.0";
		assertEquals(esperado, Vendedor.imprimirFuncionario());
	}

}
