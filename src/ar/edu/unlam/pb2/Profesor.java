package ar.edu.unlam.pb2;

public class Profesor extends Persona {
	private Double sueldo;
	private Integer IdProf;
	
	
	public Profesor(Integer edad, String nombre, String apellido, Double sueldo, Integer IdProf, Integer dni) {
		super(edad, nombre, apellido, dni);
		this.sueldo = sueldo;
		this.IdProf = IdProf;
		
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public Integer getNumDeProf() {
		return IdProf;
	}
	public void setNumDeProf(Integer numDeProf) {
		this.IdProf = numDeProf;
	}
	
	

	
	

}
