package br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
	
	private List<String> Magia;
	
	public Mago(String nome, int vida, int mana, double xp, int inteligencia, int forca, int level, List<String> magia) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        Magia = magia;
    }

	public List<String> getMagia() {
		return Magia;
	}

	public void setMagia(List<String> magia) {
		Magia = magia;
	}
	
	 @Override
	 public void lvlUp() {
	        setVida(getVida()+1);
	        setMana(getMana()+2);
	        setXp(getXp()+1);
	        setInteligencia(getInteligencia()+2);
	        setForca(getForca()+1);
	        setLevel(getLevel()+1);
	    }
	 
	 public int attack(){
		 int min = 0;
		 int max = 301;

	     Random random = new Random();

	     int dadoMultilateral = random.nextInt(min, max);

	     return (getInteligencia() * getLevel()) + dadoMultilateral;
	  }
	  
	  public void aprenderMagia(String magia){
		  Magia.add(magia);
	  }
}
