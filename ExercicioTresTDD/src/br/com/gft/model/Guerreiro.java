package br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{
	
    private List<String> Habilidade;

    public Guerreiro(String nome, int vida, int mana, double xp, int inteligencia, int forca, int level, List<String> habilidade) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        Habilidade = habilidade;
    }

    public List<String> getHabilidade() {
        return Habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        Habilidade = habilidade;
    }

    @Override
    public void lvlUp() {
        setVida(getVida()+2);
        setMana(getMana()+1);
        setXp(getXp()+1);
        setInteligencia(getInteligencia()+1);
        setForca(getForca()+2);
        setLevel(getLevel()+1);
    }

    public int attack(){
        int min = 0;
        int max = 300;

        Random random = new Random();

        int dadoMultilateral = random.nextInt(min, max);

        return (getForca() * getLevel()) + dadoMultilateral;
    }

    public void aprenderHabilidade(String habilidade){
        Habilidade.add(habilidade);
    }
}
