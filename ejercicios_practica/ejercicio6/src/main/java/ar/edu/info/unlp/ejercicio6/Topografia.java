package ar.edu.info.unlp.ejercicio6;

public abstract class Topografia{
	
	public abstract double getProporcionAgua();

	public double getProporcionTierra(){
		return 1 - this.getProporcionAgua();
	}

	public abstract boolean isEqual(boolean b);
	public abstract boolean isEqual(boolean b);
	public abstract boolean isEqual(TopografiaMixta mixta);
	
}
