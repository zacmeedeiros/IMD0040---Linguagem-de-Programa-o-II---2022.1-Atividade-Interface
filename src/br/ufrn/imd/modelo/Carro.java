package br.ufrn.imd.modelo;

public class Carro extends Veiculo implements ICarbonFootprint{
	
	private double motor;

	
	public Carro () {
		//
	}
	
	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}


	@Override
	public double getCarbonFootprint() {
		double carbono;
		if(motor > 2.0) {
			carbono = quilometragem_mensal * 1.85;
			return carbono;
		}
		else if(motor < 1.0) {
			carbono = quilometragem_mensal * 0.13;
			return carbono;
		}
		else {
			carbono = quilometragem_mensal * 1.22;
			return carbono;
		}
	}

	public Carro(double motor) {
		super();
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Carro [motor=" + motor + "]";
	}
	
}
