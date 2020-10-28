package ar.edu.unlam.pb2;

import java.util.HashSet;

public abstract class Curso {
	private Integer capacidad;
	private Double costo;
	private Integer IdCurso;
	private Profesor profesor1;
	private HashSet <Alumno> listaAlumnoCurso;
	
	
	
	public Integer cantidadDeAlumnosEncurso(){
		return listaAlumnoCurso.size();
	}
	
	public Double cantidadDeDineroGanadoEnCurso(){
		return listaAlumnoCurso.size()*costo;
	}
	

	
	
	//BUSCO ALUMNO EN CURSO????
	public Alumno buscoAlmuno (Integer dni){
		Alumno alumno1=null;
		for(Alumno e: listaAlumnoCurso){
			if(e.getDni().equals(dni)){
				alumno1= e;
			}
		}
		return alumno1;
	}
	
	
	
	
	public Curso(Double costo, Integer IdCurso, Profesor profesor1, Integer capacidad) {
		this.capacidad = capacidad;
		this.costo = costo;
		this.IdCurso = IdCurso;
		this.profesor1 = profesor1;
		listaAlumnoCurso = new HashSet<Alumno>();
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public HashSet<Alumno> getListaAlumnoCurso() {
		return listaAlumnoCurso;
	}
	public void setListaAlumnoCurso(HashSet<Alumno> listaAlumnoCurso) {
		this.listaAlumnoCurso = listaAlumnoCurso;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public Integer getIdCurso() {
		return IdCurso;
	}
	public void setIdCurso(Integer IdCurso) {
		this.IdCurso = IdCurso;
	}
	public Profesor getProfesor1() {
		return profesor1;
	}
	public void setProfesor1(Profesor profesor1) {
		this.profesor1 = profesor1;
	}

}
