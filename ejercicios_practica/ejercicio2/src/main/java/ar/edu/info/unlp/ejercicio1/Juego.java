package ar.edu.info.unlp.ejercicio1;

public class Juego {
	public Juego(){

    }

    public String jugarpartido(Jugada jugada,  Jugada otraJugada){
        return jugada.jugarContra(otraJugada);
    }
}
