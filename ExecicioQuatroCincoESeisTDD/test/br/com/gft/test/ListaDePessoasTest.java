package br.com.gft.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import br.com.gft.model.ListagemPessoas;
import br.com.gft.model.Pessoa;

public class ListaDePessoasTest {
	
	List<Pessoa> listaPessoas;
	
	@Before
	public void setUp() {
		listaPessoas = new ArrayList<>();
		ListagemPessoas.adicionaPessoas(listaPessoas);
	}
	
	
	@Test
	public void deveAdicionarPessoaAListaDePessoas() throws Exception {	
		assertNotNull(listaPessoas);
	}
	
	@Test
	public void deveRetornarONomeDoMaisVelhoDaLista() throws Exception {
		assertEquals("Leandro", ListagemPessoas.retornaPessoaMaisVelha(listaPessoas));
	}
	
	@Test
	public void deveConferirSeForamExcluidosOsMenoresDeIdadeDaLista() throws Exception {
		assertNotEquals(listaPessoas.size(),(ListagemPessoas.excluirMenoresDeIdade(listaPessoas)).size());
	}
	
	@Test
	public void deveCompararOTamanhoDaListaAntesEDepoisDeRemoverOsMenoresDeIdade() throws Exception {
		assertEquals(listaPessoas.size(), ListagemPessoas.contaQuantasPessoasTemNaLista(listaPessoas));
		assertEquals((ListagemPessoas.excluirMenoresDeIdade(listaPessoas)).size() , ListagemPessoas.contaQuantasPessoasTemNaLista(listaPessoas));
		
	}
	
	@Test
	public void deveConferirSeJessicaEstaNaListaEVerificarSuaIdade() throws Exception {
		ListagemPessoas.excluirMenoresDeIdade(listaPessoas);
		
		assertTrue(ListagemPessoas.isJessicaNaLista(listaPessoas));
		assertEquals(18,ListagemPessoas.consultarIdade(listaPessoas, "Jessica"));
		
	}
	
}
