package ar.edu.info.unlp.ejercicio4;

public abstract class EmpleadoFamiliar extends Empleado {
	private int cantHijos;
	private boolean estaCasado;
	private double basico;
	
	public EmpleadoFamiliar(boolean estaCasado, int cantHijos, double basico) {
		this.estaCasado = estaCasado;
		this.cantHijos = cantHijos;
		this.basico = basico;
	}
	
	@Override
	public double calcularBasico() {
		return this.basico + this.calcularAdicional();
	}
	
	
	public double adicionalPorHijos(double montoHijos) {
		return (montoHijos * this.cantHijos);
	}
	
	public double adicionalCasado(double montoPorCasado) {
		double addCasado = 0;
		if (this.estaCasado) {
			addCasado = montoPorCasado;
		}
		return addCasado;
	}


}
