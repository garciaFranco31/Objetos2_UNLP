package ar.edu.info.unlp.ejercicio4;

public class Temporario extends EmpleadoFamiliar {
	private int cantHoras;
	
	public Temporario(boolean estaCasado, int cantHijos, int cantHoras, double basico) {
		super(estaCasado, cantHijos, basico);
		this.cantHoras = cantHoras;
	}
	
	public double calcularBasico(int cantHoras) {
		return 20000 + this.basicoPorHora();
	}
	
	public double calcularAdicional() {
		return this.adicionalCasado(5000) + this.adicionalPorHijos(2000);
	}
	
	public double basicoPorHora() {
		double montoHoras = 300;
		return this.cantHoras * montoHoras; 
	}
	
	
}
