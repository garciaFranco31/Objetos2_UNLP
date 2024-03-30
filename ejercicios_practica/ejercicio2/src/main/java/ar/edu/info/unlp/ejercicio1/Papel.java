package ar.edu.info.unlp.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Papel implements Jugada{
	public Papel(){

    }

    public String jugarContra(Jugada otraJugada){
        return otraJugada.jugarContraPapel();
    }

    public String jugarContraPapel(){
        return "Draw";
    }

    public String jugarContraPiedra(){
        return "Stone Wins";
    }

    public String jugarContraLagarto(){
        return "Lagarto Wins";
    }

    public String jugarContraSpock(){
        return "Paper Wins";
    }

    @Override
    public String jugarContraTijera() {
        return "Tijera Wins";
    }
}
