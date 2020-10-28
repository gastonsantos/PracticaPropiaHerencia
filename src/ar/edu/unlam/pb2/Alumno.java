package ar.edu.unlam.pb2;

public class Alumno  extends Persona{
	
	private Integer legajo;
	private Boolean vip;
	
	public Alumno(Integer edad, String nombre, String apellido, Integer legajo,Integer dni, Boolean vip) {
		super(edad, nombre, apellido, dni);
		this.legajo = legajo;
		this.vip = vip;
		
		
	}
	
	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	
	
	

	
	
	

}
