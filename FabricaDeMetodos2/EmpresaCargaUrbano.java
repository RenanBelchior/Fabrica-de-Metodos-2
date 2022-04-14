package Exercicio3FactoryMethod;

import java.util.Calendar;

public class EmpresaCargaUrbano extends EmpresaCarga {
 public Carga emiteCarga(String origem, String destino, Calendar DataHoraSaida) {
	 return new CargaUrbano(origem, destino, DataHoraSaida);
 }
	
}
