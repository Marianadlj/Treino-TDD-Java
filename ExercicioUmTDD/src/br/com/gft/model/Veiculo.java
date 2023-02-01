package br.com.gft.model;

public class Veiculo {
	 private String Marca;
	 private String Modelo;
	 private String Placa;
	 private static String Cor;
	 private float Km;
	 private static boolean isLigado;
	 private static int litrosCombustivel;
	 private static int Velocidade;
	 private double Preco;
	 
	 
	 public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco) {
		super();
		Marca = marca;
		Modelo = modelo;
		Placa = placa;
		Cor = cor;
		Km = km;
		Veiculo.isLigado = isLigado;
		Veiculo.litrosCombustivel = litrosCombustivel;
		Velocidade = velocidade;
		Preco = preco;
	 }

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public float getKm() {
		return Km;
	}

	public void setKm(float km) {
		Km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		Veiculo.isLigado = isLigado;
	}

	public static int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public static void setLitrosCombustivel(int litrosCombustivel) {
		Veiculo.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public static void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}
	
	public static boolean ligar() {
		if(!isLigado){
            isLigado = true;
            return true;
        }
        return true;
	}

	public static boolean desligar() {
		if(Velocidade == 0){
            isLigado = false;
            return false;
        }
        return isLigado;
	}

	public static int acelerar() {
		if(isLigado){
            Velocidade = Velocidade + 20;
        }
        return Velocidade;
	}
	
	public static int frear() {
		if(Velocidade >= 20){
            Velocidade = Velocidade - 20;
        } else if (Velocidade > 0 && Velocidade < 20){
            Velocidade = 0;
        }
        return Velocidade;
		
	}

	public static String abastecer(int combustivel) {
		int necessidadeDoTanque = 60 - getLitrosCombustivel();

        if (combustivel > necessidadeDoTanque) {
            return "Mais combustível do que o necessário";
        } else {
            setLitrosCombustivel(litrosCombustivel + combustivel);
            return "Abastecido com sucesso!";
        }
		
	}

	public static String pintar(String cor) {
		Cor = cor;
        return Cor;
		
	}
	 
}
