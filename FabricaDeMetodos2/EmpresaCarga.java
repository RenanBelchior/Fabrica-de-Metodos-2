
package Exercicio3FactoryMethod;

import java.util.Calendar;

public abstract class EmpresaCarga {
	public abstract Carga emiteCarga(String origem, String destino, Calendar DataHoraSaida);
}
