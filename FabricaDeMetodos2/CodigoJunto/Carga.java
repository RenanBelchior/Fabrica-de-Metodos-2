package Exercicio3FactoryMethod.CodigoJunto;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Carga {
	 private String origem;
	    private String destino;
	    private Calendar DataHoraSaida;
	    
	    protected SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyy HH:mm");
		
		public Carga(String origem, String destino, Calendar DataHoraSaida) {
			this.setOrigem(origem);
			this.setDestino(destino);
			this.setDataHoraSaida(DataHoraSaida);

		}
		public abstract void exibirDetalhes();
		
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public String getOrigem() {
			return origem;
		}
		public void setOrigem(String origem) {
			this.origem = origem;
		}
		public Calendar getDataHoraSaida() {
			return DataHoraSaida;
		}
		public void setDataHoraSaida(Calendar dataHoraSaida) {
			this.DataHoraSaida = dataHoraSaida;
		}
		
//INICIO EXTENDS CARGA//
public class CargaInterurbano extends Carga{
		public CargaInterurbano(String origem, String destino, Calendar DataHoraSaida) {
			super(origem, destino, DataHoraSaida);
			}
		public void exibirDetalhes() {
				System.out.println("Carga do Caminhão urbano ->" + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
			}
		}
public class CargaUrbano extends Carga{
	public CargaUrbano(String origem, String destino, Calendar DataHoraSaida) {
		super(origem, destino, DataHoraSaida);
	}
	public void exibirDetalhes() {
		System.out.println("Carga do Caminhão Interurbano ->" + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
	}
  }

//INICIO CLASSE ABSTRATA//
public abstract class EmpresaCarga {
	public abstract Carga emiteCarga(String origem, String destino, Calendar DataHoraSaida);
 }
public class EmpresaCargaInterurbano extends EmpresaCarga {
	public Carga emiteCarga(String origem, String destino, Calendar DataHoraSaida) {
		return new CargaInterurbano(origem, destino, DataHoraSaida);
	}
   }
public class EmpresaCargaUrbano extends EmpresaCarga {
	 public Carga emiteCarga(String origem, String destino, Calendar DataHoraSaida) {
		 return new CargaUrbano(origem, destino, DataHoraSaida);
	 }	
   }
}