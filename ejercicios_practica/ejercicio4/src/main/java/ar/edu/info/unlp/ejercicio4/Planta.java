package ar.edu.info.unlp.ejercicio4;

public class Planta extends EmpleadoFamiliar {
	private int antiguedad;
	
	public Planta(boolean estaCasado,int cantHijos, int antiguedad, double basico) {
		super(estaCasado, cantHijos, basico);
		this.antiguedad = antiguedad;
	}
	
	public double calcularBasico() {
		return 50000;
	}
	
	public double calcularAdicional() {
		return this.adicionalCasado(5000) + this.adicionalPorHijos(2000) + this.adicionalAntiguedad(2000);
	}
	
	public double adicionalAntiguedad(double montoPorAntiguedad) {
		return montoPorAntiguedad*this.antiguedad;
	}
	
	
			
	
}
