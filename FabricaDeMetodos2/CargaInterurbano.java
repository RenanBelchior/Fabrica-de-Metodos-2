package Exercicio3FactoryMethod;

import java.util.Calendar;

public class CargaInterurbano extends Carga{
	public CargaInterurbano(String origem, String destino, Calendar DataHoraSaida) {
		super(origem, destino, DataHoraSaida);
	}
	public void exibirDetalhes() {
		System.out.println("Carga do Caminhão urbano ->" + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
	}

}
