package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private static String Nome;
    private String cnpj;
    private static List<Livro> livros = new ArrayList<>();
    private static List<VideoGame> videoGames = new ArrayList<>();
    
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		Loja.Nome = nome;
		this.cnpj = cnpj;
		Loja.livros = livros;
		Loja.videoGames = videoGames;
	}

	public static String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		Loja.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		Loja.videoGames = videoGames;
	}
    
	public static String listaLivros (){
        if(livros.isEmpty()){
            return "A loja não tem livros no seu estoque.";
        } else {
            for (Livro livro: livros) {
                return livros.toString();
            }
        }
        return null;
    }
	
	public static String listaVideoGames (){
        if(videoGames.isEmpty()){
            return "A loja não tem video-games no seu estoque.";
        } else{
            for (VideoGame game: videoGames) {
                return videoGames.toString();
            }
        }
        return null;
    }
	
	public static double calculaPatrimonio(){
        double patrimonioTotal = 0;
        for (Livro livro: livros) {
            patrimonioTotal = patrimonioTotal + (livro.getPreco() * livro.getQtd());
        }
        for (VideoGame game: videoGames) {
            patrimonioTotal = patrimonioTotal + (game.getPreco() * game.getQtd());
        }
        return patrimonioTotal;
    }

}
