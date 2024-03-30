package ar.edu.info.unlp.ejercicio5;

public class VideoStreamAdapter extends Media {
	private VideoStream adaptee;
	
	public String play() {
		return adaptee.reproduce();
	}
	
}
