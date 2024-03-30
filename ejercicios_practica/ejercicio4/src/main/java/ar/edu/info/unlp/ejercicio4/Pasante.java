package ar.edu.info.unlp.ejercicio4;

public class Pasante extends Empleado{
	private int cantExamenes;
	
	public Pasante(int cantExamenes) {
		this.cantExamenes = cantExamenes;
	}
	
	public double calcularBasico() {
		return 20000;
	}
	
	public double calcularAdicional() {
		return (2000*this.cantExamenes);
	}
}
