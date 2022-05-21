package br.ufrn.imd.visao;

import br.ufrn.imd.dao.Repositorio;
import br.ufrn.imd.modelo.Carro;
import br.ufrn.imd.modelo.Moto;
import br.ufrn.imd.modelo.Taxi;
import br.ufrn.imd.modelo.Veiculo;

public class Visao {

	public static void main(String[] args) {
		
		//Criando dois objetos do tipo carro
		Veiculo carro1 = new Carro();
		Veiculo carro2 = new Carro();
		//Instanciando seus atributos
		carro1.setQuilometragem_mensal(20);
		((Carro)carro1).setMotor(1.0);
		carro2.setQuilometragem_mensal(50);
		((Carro)carro2).setMotor(2.0);
		
		//Criando dois objetos do tipo taxi
		Veiculo taxi1 = new Taxi();
		Veiculo taxi2 = new Taxi();
		//Instanciando seus atributos
		taxi1.setQuilometragem_mensal(25);
		taxi2.setQuilometragem_mensal(30);
		
		//Criando dois objetos do tipo moto
		Veiculo moto1 = new Moto();
		Veiculo moto2 = new Moto();
		//Instanciando seus atributos
		moto1.setQuilometragem_mensal(25);
		((Moto)moto1).setCilindrada(650);
		moto2.setQuilometragem_mensal(60);
		((Moto)moto2).setCilindrada(150);
		
		
		
		Repositorio repositorio = new Repositorio();
		
		repositorio.addVeiculo(carro1);
		repositorio.addVeiculo(carro2);
		repositorio.addVeiculo(taxi1);
		repositorio.addVeiculo(taxi2);
		repositorio.addVeiculo(moto1);
		repositorio.addVeiculo(moto2);
		
		repositorio.MostrarCarbono();
		
	}

}
