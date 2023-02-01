package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo carro1 = new Veiculo("Fiat",
                "Uno",
                "kjhg989",
                "Verde",
                0,
                false,
                10,
                0,
                30000);


        Veiculo.pintar("Rosa");
        Veiculo.ligar();
        Veiculo.abastecer(30);
        System.out.println(Veiculo.getLitrosCombustivel()); //saida = 40
        System.out.println(carro1.getCor());  //saida = Rosa
        System.out.println(carro1.isLigado()); //saida = true
        System.out.println(Veiculo.abastecer(60)); //saida = Mais combustível do que o necessário

        Veiculo.acelerar();
        Veiculo.acelerar();
        System.out.println(carro1.getVelocidade()); // saida = 40

        Veiculo.frear();
        Veiculo.frear();
        Veiculo.desligar();
        System.out.println(carro1.getVelocidade()); // saida = 0
        System.out.println(carro1.isLigado()); //saida = false
		
	}

}
