package ar.edu.info.unlp.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	Media media;
	
	public MediaPlayer(Media media) {
		this.media = media;
	}
	
	public Media getMedias(){
		return this.media;
	}
	
	public void setMedia(Media media) {
		this.media = media;
	}

}
