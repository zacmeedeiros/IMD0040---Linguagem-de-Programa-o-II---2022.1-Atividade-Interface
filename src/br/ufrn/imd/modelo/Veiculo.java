package br.ufrn.imd.modelo;

public class Veiculo {

	protected int quilometragem_mensal;
	
	public Veiculo () {
		//
	}

	public int getQuilometragem_mensal() {
		return quilometragem_mensal;
	}

	public void setQuilometragem_mensal(int quilometragem_mensal) {
		this.quilometragem_mensal = quilometragem_mensal;
	}
	
	public double calcular_combustivel () {
		return 0;
	}
}
