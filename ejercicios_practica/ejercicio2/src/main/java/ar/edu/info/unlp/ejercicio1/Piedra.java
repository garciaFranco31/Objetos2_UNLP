package ar.edu.info.unlp.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Piedra implements Jugada{
	public Piedra(){

    }

    @Override
    public String jugarContra(Jugada otraJugada) {
        return otraJugada.jugarContraPiedra();
    }

    @Override
    public String jugarContraLagarto() {
        return "Stone Wins";
    }

    @Override
    public String jugarContraPapel() {
        return "Paper wins";
    }

    @Override
    public String jugarContraPiedra() {
        return "Draw";
    }

    @Override
    public String jugarContraSpock() {
        return "Spock Wins";
    }

    @Override
    public String jugarContraTijera() {
        return "Stone Wins";
    }
}
