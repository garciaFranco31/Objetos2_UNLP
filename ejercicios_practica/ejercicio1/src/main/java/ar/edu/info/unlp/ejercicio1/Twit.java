package ar.edu.info.unlp.ejercicio1;

public class Twit implements Publication {
	public String text;

    public Twit(String text) {
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    //this can be an empty text?
    public void delete() {
        this.setText("No available");
    }
}
