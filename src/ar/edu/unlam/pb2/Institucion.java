package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Institucion {
	
	private String nombre;
	private HashSet <Profesor> ListaProfesor ;
	private HashSet <Alumno> ListaAlumnos;
	private HashSet<Curso> ListaCurso;
	
	public Institucion(String nombre) {
		ListaAlumnos = new HashSet<Alumno>();
		ListaProfesor = new HashSet<Profesor>();
		ListaCurso = new HashSet<Curso>();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//CANTIDAD DE ALUMNOS REGGISTRADOS
	public Integer cantidadDeAlumnosRegistrados(){
		return ListaAlumnos.size();
	}
	//CANTIDAD DE PROFESORES REGISTRADOS
	public Integer cantidadDeProfesoresRegistrados(){
		return ListaProfesor.size();
	}
	//CANTIDAD DE CURSOS REGISTRADOS
	public Integer cantidadDeCursosRegistrados(){
		return ListaCurso.size();
		
	}
	
	
	//CANTIDAD DE DINERO GANADO POR CURSO
	public Double cantidadDeDineroGanadoEnCurso(Integer IdCurso){
		Double dinero = 0.0;
		for(Curso e: ListaCurso){
			if(e.getIdCurso().equals(IdCurso)){
			dinero=  e.cantidadDeDineroGanadoEnCurso();
			}
			
		}
		return dinero;
	}
	
	
	// CUENTO CANTIDAD DE CURSOS QUE ESTA UN ALUMNO
	
	public Integer cantidadDeCursosQueEstaElAlumno(Alumno alumno1){
		Integer contador=0;
		for(Curso i : ListaCurso){
			if(i.getListaAlumnoCurso().contains(alumno1)){
				contador++;
			}
		}
		return contador;
		
	}
	
	//Borro Alumno de Curso
	public Boolean eliminoAlumnoDeCurso(Integer dni, Integer IdCurso){
		Boolean asigno = false;
		for(Alumno e : ListaAlumnos){
			if(e.getDni().equals(dni)){
				for(Curso i : ListaCurso){
					if(i.getIdCurso().equals(IdCurso) && i.cantidadDeAlumnosEncurso()<=i.getCapacidad()){
						i.getListaAlumnoCurso().remove(e);
						asigno =  true;
						break;
					}	
				}
			}
			else{
				asigno =  false;
			}
		}
		return asigno;
		
	}
	
	
	//ASIGNO ALUMNO A CURSO
	
	public Boolean asignarAlumnoACurso(Integer dni, Integer IdCurso){
		Boolean asigno = false;
			for(Alumno e : ListaAlumnos){
				if(e.getDni().equals(dni) && e.getVip().equals(true)){
					for(Curso i : ListaCurso){
						if(i.getIdCurso().equals(IdCurso) && i.cantidadDeAlumnosEncurso()<=i.getCapacidad()){
							
							
							i.getListaAlumnoCurso().add(e);
							asigno =  true;
							break;
						}
						
						
					}
				}
				else{
					asigno =  false;
				}
			}
			return asigno;
	
	}
	
	
	//ASIGNO UN PROFESOR A CURSO	
	public Boolean asignarProfesorACurso(Integer dni, Integer IdCurso){
		Boolean asigno = false;
		for(Profesor e : ListaProfesor){
			if(e.getDni().equals(dni)){
				for(Curso i: ListaCurso){
					if(i.getIdCurso().equals(IdCurso)){
						i.setProfesor1(e);
						asigno =  true;
					}
				}
			}
			else{
				asigno =  false;
			}
		}
		return asigno;
	}
	
	
	
	
	
	//AGREGO CURSO
	public Boolean AgregoCurso(Curso curso1){
		
		return ListaCurso.add(curso1);
	}
	
	//ELIMINO CURSO
	public Boolean EliminoCurso(Integer IdCurso){
		Boolean elimino = false;
		for(Curso e: ListaCurso){
			if(e.getIdCurso().equals(IdCurso)){
				ListaCurso.remove(e);
				 elimino=true;
				 break;
			}else{
				elimino = false;
			}
	}
		return elimino;
}
	
//REGGISTRO PROFESOR
	public Boolean RegistrarProfesor(Profesor profesor){
		return ListaProfesor.add(profesor);	
	}
	
	
//REGISTRO ALUMNO
	public Boolean RegistrarAlumno(Alumno alumno){
		return ListaAlumnos.add(alumno);
	}
	
//ELIMINO ALUMNO
	public Boolean EliminarAlumno(Integer dni){
		Boolean elimino= false;
		for(Alumno e: ListaAlumnos){
		if(e.getDni().equals(dni)){
			ListaAlumnos.remove(e);
			elimino = true;
			break;
		}else{
			elimino = false;
		}
			}
		return elimino;
	}

	//ELIMINO PROFESOR
	public Boolean EliminarProfesor(Integer dni){
		
		Boolean elimino= false;
		for(Profesor e: ListaProfesor){
		if(e.getDni().equals(dni)){
			ListaProfesor.remove(e);
			elimino = true;
			break;
		}else{
			elimino = false;
		}
			}
		return elimino;
	}
	
	
	
	
	
	
	
	public HashSet<Profesor> getListaProfesor() {
		return ListaProfesor;
	}

	public void setListaProfesor(HashSet<Profesor> listaProfesor) {
		ListaProfesor = listaProfesor;
	}

	public HashSet<Alumno> getListaAlumnos() {
		return ListaAlumnos;
	}

	public void setListaAlumnos(HashSet<Alumno> listaAlumnos) {
		ListaAlumnos = listaAlumnos;
	}

	public HashSet<Curso> getListaCurso() {
		return ListaCurso;
	}

	public void setListaCurso(HashSet<Curso> listaCurso) {
		ListaCurso = listaCurso;
	}
	
	}

