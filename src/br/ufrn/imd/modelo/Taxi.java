package br.ufrn.imd.modelo;

public class Taxi extends Veiculo implements ICarbonFootprint {

	private int quantidade_de_pessoas;

	public Taxi () {
		//
	}
	
	
	public int getQuantidade_de_pessoas() {
		return quantidade_de_pessoas;
	}


	public void setQuantidade_de_pessoas(int quantidade_de_pessoas) {
		this.quantidade_de_pessoas = quantidade_de_pessoas;
	}


	@Override
	public double getCarbonFootprint() {
		double carbono;
		carbono = quilometragem_mensal * 1.10;
		return carbono;
	}


	@Override
	public String toString() {
		return "Taxi [quantidade_de_pessoas=" + quantidade_de_pessoas + "]";
	}
	
	
}
