package ar.edu.info.unlp.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	public Empleado pasante;
	public EmpleadoFamiliar planta;
	public EmpleadoFamiliar temporario;
	
	@BeforeEach
	void SetUp() throws Exception{
		pasante = new Pasante(4);
		planta = new Planta(false, 2, 10, 50000);
		temporario = new Temporario(true, 1, 20, 20000);
	}
	
	@Test
	void testCalcularSueldo() {
		double sueldoPasante = pasante.sueldo();
		double sueldoPlanta = planta.sueldo();
		double sueldoTemporario = temporario.sueldo();
		
		assertEquals(24400, sueldoPasante);
		assertEquals(65000, sueldoPlanta);
		assertEquals(29140, sueldoTemporario);
	}
}
