package dtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class propietarioDto {


	long id;
	String dni = "aaaaa";
	LocalDate fechaCompra;
	String matricula = "aaaaa";
	
	@Override
	public String toString() {
		String idString = String.valueOf(id);
		DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fechaString = fechaCompra.format(fechaFormato);
		
		String toString = "id :".concat(idString).concat(" dni: ").concat(getDni()).concat(" fechaCompra: ").concat(fechaString).concat(" matricula: ").concat(getMatricula());
		return toString;
		
	}


	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	public propietarioDto(long id, String dni, LocalDate fechaCompra, String matricula) {
		super();
		this.id = id;
		this.dni = dni;
		this.fechaCompra = fechaCompra;
		this.matricula = matricula;
	}
	
	
	public propietarioDto() {
		super();
	}
}
