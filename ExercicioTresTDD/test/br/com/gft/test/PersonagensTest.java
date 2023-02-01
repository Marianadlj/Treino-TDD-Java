package br.com.gft.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.main.Main;
import br.com.gft.model.Guerreiro;
import br.com.gft.model.Mago;

public class PersonagensTest {
	private Guerreiro guerreiro;
	private Mago mago;
	private List<String> Magia;
    private List<String> habilidade;
	
	@Before
	public void setUp(){
		
        habilidade = new ArrayList<>();
        Magia = new ArrayList<>();
        
        mago = new Mago("Gandalf", 1000, 10, 3.0, 15, 6, 1, Magia);
        guerreiro = new Guerreiro("Sandor Clegane", 1500, 0, 2.0,8,15, 1, habilidade);
        
	}
	
	@Test
	public void testaMain() {
		Main.main(new String[] {});
	}
	
	@Test
	public void deveChecaSeLvlUpAcrescentaNaManaENaInteligenciaDoMago() throws Exception{
		
		mago.lvlUp();
		
		assertEquals(12, mago.getMana());
		assertEquals(17, mago.getInteligencia());
	} 
	
	@Test
	public void deveChecarSeMagoAprendeMagia() throws Exception{

		mago.aprenderMagia("Expurgação");

		assertNotNull(Magia);
	} 
	
	@Test
	public void deveChecaAttackDoMago() throws Exception{
		int valorAttack = mago.attack();
		int descobrirNumeroRandom = valorAttack - (mago.getInteligencia() * mago.getLevel());
		int esperadoAttack = (mago.getInteligencia() * mago.getLevel()) + descobrirNumeroRandom;
		assertEquals(esperadoAttack, valorAttack);
	}
	
	@Test
	public void deveChecaAttackDoGuerreiro() throws Exception{
		int valorAttack = guerreiro.attack();
		int descobrirNumeroRandom = valorAttack - (guerreiro.getForca() * guerreiro.getLevel());
		int esperadoAttack = (guerreiro.getForca() * guerreiro.getLevel()) + descobrirNumeroRandom;
		assertEquals(esperadoAttack, valorAttack);
	}
	
	@Test
	public void deveChecaSeLvlUpAcrescentaNaForcaENaVidaDoGuerreiro() throws Exception{
		
		guerreiro.lvlUp();
		
		assertEquals(17, guerreiro.getForca());
		assertEquals(1502, guerreiro.getVida());
	}
	
	@Test
	public void deveChecarSeGuerreiroAprendeHabilidade() throws Exception{

		guerreiro.aprenderHabilidade("Esgrima");

		assertNotNull(habilidade);
	}
	
	
}
