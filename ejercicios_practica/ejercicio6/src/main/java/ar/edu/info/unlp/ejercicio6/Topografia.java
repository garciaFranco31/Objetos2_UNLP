package ar.edu.info.unlp.ejercicio5;

public abstract class Topografia{
	
	public abstract double getProporcionAgua();

	public double getProporcionTierra(){
		return 1 - this.getProporcionAgua();
	}

	public abstract boolean isEqual(Tiera tierra);
	public abstract boolean isEqual(Agua agua);
	public abstract boolean isEqual(TopografiaMixta mixta);
	
}
