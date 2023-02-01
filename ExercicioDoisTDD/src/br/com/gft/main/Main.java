package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.Produto;
import br.com.gft.model.VideoGame;

public class Main {

	public static void main(String[] args) {
		
		List<Livro> livros = new ArrayList<>();
		List<VideoGame> videoGames = new ArrayList<>();
        
        livros.add(new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300));
        livros.add(new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500));
        livros.add(new Livro("Java POO", 20, 50, "GFT", "educativo", 500));

        
        videoGames.add(new VideoGame("PS4", 1800, 100, "Sony", "Slim", false));
        videoGames.add(new VideoGame("PS4", 1000, 7,"Sony", "Slim", true));
        videoGames.add(new VideoGame("XBOX", 1500, 500,"Microsoft", "One", false));

        Loja americanas = new Loja("Americanas", "12345678", livros, videoGames);
        
        System.out.println("R$ " + livros.get(1).calculaImposto() + " de impostos sobre o livro " + livros.get(1).getNome());
        System.out.println("Livro educativo não tem imposto: " + livros.get(2).getNome());
        System.out.println("Imposto PS4 Slim usado, " + videoGames.get(1).calculaImposto());
        System.out.println("Imposto PS4 Slim " + videoGames.get(0).calculaImposto());
        
        System.out.println("________________________________________________________ ");
        
        System.out.println("A loja " + Loja.getNome() + " possui estes livros para venda:");
        System.out.println(livros.get(0).toString());
        System.out.println(livros.get(1).toString());
        System.out.println(livros.get(2).toString());
        
        System.out.println("________________________________________________________ ");
        
        System.out.println("A loja " + Loja.getNome() + " possui estes video-games para venda:");
        System.out.println(videoGames.get(0).toString());
        System.out.println(videoGames.get(1).toString());
        System.out.println(videoGames.get(2).toString());
        
        System.out.println("________________________________________________________ ");
        System.out.println("A loja " + Loja.getNome() + " é de R$: " + Loja.calculaPatrimonio());

       

	}

}
