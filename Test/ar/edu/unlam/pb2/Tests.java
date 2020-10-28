package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void testQueAgregoRegistroAlumnoEnInstitucion() {
		Institucion inst1 = new Institucion("UNLAM");
		Alumno alumuno1 = new Alumno (33, "Gaston", "Santos", 33022376, 001, true);
		Alumno alumuno2 = new Alumno (21, "Pepe", "Rojas", 2344655, 002, true);
		Alumno alumuno3 = new Alumno (43, "Juan", "Cruz", 9878362, 003, true);
		Alumno alumuno4 = new Alumno (33, "Gaston", "Santos", 33022376, 001, true);
		inst1.RegistrarAlumno(alumuno1);
		inst1.RegistrarAlumno(alumuno2);
		inst1.RegistrarAlumno(alumuno3);
		inst1.RegistrarAlumno(alumuno4);
		Integer ve= 3;
		Integer vo= inst1.cantidadDeAlumnosRegistrados();
		assertEquals(ve, vo);	
	}
@Test
public void testQueAgregoAlumnoACurso(){
	Institucion inst1 = new Institucion("UNLAM");
	Alumno alumuno1 = new Alumno (33, "Gaston", "Santos", 001, 33022376, true);
	Alumno alumuno2 = new Alumno (21, "Pepe", "Rojas", 002,330223678, true);
	Profesor prof1 = new Profesor (65, "JUlio", "Historia",500.0 , 005, 11547874);
	Curso curso1 = new Teorico(200.0, 451, prof1, 4);
	inst1.AgregoCurso(curso1);
	
	inst1.RegistrarAlumno(alumuno1);
	inst1.RegistrarAlumno(alumuno2);
	inst1.asignarAlumnoACurso(33022376, 451);
	inst1.asignarAlumnoACurso(330223678, 451);
	Integer ve= 2;
	Integer vo=curso1.cantidadDeAlumnosEncurso();
	assertEquals(ve, vo);
	
}

@Test
public void testueCuentoCantidadDeCursosEnLosCualesEstaUnAlumno(){
	Institucion inst1 = new Institucion("UNLAM");
	Alumno alumuno1 = new Alumno (33, "Gaston", "Santos", 001, 33022376, true);
	Profesor prof1 = new Profesor (65, "JUlio", "Historia",500.0 , 005, 11547874);
	Curso curso1 = new Teorico(200.0, 451, prof1, 4);
	Curso curso2 = new Practico(200.0, 452, prof1, 4);
	inst1.AgregoCurso(curso1);
	inst1.AgregoCurso(curso2);
	inst1.RegistrarAlumno(alumuno1);
	inst1.asignarAlumnoACurso(33022376, 451);
	inst1.asignarAlumnoACurso(33022376, 452);
	Integer ve= 2;
	Integer vo= inst1.cantidadDeCursosQueEstaElAlumno(alumuno1);
	assertEquals(ve, vo);
	
	
	
}
	
	
}
