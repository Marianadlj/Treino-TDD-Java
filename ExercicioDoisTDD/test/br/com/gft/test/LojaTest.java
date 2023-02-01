package br.com.gft.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.main.Main;
import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

public class LojaTest {
	
	private List<Livro> livros;
	private List<VideoGame> videoGames;
	private Loja loja;
	private Livro livro;
	private VideoGame videoGame;
	
	@Before
	public void setUp() {
		livros = new ArrayList<>();
		videoGames = new ArrayList<>();
        loja = new Loja(null, null, livros, videoGames);
        livro = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		videoGame = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
	}
	
	@Test
	public void testaMain() {
		Main.main(new String[] {});
	}
	
	@Test
	public void deveVerificarSeOImpostoEstaSendoCobradoCorretamenteNoLivro() throws Exception{
		assertEquals(4, livro.calculaImposto(), 0.001);
	}
	
	@Test
	public void deveVerificarSeOImpostoEstaSendoCobradoCorretamenteNoLivroEduativo() throws Exception{
		livro = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		assertEquals(0, livro.calculaImposto(), 0.001);
	}
	
	@Test
	public void deveVerificarSeOImpostoEstaSendoCobradoCorretamenteNoVideoGameNovo() throws Exception{
		assertEquals(810, videoGame.calculaImposto(), 0.001);
	}
	
	@Test
	public void deveVerificarSeOImpostoEstaSendoCobradoCorretamenteNoVideoGameUsado() throws Exception{
		videoGame = new VideoGame("PS4", 1000, 7,"Sony", "Slim", true);
		assertEquals(250, videoGame.calculaImposto(), 0.001);
	}
	
	@Test
	public void deveConferirSeAListaDeLivrosEstaVaziaESeRetornaMensagemDeEstoqueVazio() throws Exception{
		
   
		String mensagemEstoqueVazio = "A loja não tem livros no seu estoque.";
				
		assertTrue(livros.isEmpty());
		assertSame(mensagemEstoqueVazio, Loja.listaLivros());
	}
	
	@Test
	public void deveConferirSeAListaDeVideoGamesEstaVaziaESeRetornaMensagemDeEstoqueVazio() throws Exception{
        
		String mensagemEstoqueVazio = "A loja não tem video-games no seu estoque.";
		
		assertTrue(videoGames.isEmpty());
		assertSame(mensagemEstoqueVazio, Loja.listaVideoGames());
	}
	
	public void deveConferirSeOCalculoDoPatrimonioEstaFuncionando() throws Exception{
		
		livros.add(new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300));
		livros.add(new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500));
		livros.add(new Livro("Java POO", 20, 50, "GFT", "educativo", 500));
		
		videoGames.add(new VideoGame("PS4", 1800, 100, "Sony", "Slim", false));
		videoGames.add(new VideoGame("PS4", 1000, 7,"Sony", "Slim", true));
		videoGames.add(new VideoGame("XBOX", 1500, 500,"Microsoft", "One", false));
		
		assertEquals(941800, Loja.calculaPatrimonio(), 0.001);

	}
	
}
