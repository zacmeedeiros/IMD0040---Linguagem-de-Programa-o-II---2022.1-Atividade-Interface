package br.ufrn.imd.modelo;

public class Moto extends Veiculo implements ICarbonFootprint{

	private int cilindrada;

	public Moto () {
		//
	}
	
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}



	@Override
	public double getCarbonFootprint() {
		double carbono;
		if(cilindrada > 650) {
			carbono = quilometragem_mensal * 0.65;
			return carbono;
		}
		else if(cilindrada < 150) {
			carbono = quilometragem_mensal * 0.20;
			return carbono;
		}
		else {
			carbono = quilometragem_mensal * 0.50;
			return carbono;
		}
	}


	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}
	
	
}
