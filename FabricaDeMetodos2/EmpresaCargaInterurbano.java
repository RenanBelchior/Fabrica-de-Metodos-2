package Exercicio3FactoryMethod;

import java.util.Calendar;

public class EmpresaCargaInterurbano extends EmpresaCarga {
	public Carga emiteCarga(String origem, String destino, Calendar DataHoraSaida) {
		return new CargaInterurbano(origem, destino, DataHoraSaida);
	}

}
