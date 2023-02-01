package br.com.gft.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.main.Main;
import br.com.gft.model.Veiculo;

public class VeiculoTest {
	
	private Veiculo veiculo;
	
	@Before
	public void setUp() {
		veiculo = new Veiculo("Fiat","Uno","kjhg989","Verde", 0, false, 10, 0, 30000);
		Veiculo.ligar();
	}
	
	@Test
	public void testaMain() {
		Main.main(new String[] {});
	}
	
	@Test
	public void deveChecarSeMetodoLigarFunciona() throws Exception{
		assertTrue(veiculo.isLigado());
	}
	
	@Test
	public void deveChecarSeMetodoDesligarFunciona() throws Exception{
		Veiculo.desligar();
		
		assertFalse(veiculo.isLigado());
	}
	
	@Test
	public void deveChecarSeCarroEstaParadoParaPoderDesligar() throws Exception{
		assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	public void deveChecarSeMetodoAcelerarAcrescentaNaVelocidade() throws Exception{
		Veiculo.acelerar();
		
		assertEquals(20, veiculo.getVelocidade());
	}
	
	@Test
	public void deveChecarSeMetodoFrearDiminuiNaVelocidade() throws Exception{
		Veiculo.acelerar(); 
		Veiculo.acelerar();
		Veiculo.frear();
		
		assertEquals(20, veiculo.getVelocidade());
	}
	
	@Test
	public void deveChecarSeMetodoFrearTemZeroComoLimite() throws Exception{
		Veiculo.setVelocidade(15);
		Veiculo.frear();
		
		assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	public void deveChecarSeMetodoAbastecerAcrescentaCombustivelNoTanque() throws Exception{
		Veiculo.abastecer(20);
		
		assertEquals(30, Veiculo.getLitrosCombustivel());
	}
	
	@Test
	public void deveChecarSeMetodoAbastecerObedeceLimiteDoTanque() throws Exception{
		String mensagemTanqueAlemDoLimite = "Mais combustível do que o necessário";
		
		assertEquals(mensagemTanqueAlemDoLimite, Veiculo.abastecer(70));
	}
	
	@Test
	public void deveChecarSeMetodoPintarMudaACorDoVeiculo() throws Exception{
		assertEquals("Vermelho", Veiculo.pintar("Vermelho"));
	}
	
	
	
	
	
	
}
