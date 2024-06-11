package dtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VehiculoDto {

	long idVehiculo;
	String matricula = "aaaaa";
	boolean esHistorico = false;
	LocalDate fechaMatriculacion;
	@Override
	public String toString() {
		String idString = String.valueOf(idVehiculo);
		String esHistoricoString = String.valueOf(esHistorico);
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fechaMatriculacionString = fechaMatriculacion.format(formato);
		
		
		String toString = "id: ".concat(idString).concat(" Matricula: ").concat(matricula).concat(" es Historico: ").concat(esHistoricoString).concat(" fecha Matriculacion: ").concat(fechaMatriculacionString);
		return toString;
	}


	
	
	
	
	public long getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isEsHistorico() {
		return esHistorico;
	}
	public void setEsHistorico(boolean esHistorico) {
		this.esHistorico = esHistorico;
	}
	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}
	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}
	
	
	
	
	public VehiculoDto(long idVehiculo, String matricula, boolean esHistorico, LocalDate fechaMatriculacion) {
		super();
		this.idVehiculo = idVehiculo;
		this.matricula = matricula;
		this.esHistorico = esHistorico;
		this.fechaMatriculacion = fechaMatriculacion;
	}
	
	
	public VehiculoDto() {
		super();
	}
}
