package Exercicio3FactoryMethod.CodigoJunto;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Exercicio3FactoryMethod.Carga;
import Exercicio3FactoryMethod.EmpresaCarga;
import Exercicio3FactoryMethod.EmpresaCargaInterurbano;
import Exercicio3FactoryMethod.EmpresaCargaUrbano;

public class PainelPrincipal {

	public static void main(String[] args) {
		EmpresaCarga Frotalocal = new EmpresaCargaInterurbano();
		EmpresaCarga FrotaInterurbano = new EmpresaCargaUrbano();
		
		Carga CargaUrbano = Frotalocal.emiteCarga("Niterói","Maricá", new GregorianCalendar(2022, Calendar.MARCH, 10,11,0));
		Carga CargaInterurbano = FrotaInterurbano.emiteCarga("Rio de Janeiro","Florianópolis", new GregorianCalendar(2022, Calendar.MARCH, 10,11,0));
	
	    CargaUrbano.exibirDetalhes();
	    CargaInterurbano.exibirDetalhes();
	
	}
}
