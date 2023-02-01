package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	 private String marca;
	 private static String modelo;
	 private boolean isUsado;
	 
	 public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		 super(nome, preco, qtd);
		 this.marca = marca;
		 VideoGame.modelo = modelo;
		 this.isUsado = isUsado;
	 }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		VideoGame.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	
	@Override
    public double calculaImposto() {
        double ImpostoVideoGameUsado;
        double ImpostoVideoGameNovo;
        if(!isUsado){
            ImpostoVideoGameNovo = getPreco() * 0.45;
            return ImpostoVideoGameNovo;
        } else{
            ImpostoVideoGameUsado = getPreco() * 0.25;
            return ImpostoVideoGameUsado;
        }
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Video-game: ");
		builder.append(getNome());
		builder.append(", preço: ");
		builder.append(getPreco());
		builder.append(", quantidade: ");
		builder.append(getQtd());
		builder.append(" em estoque.");
		return builder.toString();
	}
	
	
}
