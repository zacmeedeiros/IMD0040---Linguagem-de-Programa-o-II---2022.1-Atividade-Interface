package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.ICarbonFootprint;
import br.ufrn.imd.modelo.Veiculo;

public class Repositorio {

	private ArrayList<Veiculo> repositorio = new ArrayList<>();
	
	public void addVeiculo (Veiculo veiculo) {
		repositorio.add(veiculo);
	}
	
	public void removerVeiculo (Veiculo veiculo) {
		repositorio.remove(veiculo);
	}
	
	public void MostrarCarbono() {
		for(Veiculo x : repositorio) {
			System.out.println("««««««««««««««««««««««««««««««««««««««««««");
			System.out.println(x);
			System.out.println(((ICarbonFootprint)x).getCarbonFootprint());
		}
	}
}
