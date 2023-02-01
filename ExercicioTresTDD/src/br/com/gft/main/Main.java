package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Guerreiro;
import br.com.gft.model.Mago;

public class Main {

	public static void main(String[] args) {
		List<String> Magia = new ArrayList<>();
        List<String> habilidade = new ArrayList<>();
        List<Object> contar = new ArrayList<>();

        Mago mago1 = new Mago("Gandalf", 10, 10, 3.0, 15, 6, 1, Magia);
        Mago mago2 = new Mago("Dumbledore", 7, 13, 2.0, 20, 5, 1, Magia);
        Guerreiro guerreiro1 = new Guerreiro("Jamie Lannister", 12, 0, 2.0,10,10,1, habilidade);
        Guerreiro guerreiro2 = new Guerreiro("Sandor Clegane", 15, 0, 2.0,8,15, 1, habilidade);

        contar.add(mago2);
        contar.add(mago1);
        contar.add(guerreiro2);
        contar.add(guerreiro1);

        System.out.println("O jogo possui " + contar.size() + " personagens.");
        System.out.println("....................................................");

        mago1.aprenderMagia("Telecinese");
        mago1.aprenderMagia("Expurgação");
        mago1.lvlUp();
        System.out.println(mago1.getNome() + " upou para o level: " + mago1.getLevel());
        System.out.println("Agora ganhou +1 em todas as categorias e +2 nas suas especialidades. Inteligência agoara é: " + mago1.getInteligencia() + " e a Mana agora é: " + mago1.getMana());
        System.out.println("Magias disponíveis para uso: " + mago1.getMagia());
        System.out.println("Para seu proximo ataque, a pontuação é: " + mago1.attack());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        mago2.aprenderMagia("Alohomora");
        mago2.aprenderMagia("Expectro Patronum");
        mago2.lvlUp();
        System.out.println(mago2.getNome() + " upou para o level: " + mago2.getLevel());
        System.out.println("Agora ganhou +1 em todas as categorias e +2 nas suas especialidades. Inteligência agoara é: " + mago2.getInteligencia() + " e a Mana agora é: " + mago2.getMana());
        System.out.println("Magias disponíveis para uso: " + mago2.getMagia());
        System.out.println("Para seu proximo ataque, a pontuação é: " + mago2.attack());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        guerreiro1.aprenderHabilidade("Uso de duas espadas");
        guerreiro1.lvlUp();
        System.out.println(guerreiro1.getNome() + " upou para o level: " + guerreiro1.getLevel());
        System.out.println("Agora ganhou +1 em todas as categorias e +2 nas suas especialidades. Força agoara é: " + guerreiro1.getForca() + " e a sua Vida agora é: " + guerreiro1.getVida());
        System.out.println("Habilidades disponíveis para uso: " + guerreiro1.getHabilidade());
        System.out.println("Para seu proximo ataque, a pontuação é: " + guerreiro1.attack());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        guerreiro2.aprenderHabilidade("Esmagar olhos");
        guerreiro2.lvlUp();
        System.out.println(guerreiro2.getNome() + " upou para o level: " + guerreiro2.getLevel());
        System.out.println("Agora ganhou +1 em todas as categorias e +2 nas suas especialidades. Força agoara é: " + guerreiro2.getForca() + " e a sua Vida agora é: " + guerreiro2.getVida());
        System.out.println("Habilidades disponíveis para uso: " + guerreiro2.getHabilidade());
        System.out.println("Para seu proximo ataque, a pontuação é: " + guerreiro2.attack());

	}

}
