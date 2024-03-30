package ar.edu.info.unlp.ejercicio4;

public abstract class Empleado {
	
	public double sueldo() {
		double sueldoBasico = this.calcularBasico();
		double adicional = this.calcularAdicional();
		double descuento = this.calcularDescuento();
		
		return ((sueldoBasico + adicional) - descuento);
	}
	
	public abstract double calcularBasico();
	public abstract double calcularAdicional();
	
	public double calcularDescuento() {
		return (this.calcularBasico() * 0.13) + (this.calcularBasico() * 0.05);
	};
	
}
